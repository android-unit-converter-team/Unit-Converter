package com.example.unitconverter;

public class Weight {
    private float weight;

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float convertKilogramToGram(){
        return weight / 1000;
    }

    public float ConvertKilogramToTonne(){
        return weight / 1000;
    }

    public float ConvertMilligramToGram(){
        return weight / 1000;
    }

    public float convertMilligramToKilogram(){
        return  weight * 1e-6f;
    }

    public float convertMilligramToPound(){
        return weight * 2.20462e-6f;
    }

    public float convertMilligramToOunce(){
        return weight * 3.5274e-5f;
    }

    public float convertPoundToMilligram(){
        return weight / 2.20462e-6f;
    }

    public float convertOunceToMilligram(){
        return weight / 3.5274e-5f;
    }

    public float convertGramToKilogram(){
        return weight / 1000f;
    }

    public float convertGramToTonne(){
        return weight * 1e-6f;
    }

    public float convertGramToPound(){
        return weight * 0.00220462f;
    }

    public float convertGramToOunce(){
        return weight * 0.035274f;
    }

    public float convertTonneToGram(){
        return weight / 1e-6f;
    }

    public float convertPoundToGram(){
        return weight / 0.00220462f;
    }

    public float convertOunceToGram(){
        return weight / 0.035274f;
    }

    public float ConvertTonneToKilogram(){
        return weight * 1000;
    }

    public float ConvertGramToMilligram(){
        return  weight * 1000;
    }

    public float convertKilogramToMilligram(){
        return convertGramToKilogram() * 1000;
    }

    public  float convertKilogramToTonne(){
        return weight * 0.001f;
    }

    public  float convertTonneToKilogram(){
        return weight / 0.001f;
    }

    public float ConvertTonneToGram(){
        return convertGramToKilogram() * 1000;
    }

    public float convertTonneToPound(){
        return weight * 2204.62f;
    }

    public float convertTonneToOunce(){
        return weight * 35274f;
    }

    public float convertPoundToTonne(){
        return weight / 2204.62f;
    }

    public float convertOunceToTonne(){
        return weight / 35274f;
    }

    public float convertMiligramToKilogram(){
        return convertKilogramToGram() / 1000;
    }

    public float ConvertGramToTonne(){
        return  convertKilogramToGram() / 1000;
    };
    public float convertTonneToMilligram(){
        return convertKilogramToMilligram() * 1000;
    }

    public float convertMilligramToTonne(){
        return convertKilogramToMilligram() / 1000;
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
