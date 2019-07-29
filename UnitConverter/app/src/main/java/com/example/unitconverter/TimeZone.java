package com.example.unitconverter;

public class TimeZone {
    private float time ;

    public float gettime() {
        return time;
    }

    public void settime(float time) {
        this.time = time ;
    }

    public float convertnewyorktimetolondontime(){ return time + 5.0f ; }

    public float convertlondontimetonewyork(){ return time - 5.0f ; }

    public float convertlondontimetocairotime(){
        return time + 1.0f ;
    }

    public float convertcairotimetolondontime(){
        return time - 1.0f ;
    }

    public float convertnewyorktimetocairotime(){
        return time + 6.0f ;
    }

    public float convertcairotimetonewyorktime(){
        return time - 6.0f ;
    }

    public float convertcairotomoscow(){
        return time + 1.0f  ;
    }

    public float convertmoscowtocairo(){
        return time - 1.0f  ;
    }

    public float convertlondontomoscow(){
        return time + 2.0f  ;
    }

    public float convertmoscowtolondon(){ return time - 2.0f ; }

    public float convertnewyorktomoscow(){
        return time + 7.0f  ;
    }

    public float convertmoscowtonewyork(){
        return time - 7.0f  ;
    }



}
