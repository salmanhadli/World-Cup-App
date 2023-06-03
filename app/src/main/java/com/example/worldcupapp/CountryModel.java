package com.example.worldcupapp;

public class CountryModel {
    private String countryName;
    private int cupWinCount, countryFlagImage;

    public CountryModel(String countryName, int cupWinCount, int countryFlagImage) {
        this.countryName = countryName;
        this.cupWinCount = cupWinCount;
        this.countryFlagImage = countryFlagImage;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public int getCupWinCount() {
        return cupWinCount;
    }

    public void setCupWinCount(int cupWinCount) {
        this.cupWinCount = cupWinCount;
    }

    public int getCountryFlagImage() {
        return countryFlagImage;
    }

    public void setCountryFlagImage(int countryFlagImage) {
        this.countryFlagImage = countryFlagImage;
    }
}
