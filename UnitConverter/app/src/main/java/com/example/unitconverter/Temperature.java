package com.example.unitconverter;

public class Temperature {
    private float temprature;

    public float getTemperature() {
        return temprature;
    }

    public void setTemperature(float temprature) {
        this.temprature = temprature;
    }

    public float convertFahrenheitToCelsius(){
        return((temprature - 32) * 5 / 9);
    }

    public float convertCelsiusToFahrenheit(){
        return ((temprature * 9) / 5) + 32;
    }

    public float convertCelsiusToKelvin(){
        return (float) (temprature + 273.15);
    }

    public float convertKelvinToCelsius(){
        return (float) (temprature - 273.15);
    }

    public float convertFahrenheitToKelvin(){
        return (float) (convertFahrenheitToCelsius() + 273.15);
    }

    public float convertKelvinToFahrenheit(){
        return (float) (convertCelsiusToFahrenheit() - 273.15);
    }

    public  float convertrankineToFahrenheit()
    {
        return  (float) temprature * -458.67f;
    }

    public  float convertFahrenheitTorankine()
    {
        return  (float) temprature / -458.67f;
    }

    public  float convertcelsiusTorankine()
    {
        return  (float) temprature / -272.594f;
    }

    public  float convertrankineTocelsius()
    {
        return  (float) temprature * -272.594f;
    }

    public  float convertkelvinTorankine()
    {
        return  (float) temprature / 0.555556f;
    }

    public  float convertrankineTokelvin()
    {
        return  (float) temprature * 0.555556f;
    }
}
