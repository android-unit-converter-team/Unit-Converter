package com.example.unitconverter;

public class Weight {
    private float weight;

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float convertKilogrammToGramOrConvertKilogrammToTonneOrConvertMilligramToGram(){
        return weight / 1000;
    }

    public float convertGramToKilogrammOrConvertTonneToKilogrammOrConvertGramToMilligram(){
        return weight * 1000;
    }

    public float convertKilogramToMilligramOrConvertTonneToGram(){
        return convertGramToKilogrammOrConvertTonneToKilogrammOrConvertGramToMilligram() * 1000;
    }

    public float convertMiligramToKilogramOrConvertGramToTonne(){
        return convertKilogrammToGramOrConvertKilogrammToTonneOrConvertMilligramToGram() / 1000;
    }

    public float convertTonneToMilligram(){
        return convertKilogramToMilligramOrConvertTonneToGram() * 1000;
    }

    public float convertMilligramToTonne(){
        return convertMiligramToKilogramOrConvertGramToTonne() / 1000;
    }

    public float convertKilogramToPound(){
        return (float) (weight * 2.20462);
    }

    public float convertPoundToKilogram(){
        return (float) (weight / 2.20462);
    }

    public float convertKilogramToOunce(){
        return (float) (weight * 35.247);
    }

    public float convertOunceToKilogram(){
        return (float) (weight / 35.247);
    }

    public float convertOunceToPound(){
        return weight * 16;
    }

    public float convertPoundToOunce(){
        return weight / 16;
    }
}
