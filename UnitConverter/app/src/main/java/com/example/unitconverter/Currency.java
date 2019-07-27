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
    public double changeEGPtoUSD()
    {
        return currency*16.62;
    }

    public double changeEGPtoEUR()
    {
        return currency*18.65;
    }

    public double changeEGPtoGBP()
    {
        return currency*20.78;
    }


    // change from USD
    public double changeUSDtoEGP()
    {
        return currency/16.62 ;
    }

    public double changeUSDtoEUR()
    {
        return currency*0.891213 ;
    }

    public double changeUSDtoGBP()
    {
        return currency*0.799977 ;
    }


    // change from EUR

    public double changeEURtoEGP()
    {
        return currency/18.65;
    }

    public double changeEURtoUSD()
    {
        return currency/0.891213;
    }

    public double changeEURtoGBP()
    {
        return currency*0.897676;
    }


    // change from GBP

    public double changeGBPtoEGP()
    {
        return currency/20.78 ;
    }

    public double changeGBPtoUSD()
    {
        return currency/0.799977;
    }

    public double changeGBPtoEUR()
    {
        return currency/0.897676 ;
    }

}
