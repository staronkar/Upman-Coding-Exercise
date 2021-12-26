package com.accuweather.api.test;

import com.accuweather.api.ApiResponse;
import exception.OutOfRangeException;
import org.testng.Assert;
import org.testng.annotations.Test;
import ui.UiResponse;
import utils.TemperatureVariance;

/**
 * Created by Onkar Anand
 * Date 26-12-2012
 */
public class VarianceTest {
    UiResponse uiResponse = new UiResponse();

    @Test
    void varianceTemperatureTest() throws InterruptedException, OutOfRangeException {
        TemperatureVariance temperatureVariance = new TemperatureVariance();
        boolean variance = temperatureVariance.tempVariance(ApiResponse.getCityTemperature(), uiResponse.getCityTemperature());
        Assert.assertEquals(variance, true, "Temperature from API and UI sources are within Variance Range");
    }
}
