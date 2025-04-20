package com.cts.spring.springcore.properties;

import java.util.Properties;

public class Countries {
	private Properties countriesandLanguages;

	public Properties getCountriesandLanguages() {
		return countriesandLanguages;
	}

	public void setCountriesandLanguages(Properties countriesandLanguages) {
		this.countriesandLanguages = countriesandLanguages;
	}

	@Override
	public String toString() {
		return "Countries [countriesandLanguages=" + countriesandLanguages + "]";
	}
	
	
}
