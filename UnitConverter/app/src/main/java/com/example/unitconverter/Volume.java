package com.example.unitconverter;

public class Volume {
    private float volume ;

    public float getvolume() {
        return volume;
    }

    public void setvolume(float volume) {
        this.volume = volume ;
    }

    public float convertCubicmeterToLitres(){
        return volume * 1000;
    }

    public float convertCubicmetertoCubicCentimetre(){
        return volume * 1000000;
    }

    public float convertCubicCentimetreToCubicmeter(){
        return volume / 1000000f;
    }

    public float convertLitreToCubicmeter(){
        return volume / 1000;
    }

    public float convertLitreToCubicCentimeter(){
        return volume * 1000 ;
    }

    public float convertCubicCentimeterToLitre(){
        return volume / 1000;
    }

    public float convertMegaLitreToCubicmeter(){
        return volume * 1000;
    }

    public float convertCubicCentimetreToMegaLiter(){
        return volume * 1e-9f;
    }

    public float convertLiterToMegaLiter(){
        return  volume * 1e-6f;
    }

    public float convertMegaLiterToLiter(){
        return  volume / 1e-6f;
    }

    public float convertMegaLiterToCubicCentimetre(){
        return volume / 1e-9f;
    }

    public float convertCubicmeterToMegaLitre(){
        return volume / 1000;
    }

    public float convertCubicmeterToMilileter(){
        return volume * 1000000;
    }

    public float convertMiliLeterToCubicmeter(){
        return volume / 1000000;
    }

}
