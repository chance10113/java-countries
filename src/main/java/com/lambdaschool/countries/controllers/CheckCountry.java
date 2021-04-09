package com.lambdaschool.countries.controllers;


import com.lambdaschool.countries.models.Country;

@FunctionalInterface
public interface CheckCountry {
    boolean test(Country country);
}


