package com.example.unitconverter;

public class Length {
    private float length;

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float convertKilometreToMetre(){
        return length * 1000;
    }

    public float ConvertMetreToMillimetre(){
        return length * 1000;
    }

    public float convertMetreToKilometre(){
        return length / 1000;
    }

    public float ConvertMillimetreToMetre(){
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

    public float convertCentimetreToMetre(){
        return length / 100;
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

    public float convertMillimeterToCentimeter(){
        return (length * 0.1f);
    }

    public float convertCentimeterToMillimeter(){
        return (length / 0.1f);
    }

    public float convertMillimeterTOFoot(){
        return length * 0.00328084f;
    }

    public float convertFootToMillimeter(){
        return length / 0.00328084f;
    }

    public float convertMillimeterToInch(){
        return length * 0.0393701f;
    }

    public float convertInchToMilliMeter(){
        return length / 0.0393701f;
    }

    public float convertCentimetreToFoot(){
        return  length * 0.0328084f;
    }

    public float convertFootToCentimetre(){
        return length / 0.0328084f;
    }

    public float convertCentiMetreToInch(){
        return length * 0.393701f;
    }

    public float convertInchToCentimetre(){
        return length / 0.393701f;
    }

    public float convertKilometreToFoot(){
        return  length * 3280.84f;
    }

    public float convertFootToKilometre(){
        return  length / 3280.84f;
    }

    public float convertKilometreToInch(){
        return  length * 39370.1f;
    }

    public float convertInchToKilometre(){
        return  length * 39370.1f;
    }

    public float convertFootToInch(){
        return  length * 12f;
    }

    public float convertInchToFoot(){
        return  length / 12f;
    }
}
