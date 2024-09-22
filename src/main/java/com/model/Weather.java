//package com.model;
//
//
//import jakarta.persistence.*;
//
//@Entity
//@Table(name = "weather_observations")
//public class Weather {
//
//
//    @Id
//    @Column(name = "id")
//    private Long id;
//
//    @Column(name = "station_id")
//    private String stationId;
//
//    @Column(name = "station_name")
//    private String stationName;
//
//    @Column(name = "date")
//    private String date;
//
//    @Column(name = "average_wind_speed")
//    private Double averageWindSpeed;
//
//    @Column(name = "precipitation")
//    private Double precipitation;
//
//    @Column(name = "snow_depth")
//    private Double snowDepth;
//
//    @Column(name = "snowfall")
//    private Double snowfall;
//
//    @Column(name = "max_temperature")
//    private Long maxTemperature;
//
//    @Column(name = "min_temperature")
//    private Long minTemperature;
//
//
//
//    public Long getMaxTemperature() {
//        return maxTemperature;
//    }
//
//    public void setMaxTemperature(Long maxTemperature) {
//        this.maxTemperature = maxTemperature;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getStationId() {
//        return stationId;
//    }
//
//    public void setStationId(String stationId) {
//        this.stationId = stationId;
//    }
//
//    public String getStationName() {
//        return stationName;
//    }
//
//    public void setStationName(String stationName) {
//        this.stationName = stationName;
//    }
//
//    public String getDate() {
//        return date;
//    }
//
//    public void setDate(String date) {
//        this.date = date;
//    }
//
//    public Double getAverageWindSpeed() {
//        return averageWindSpeed;
//    }
//
//    public void setAverageWindSpeed(Double averageWindSpeed) {
//        this.averageWindSpeed = averageWindSpeed;
//    }
//
//    public Double getPrecipitation() {
//        return precipitation;
//    }
//
//    public void setPrecipitation(Double precipitation) {
//        this.precipitation = precipitation;
//    }
//
//    public Double getSnowDepth() {
//        return snowDepth;
//    }
//
//    public void setSnowDepth(Double snowDepth) {
//        this.snowDepth = snowDepth;
//    }
//
//    public Double getSnowfall() {
//        return snowfall;
//    }
//
//    public void setSnowfall(Double snowfall) {
//        this.snowfall = snowfall;
//    }
//
//    public Long getMinTemperature() {
//        return minTemperature;
//    }
//
//    public void setMinTemperature(Long minTemperature) {
//        this.minTemperature = minTemperature;
//    }
//}
