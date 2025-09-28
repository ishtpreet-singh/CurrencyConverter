package org.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CurrencyDao {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/currency_converter_db";
    private static final String USER = "appuser";
    private static final String PASS = "your_strong_password_here";

    public List<Currency> getAllCurrencies() {
        List<Currency> currencies = new ArrayList<>();
        String sql = "SELECT abbreviation, name, rate_to_usd FROM currencies";

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                currencies.add(new Currency(
                        rs.getString("abbreviation"),
                        rs.getString("name"),
                        rs.getDouble("rate_to_usd")
                ));
            }
        } catch (SQLException e) {
            System.err.println("Database connection error: " + e.getMessage());
            e.printStackTrace();
        }
        return currencies;
    }
}