package model.weather;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonProperty;

public class CurrentUnits {
    private String time;
    private String interval;

    @JsonProperty("temperature_2m")
    private String temperature2m;

    private String rain;

    @JsonProperty("is_day")
    private String isDay;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getInterval() {
        return interval;
    }

    public void setInterval(String interval) {
        this.interval = interval;
    }

    public String getTemperature2m() {
        return temperature2m;
    }

    public void setTemperature2m(String temperature2m) {
        this.temperature2m = temperature2m;
    }

    public String getRain() {
        return rain;
    }

    public void setRain(String rain) {
        this.rain = rain;
    }

    public String getIsDay() {
        return isDay;
    }

    public void setIsDay(String isDay) {
        this.isDay = isDay;
    }
}
