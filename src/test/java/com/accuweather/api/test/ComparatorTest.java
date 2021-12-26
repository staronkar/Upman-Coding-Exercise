package com.accuweather.api.test;

import com.accuweather.api.ApiResponse;
import org.testng.Assert;
import org.testng.annotations.Test;
import ui.UiResponse;
import utils.TemperatureComparator;

/**
 * Created by Onkar Anand
 * Date 26-12-2012
 */
public class ComparatorTest {
    UiResponse uiResponse = new UiResponse();

    @Test
    void compareTemperaturesTest() throws InterruptedException {
        TemperatureComparator comparator = new TemperatureComparator();
        Assert
                .assertEquals
                        (comparator.compare
                                        ((int) Math.round(ApiResponse.getCityTemperature()), uiResponse.getCityTemperature()),
                                0, "Temperature by API and UI source are same.");

    }
}
