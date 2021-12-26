package com.accuweather.api;

import com.accuweather.api.helpers.CityServiceHelper;

/**
 * Created by Onkar Anand
 * Date 26-12-2012
 * Returns api response in Celsius format.
 */
public class ApiResponse {
    public static double getCityTemperature() {
        CityServiceHelper cityServiceHelper = new CityServiceHelper();
        return (cityServiceHelper.getCityTemperature() - 273.15);
    }
}
