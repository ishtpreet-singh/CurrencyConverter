package org.example;

public class Currency {
    private final String abbreviation;
    private final String name;
    private final double rateToUsd;

    public Currency(String abbreviation, String name, double rateToUsd) {
        this.abbreviation = abbreviation;
        this.name = name;
        this.rateToUsd = rateToUsd;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public String getName() {
        return name;
    }

    public double getRateToUsd() {
        return rateToUsd;
    }

    @Override
    public String toString() {
        return String.format("Currency [Code: %s, Name: %s, Rate: %.4f]", abbreviation, name, rateToUsd);
    }
}