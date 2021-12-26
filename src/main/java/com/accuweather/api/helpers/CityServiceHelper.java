package com.accuweather.api.helpers;

import com.accuweather.api.model.City;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import utils.ConfigManager;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Onkar Anand
 * Date 26-12-2012
 * Returns the api response
 */
public class CityServiceHelper {
    private static final String BASE_URL = ConfigManager.getInstance().getString("base_url");
    private static final Map<String, String> queryMap = new HashMap();

    public CityServiceHelper() {
        RestAssured.baseURI = BASE_URL;
    }

    public Double getCityTemperature() {
        queryMap.put("q", ConfigManager.getInstance().getString("city_name"));
        queryMap.put("appid", ConfigManager.getInstance().getString("token"));

        Response response = RestAssured
                .given()
                .queryParams(queryMap)
                .get()
                .andReturn();
        return response.getBody().as(City.class).getMain().getTemp();
    }
}
