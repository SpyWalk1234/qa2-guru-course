package model.weather;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonProperty;

public class Current {
    private String time;
    private int interval;

    @JsonProperty("temperature_2m")
    private double temperature2m;

    private double rain;

    @JsonProperty("is_day")
    private int isDay;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getInterval() {
        return interval;
    }

    public void setInterval(int interval) {
        this.interval = interval;
    }

    public double getTemperature2m() {
        return temperature2m;
    }

    public void setTemperature2m(double temperature2m) {
        this.temperature2m = temperature2m;
    }

    public double getRain() {
        return rain;
    }

    public void setRain(double rain) {
        this.rain = rain;
    }

    public int getIsDay() {
        return isDay;
    }

    public void setIsDay(int isDay) {
        this.isDay = isDay;
    }
}
