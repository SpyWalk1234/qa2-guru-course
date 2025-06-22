package model.weather;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonProperty;

public class DailyUnits {
    private String time;
    private String sunrise;
    private String sunset;

    @JsonProperty("temperature_2m_max")
    private String temperature2mMax;

    @JsonProperty("temperature_2m_min")
    private String temperature2mMin;

    @JsonProperty("daylight_duration")
    private String daylightDuration;

    @JsonProperty("rain_sum")
    private String rainSum;

    @JsonProperty("wind_speed_10m_max")
    private String windSpeed10mMax;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getSunrise() {
        return sunrise;
    }

    public void setSunrise(String sunrise) {
        this.sunrise = sunrise;
    }

    public String getSunset() {
        return sunset;
    }

    public void setSunset(String sunset) {
        this.sunset = sunset;
    }

    public String getTemperature2mMax() {
        return temperature2mMax;
    }

    public void setTemperature2mMax(String temperature2mMax) {
        this.temperature2mMax = temperature2mMax;
    }

    public String getTemperature2mMin() {
        return temperature2mMin;
    }

    public void setTemperature2mMin(String temperature2mMin) {
        this.temperature2mMin = temperature2mMin;
    }

    public String getDaylightDuration() {
        return daylightDuration;
    }

    public void setDaylightDuration(String daylightDuration) {
        this.daylightDuration = daylightDuration;
    }

    public String getRainSum() {
        return rainSum;
    }

    public void setRainSum(String rainSum) {
        this.rainSum = rainSum;
    }

    public String getWindSpeed10mMax() {
        return windSpeed10mMax;
    }

    public void setWindSpeed10mMax(String windSpeed10mMax) {
        this.windSpeed10mMax = windSpeed10mMax;
    }
}
