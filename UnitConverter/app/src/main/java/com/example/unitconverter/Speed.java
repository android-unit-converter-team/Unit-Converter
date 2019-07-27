package com.example.unitconverter;

public class Speed {

    private float speed ;

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    // converting from m/s
    public double converMETER_SECtoKILOMETER_HOUR()
    {
        return (speed*3600)/1000;
    }

    public double convertMETER_SECtoMILE_HOUR()
    {
        return (speed*3600)/1000;
    }

    public double convertMETER_SECtoFEET_MIN()
    {
        return (speed*(3.281*60)) ;
    }

    // converting from km/h
    public double convertKILOMETER_HOURtoMETER_SEC()
    {
        return (speed*1000)/3600;
    }

    public double convertKIlOMETER_HOURtoMILE_HOUR()
    {
        return (speed*1.609);
    }

    public double convertKIlOMETER_HOURtoFEET_MIN()
    {
        return (speed*3280.8399)/60;
    }

    // converting from mi/h
    public double convertMILE_HOURtoMETER_SEC()
    {
        return (speed*1000)/3600;
    }

    public double convertMILE_HOURtoKILOMETER_HOUR()
    {
        return (speed/1.609);
    }

    public double convertMILE_HOURtoFEET_MIN()
    {
        return (speed*5280)/60 ;
    }

    // converting from ft/min
    public double convertFEET_MINtoMETER_SEC()
    {
        return (speed/(3.281*60)) ;
    }

    public double convertFEET_MINtoKILOMETER_HOUR()
    {
        return (speed*60)/3280.8399 ;
    }

    public double convertFEET_MINtoMILE_HOUR()
    {
        return (speed*60)/5280 ;
    }

}
