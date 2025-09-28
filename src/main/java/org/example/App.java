package org.example;

import java.util.List;

public class App {
    public static void main(String[] args) {
        System.out.println("--- Currency Converter Application ---");

        CurrencyDao currencyDao = new CurrencyDao();
        List<Currency> currencyList = currencyDao.getAllCurrencies();

        System.out.println("Fetching all currencies from the database...");
        for (Currency currency : currencyList) {
            System.out.println(currency.toString());
        }
    }
}