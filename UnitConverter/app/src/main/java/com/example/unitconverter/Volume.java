package com.example.unitconverter;

public class Volume {
    private float volume ;

    public float getvolume() {
        return volume;
    }

    public void setvolume(float volume) {
        this.volume = volume ;
    }

    public float convertcubicmetertolitres(){
        return volume * 1000;
    }

    public float convertlitretocubicmeter(){
        return volume / 1000;
    }

    public float convertlitretocubiccentimeter(){
        return volume * 1000 ;
    }

    public float convertcubiccentimetertolitre(){
        return volume / 1000;
    }

    public float convertmegalitretocubicmeter(){
        return volume * 1000;
    }

    public float convertcubicmetertomegalitre(){
        return volume / 1000;
    }

    public float convertcubicmetertomilileter(){
        return volume * 1000000;
    }

    public float convertmililetertocubicmeter(){
        return volume / 1000000;
    }

}
