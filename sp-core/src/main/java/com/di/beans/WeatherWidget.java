package com.di.beans;

public class WeatherWidget {
    private IWeatherFinder weatherFinder;
    public void showWeather(String zipcode){
        double temperature = 0.0;

        temperature = weatherFinder.getWeather(zipcode);
        System.out.println("temp : "+temperature + "for zipcode : " + zipcode);
    }

    public void setWeatherFinder(IWeatherFinder weatherFinder) {
        System.out.println("setWeatherFinder(weatherFinder)");
        this.weatherFinder = weatherFinder;
    }
}
