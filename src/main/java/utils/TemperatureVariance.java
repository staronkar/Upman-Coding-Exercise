package utils;

import exception.OutOfRangeException;

/**
 * Created by Onkar Anand
 * Date 26-12-2012
 *
 */
public class TemperatureVariance {

    public boolean tempVariance(Double api_temp, int ui_temp) throws OutOfRangeException {
        if ((int) Math.floor(api_temp) == ui_temp || (int) Math.ceil(api_temp) == ui_temp)
            return true;
        else
            throw new OutOfRangeException("Temperature difference between API and UI sources is out of specified range");
    }
}
