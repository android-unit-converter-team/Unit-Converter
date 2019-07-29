package com.example.unitconverter;

public class Currency {
    private float currency ;

    public float getCurrency() {
        return currency;
    }

    public void setCurrency(float currency) {
        this.currency = currency;
    }


    // change from EGP
    public float changeEGPtoUSD()
    {
        return currency/16.62f;
    }

    public float changeEGPtoEUR()
    {
        return currency/18.65f;
    }

    public float changeEGPtoGBP()
    {
        return currency/20.78f;
    }


    // change from USD
    public float changeUSDtoEGP()
    {
        return currency*16.62f ;
    }

    public float changeUSDtoEUR()
    {
        return currency*0.891213f ;
    }

    public float changeUSDtoGBP()
    {
        return currency*0.799977f ;
    }


    // change from EUR

    public float changeEURtoEGP()
    {
        return currency * 18.65f;
    }

    public float changeEURtoUSD()
    {
        return currency/0.891213f;
    }

    public float changeEURtoGBP()
    {
        return currency*0.897676f;
    }


    // change from GBP

    public float changeGBPtoEGP()
    {
        return currency*20.78f ;
    }

    public float changeGBPtoUSD()
    {
        return currency/0.799977f;
    }

    public float changeGBPtoEUR()
    {
        return currency/0.897676f ;
    }

}
