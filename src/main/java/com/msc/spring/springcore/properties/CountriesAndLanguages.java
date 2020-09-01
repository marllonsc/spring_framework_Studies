package com.msc.spring.springcore.properties;

import java.util.Properties;

public class CountriesAndLanguages {

    private Properties countryAndLangs;

    public CountriesAndLanguages(){}

    public CountriesAndLanguages(Properties countryAndLangs) {
        this.countryAndLangs = countryAndLangs;
    }

    public Properties getCountryAndLangs() {
        return countryAndLangs;
    }

    public void setCountryAndLangs(Properties countryAndLangs) {
        this.countryAndLangs = countryAndLangs;
    }

}
