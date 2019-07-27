package com.example.unitconverter;

public class Length {
    private float length;

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float convertKilometreToMetreOrConvertMetreToMillimetre(){
        return length * 1000;
    }

    public float convertMetreToKilometreOrConvertMillimetreToMetre(){
        return length / 1000;
    }

    public float convertKilometreToCentimetre(){
        return length * 100000;
    }

    public float convertCentimetreToKilometre(){
        return length / 100000;
    }

    public float convertKilometreToMillimetre(){
        return length * 1000000;
    }

    public float convertMillimetreToKilometre(){
        return length / 1000000;
    }

    public float convertMetreToCentimetre(){
        return length * 100;
    }

    public float convertCentietreToMetre(){
        return length / 100;
    }

    public float convertMileToMetre(){
        return (float) (length * 1609.344);
    }

    public float convertMetreToMile(){
        return (float) (length / 1609.344);
    }

    public float convertMetreToFoot(){
        return (float) (length * 3.281);
    }

    public float convertFootToMetre(){
        return (float) (length / 3.281);
    }

    public float convertMetreToInch(){
        return (float) (length * 39.37);
    }

    public float convertInchToMetre(){
        return (float) (length / 39.37);
    }
}
