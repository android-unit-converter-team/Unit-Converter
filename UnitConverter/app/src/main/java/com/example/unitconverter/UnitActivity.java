package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;

public class UnitActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit);
        TextView textView = (TextView) findViewById(R.id.unitView);
        Bundle extras = getIntent().getExtras();
        final String view = extras.getString("View");
        textView.setText(view);
        Button backBtn = (Button) findViewById(R.id.backBtn);
        final TextView toText = (TextView) findViewById(R.id.toView);
        final EditText fromText = (EditText) findViewById(R.id.fromText);
        final Spinner fromSpin = (Spinner) findViewById(R.id.fromSpinner);
        final Spinner toSpin = (Spinner) findViewById(R.id.toSpinner);
        Button convertBtn = (Button) findViewById(R.id.convetrtBtn);
        backBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                finish();
            }
        });

        if(view.equalsIgnoreCase("Temperature"))
        {
            String str[] = {"Fahrenheit", "Celsius", "Kelvin", "Rankine"};

            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, str);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            toSpin.setAdapter(adapter);
            fromSpin.setAdapter(adapter);
        }
        else if(view.equalsIgnoreCase("Length"))
        {
            String str[] = {"MilliMetre", "Centimetre", "Metre", "Kilometre", "Foot", "Inch"};

            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, str);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            toSpin.setAdapter(adapter);
            fromSpin.setAdapter(adapter);
        }
        else if(view.equalsIgnoreCase("Weight"))
        {
            String str[] = {"Milligram", "Gram" ,"Kilogram", "Tonne", "Pound", "Ounce"};

            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, str);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            toSpin.setAdapter(adapter);
            fromSpin.setAdapter(adapter);
        }
        else if(view.equalsIgnoreCase("Volume"))
        {
            String str[] = {"Cubic Meter", "Milliliter", "Litre", "MegaLitre"};

            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, str);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            toSpin.setAdapter(adapter);
            fromSpin.setAdapter(adapter);
        }
        else if(view.equalsIgnoreCase("Currency"))
        {
            String str[] = {"EGP", "USD", "EUR", "GBP"};

            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, str);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            toSpin.setAdapter(adapter);
            fromSpin.setAdapter(adapter);
        }
        else if(view.equalsIgnoreCase("Time"))
        {
            String str[] = {"New York", "London", "Cairo", "Moscow"};

            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, str);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            toSpin.setAdapter(adapter);
            fromSpin.setAdapter(adapter);
        }
        else if(view.equalsIgnoreCase("Speed"))
        {
            String str[] = {"M/S", "KM/H", "Mile/H", "FT/min"};

            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, str);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            toSpin.setAdapter(adapter);
            fromSpin.setAdapter(adapter);
        }

        convertBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                float fromNum = Float.parseFloat(fromText.getText().toString());
                float toNum = 0.0f;
                String from = fromSpin.getSelectedItem().toString();
                String to = toSpin.getSelectedItem().toString();

                if(from.equalsIgnoreCase(to))
                {
                    toNum = fromNum;
                }
                else  if(view.equalsIgnoreCase("Temperature"))
                {
                    Temperature temp = new Temperature();
                    temp.setTemperature(fromNum);

                    if(from.equalsIgnoreCase("Fahrenheit"))
                    {
                        if(to.equalsIgnoreCase("Celsius"))
                        {
                            toNum = temp.convertFahrenheitToCelsius();
                        }
                        else if(to.equalsIgnoreCase("Kelvin"))
                        {
                            toNum = temp.convertFahrenheitToKelvin();
                        }
                        else if(to.equalsIgnoreCase("rankine"))
                        {
                            toNum = temp.convertFahrenheitTorankine();
                        }
                    }
                    else if(from.equalsIgnoreCase("Celsius"))
                    {
                        if(to.equalsIgnoreCase("Fahrenheit"))
                        {
                            toNum = temp.convertCelsiusToFahrenheit();
                        }
                        else if(to.equalsIgnoreCase("Kelvin"))
                        {
                            toNum = temp.convertCelsiusToKelvin();
                        }
                        else if(to.equalsIgnoreCase("rankine"))
                        {
                            toNum = temp.convertcelsiusTorankine();
                        }
                    }
                    else if(from.equalsIgnoreCase("Kelvin"))
                    {
                        if(to.equalsIgnoreCase("Fahrenheit"))
                        {
                            toNum = temp.convertKelvinToFahrenheit();
                        }
                        else if(to.equalsIgnoreCase("Celsius"))
                        {
                            toNum = temp.convertKelvinToCelsius();
                        }
                        else if(to.equalsIgnoreCase("rankine"))
                        {
                            toNum = temp.convertkelvinTorankine();
                        }
                    }
                    else if(from.equalsIgnoreCase("rankine"))
                    {
                        if(to.equalsIgnoreCase("Fahrenheit"))
                        {
                            toNum = temp.convertrankineToFahrenheit();
                        }
                        else if(to.equalsIgnoreCase("Celsius"))
                        {
                            toNum = temp.convertrankineTocelsius();
                        }
                        else if(to.equalsIgnoreCase("kelvin"))
                        {
                            toNum = temp.convertrankineTokelvin();
                        }
                    }

                }
                else if(view.equalsIgnoreCase("Length"))
                {
                    //"MilliMetre", "Centimetre", "Metre", "Kilometre", "Foot", "Inch"
                    Length len = new Length();
                    len.setLength(fromNum);

                    if(from.equalsIgnoreCase("MilliMetre"))
                    {
                        if(to.equalsIgnoreCase("Centimetre"))
                        {
                            toNum = len.convertMillimeterToCentimeter();
                        }
                        else if(to.equalsIgnoreCase("Metre"))
                        {
                            toNum = len.ConvertMillimetreToMetre();
                        }
                        else if(to.equalsIgnoreCase("Kilometre"))
                        {
                            toNum = len.convertMillimetreToKilometre();
                        }
                        else if(to.equalsIgnoreCase("Foot"))
                        {
                            toNum = len.convertMillimeterTOFoot();
                        }
                        else if(to.equalsIgnoreCase("Inch"))
                        {
                            toNum = len.convertMillimeterToInch();
                        }
                    }
                    else if(from.equalsIgnoreCase("Centimetre"))
                    {
                        if(to.equalsIgnoreCase("MilliMetre"))
                        {
                            toNum = len.convertCentimeterToMillimeter();
                        }
                        else if(to.equalsIgnoreCase("Metre"))
                        {
                            toNum = len.convertCentimetreToMetre();
                        }
                        else if(to.equalsIgnoreCase("Kilometre"))
                        {
                            toNum = len.convertCentimetreToKilometre();
                        }
                        else if(to.equalsIgnoreCase("Foot"))
                        {
                            toNum = len.convertCentimetreToFoot();
                        }
                        else if(to.equalsIgnoreCase("Inch"))
                        {
                            toNum = len.convertCentiMetreToInch();
                        }
                    }
                    else if(from.equalsIgnoreCase("Metre"))
                    {
                        if(to.equalsIgnoreCase("MilliMetre"))
                        {
                            toNum = len.ConvertMetreToMillimetre();
                        }
                        else if(to.equalsIgnoreCase("Centimetre"))
                        {
                            toNum = len.convertMetreToCentimetre();
                        }
                        else if(to.equalsIgnoreCase("Kilometre"))
                        {
                            toNum = len.convertMetreToKilometre();
                        }
                        else if(to.equalsIgnoreCase("Foot"))
                        {
                            toNum = len.convertMetreToFoot();
                        }
                        else if(to.equalsIgnoreCase("Inch"))
                        {
                            toNum = len.convertMetreToInch();
                        }
                    }
                    else if(from.equalsIgnoreCase("Killometre"))
                    {
                        if(to.equalsIgnoreCase("MilliMetre"))
                        {
                            toNum = len.convertKilometreToMillimetre();
                        }
                        else if(to.equalsIgnoreCase("Centimetre"))
                        {
                            toNum = len.convertKilometreToCentimetre();
                        }
                        else if(to.equalsIgnoreCase("Metre"))
                        {
                            toNum = len.convertKilometreToMetre();
                        }
                        else if(to.equalsIgnoreCase("Foot"))
                        {
                            toNum = len.convertKilometreToFoot();
                        }
                        else if(to.equalsIgnoreCase("Inch"))
                        {
                            toNum = len.convertKilometreToInch();
                        }
                    }

                    else if(from.equalsIgnoreCase("Foot"))
                    {
                        if(to.equalsIgnoreCase("MilliMetre"))
                        {
                            toNum = len.convertFootToMillimeter();
                        }
                        else if(to.equalsIgnoreCase("Centimetre"))
                        {
                            toNum = len.convertFootToCentimetre();
                        }
                        else if(to.equalsIgnoreCase("Metre"))
                        {
                            toNum = len.convertFootToMetre();
                        }
                        else if(to.equalsIgnoreCase("Kilometre"))
                        {
                            toNum = len.convertFootToKilometre();
                        }
                        else if(to.equalsIgnoreCase("Inch"))
                        {
                            toNum = len.convertFootToInch();
                        }
                    }
                    else if(from.equalsIgnoreCase("Inch"))
                    {
                        if(to.equalsIgnoreCase("MilliMetre"))
                        {
                            toNum = len.convertInchToMilliMeter();
                        }
                        else if(to.equalsIgnoreCase("Centimetre"))
                        {
                            toNum = len.convertInchToCentimetre();
                        }
                        else if(to.equalsIgnoreCase("Metre"))
                        {
                            toNum = len.convertInchToMetre();
                        }
                        else if(to.equalsIgnoreCase("Kilometre"))
                        {
                            toNum = len.convertInchToKilometre();
                        }
                        else if(to.equalsIgnoreCase("Foot"))
                        {
                            toNum = len.convertInchToFoot();
                        }
                    }
                }
                else if(view.equalsIgnoreCase("Weight"))
                {
                    // "Milligram", "Gram" ,"Kilogram", "Tonne", "Pound", "Ounce"
                    Weight weight = new Weight();
                    weight.setWeight(fromNum);

                    if(from.equalsIgnoreCase("Milligram"))
                    {
                        if(to.equalsIgnoreCase("Gram"))
                        {
                            toNum = weight.ConvertMilligramToGram();
                        }
                        else if(to.equalsIgnoreCase("Kilogram"))
                        {
                            toNum = weight.convertMilligramToKilogram();
                        }
                        else if(to.equalsIgnoreCase("Tonne"))
                        {
                            toNum = weight.convertMilligramToTonne();
                        }
                        else if(to.equalsIgnoreCase("Pound"))
                        {
                            toNum = weight.convertMilligramToPound();
                        }
                        else if(to.equalsIgnoreCase("Ounce"))
                        {
                            toNum = weight.convertMilligramToOunce();
                        }

                    }
                    else if(from.equalsIgnoreCase("Gram"))
                    {
                        if(to.equalsIgnoreCase("Milligram"))
                        {
                            toNum = weight.ConvertGramToMilligram();
                        }
                        else if(to.equalsIgnoreCase("Kilogram"))
                        {
                            toNum = weight.convertGramToKilogram();
                        }
                        else if(to.equalsIgnoreCase("Tonne"))
                        {
                            toNum = weight.convertGramToTonne();
                        }
                        else if(to.equalsIgnoreCase("Pound"))
                        {
                            toNum = weight.convertGramToPound();
                        }
                        else if(to.equalsIgnoreCase("Ounce"))
                        {
                            toNum = weight.convertGramToOunce();
                        }
                    }
                    else if(from.equalsIgnoreCase("Kilogram"))
                    {
                        if(to.equalsIgnoreCase("Milligram"))
                        {
                            toNum = weight.convertKilogramToMilligram();
                        }
                        else if(to.equalsIgnoreCase("Gram"))
                        {
                            toNum = weight.convertKilogramToGram();
                        }
                        else if(to.equalsIgnoreCase("Tonne"))
                        {
                            toNum = weight.convertKilogramToTonne();
                        }
                        else if(to.equalsIgnoreCase("Pound"))
                        {
                            toNum = weight.convertKilogramToPound();
                        }
                        else if(to.equalsIgnoreCase("Ounce"))
                        {
                            toNum = weight.convertKilogramToOunce();
                        }
                    }
                    else if(from.equalsIgnoreCase("Tonne"))
                    {
                        if(to.equalsIgnoreCase("Milligram"))
                        {
                            toNum = weight.convertTonneToMilligram();
                        }
                        else if(to.equalsIgnoreCase("Gram"))
                        {
                            toNum = weight.convertTonneToGram();
                        }
                        else if(to.equalsIgnoreCase("Kilogram"))
                        {
                            toNum = weight.convertTonneToKilogram();
                        }
                        else if(to.equalsIgnoreCase("Pound"))
                        {
                            toNum = weight.convertTonneToPound();
                        }
                        else if(to.equalsIgnoreCase("Ounce"))
                        {
                            toNum = weight.convertTonneToOunce();
                        }

                    }
                    else if(from.equalsIgnoreCase("Pound"))
                    {
                        if(to.equalsIgnoreCase("Milligram"))
                        {
                            toNum = weight.convertPoundToMilligram();
                        }
                        else if(to.equalsIgnoreCase("Gram"))
                        {
                            toNum = weight.convertPoundToGram();
                        }
                        else if(to.equalsIgnoreCase("Kilogram"))
                        {
                            toNum = weight.convertPoundToKilogram();
                        }
                        else if(to.equalsIgnoreCase("Tonne"))
                        {
                            toNum = weight.convertPoundToTonne();
                        }
                        else if(to.equalsIgnoreCase("Ounce"))
                        {
                            toNum = weight.convertPoundToOunce();
                        }
                    }
                    else if(from.equalsIgnoreCase("Ounce"))
                    {
                        if(to.equalsIgnoreCase("Milligram"))
                        {
                            toNum = weight.convertOunceToMilligram();
                        }
                        else if(to.equalsIgnoreCase("Gram"))
                        {
                            toNum = weight.convertOunceToGram();
                        }
                        else if(to.equalsIgnoreCase("Kilogram"))
                        {
                            toNum = weight.convertOunceToKilogram();
                        }
                        else if(to.equalsIgnoreCase("Tonne"))
                        {
                            toNum = weight.convertOunceToTonne();
                        }
                        else if(to.equalsIgnoreCase("Pound"))
                        {
                            toNum = weight.convertOunceToPound();
                        }
                    }
                }
                else if(view.equalsIgnoreCase("Volume"))
                {
                    // "Cubic Meter", "Milliliter", "Litre", "MegaLitre"
                    Volume volume = new Volume();
                    volume.setvolume(fromNum);

                    if(from.equalsIgnoreCase("Cubic Meter"))
                    {
                        if(to.equalsIgnoreCase("Milliliter"))
                        {
                            toNum = volume.convertCubicmeterToMilileter();
                        }
                        else if(to.equalsIgnoreCase("Litre"))
                        {
                            toNum = volume.convertCubicmeterToLitres();
                        }
                        else if(to.equalsIgnoreCase("MegaLitre"))
                        {
                            toNum = volume.convertCubicmeterToMegaLitre();
                        }
                    }
                    else if(from.equalsIgnoreCase("Milliliter"))
                    {
                        if(to.equalsIgnoreCase("Cubic Meter"))
                        {
                            toNum = volume.convertMiliLeterToCubicmeter();
                        }
                        else if(to.equalsIgnoreCase("Litre"))
                        {
                            toNum = volume.convertCubicCentimeterToLitre();
                        }
                        else if(to.equalsIgnoreCase("MegaLitre"))
                        {
                            toNum = volume.convertCubicCentimetreToMegaLiter();
                        }
                    }
                    else if(from.equalsIgnoreCase("Litre"))
                    {
                        if(to.equalsIgnoreCase("Milliliter"))
                        {
                            toNum = volume.convertMegaLiterToCubicCentimetre();
                        }
                        else if(to.equalsIgnoreCase("Cubic Meter"))
                        {
                            toNum = volume.convertLitreToCubicmeter();
                        }
                        else if(to.equalsIgnoreCase("MegaLitre"))
                        {
                            toNum = volume.convertLiterToMegaLiter();
                        }
                    }
                    else if(from.equalsIgnoreCase("MegaLitre"))
                    {
                        if(to.equalsIgnoreCase("Milliliter"))
                        {
                            toNum = volume.convertMegaLiterToCubicCentimetre();
                        }
                        else if(to.equalsIgnoreCase("Litre"))
                        {
                            toNum = volume.convertMegaLiterToLiter();
                        }
                        else if(to.equalsIgnoreCase("Cubic Meter"))
                        {
                            toNum = volume.convertMegaLitreToCubicmeter();
                        }
                    }
                }
                else if(view.equalsIgnoreCase("Currency"))
                {
                    //"EGP", "USD", "EUR", "GBP"
                    Currency currency = new Currency();
                    currency.setCurrency(fromNum);

                    if(from.equalsIgnoreCase("EGP"))
                    {
                        if(to.equalsIgnoreCase("USD"))
                        {
                            toNum = currency.changeEGPtoUSD();
                        }
                        else if(to.equalsIgnoreCase("EUR"))
                        {
                            toNum = currency.changeEGPtoEUR();
                        }
                        else if(to.equalsIgnoreCase("GBP"))
                        {
                            toNum = currency.changeEGPtoGBP();
                        }

                    }
                    else if(from.equalsIgnoreCase("USD"))
                    {
                        if(to.equalsIgnoreCase("EGP"))
                        {
                            toNum = currency.changeUSDtoEGP();
                        }
                        else if(to.equalsIgnoreCase("EUR"))
                        {
                            toNum = currency.changeUSDtoEUR();
                        }
                        else if(to.equalsIgnoreCase("GBP"))
                        {
                            toNum = currency.changeUSDtoGBP();
                        }
                    }
                    else if(from.equalsIgnoreCase("EUR"))
                    {
                        if(to.equalsIgnoreCase("USD"))
                        {
                            toNum = currency.changeEURtoUSD();
                        }
                        else if(to.equalsIgnoreCase("EGP"))
                        {
                            toNum = currency.changeEURtoEGP();
                        }
                        else if(to.equalsIgnoreCase("GBP"))
                        {
                            toNum = currency.changeEURtoGBP();
                        }
                    }
                    else if(from.equalsIgnoreCase("GBP"))
                    {
                        if(to.equalsIgnoreCase("USD"))
                        {
                            toNum = currency.changeGBPtoUSD();
                        }
                        else if(to.equalsIgnoreCase("EUR"))
                        {
                            toNum = currency.changeGBPtoEUR();
                        }
                        else if(to.equalsIgnoreCase("EGP"))
                        {
                            toNum = currency.changeGBPtoEGP();
                        }
                    }
                }
                else if(view.equalsIgnoreCase("Time"))
                {
                    //"New York", "London", "Cairo", "Moscow"
                    TimeZone timeZone = new TimeZone();
                    timeZone.settime(fromNum);

                    if(from.equalsIgnoreCase("New York"))
                    {
                        if(to.equalsIgnoreCase("London"))
                        {
                            toNum = timeZone.convertnewyorktimetolondontime();
                        }
                        else if(to.equalsIgnoreCase("Cairo"))
                        {
                            toNum = timeZone.convertnewyorktimetocairotime();
                        }
                        else if(to.equalsIgnoreCase("Moscow"))
                        {
                            toNum = timeZone.convertnewyorktomoscow();
                        }

                    }
                    else if(from.equalsIgnoreCase("London"))
                    {
                        if(to.equalsIgnoreCase("New York"))
                        {
                            toNum = timeZone.convertlondontimetonewyork();
                        }
                        else if(to.equalsIgnoreCase("Cairo"))
                        {
                            toNum = timeZone.convertlondontimetocairotime();
                        }
                        else if(to.equalsIgnoreCase("Moscow"))
                        {
                            toNum = timeZone.convertlondontomoscow();
                        }
                    }
                    else if(from.equalsIgnoreCase("Cairo"))
                    {
                        if(to.equalsIgnoreCase("New York"))
                        {
                            toNum = timeZone.convertcairotimetonewyorktime();
                        }
                        else if(to.equalsIgnoreCase("London"))
                        {
                            toNum = timeZone.convertcairotimetolondontime();
                        }
                        else if(to.equalsIgnoreCase("Moscow"))
                        {
                            toNum = timeZone.convertcairotomoscow();
                        }
                    }
                    else if(from.equalsIgnoreCase("Moscow"))
                    {
                        if(to.equalsIgnoreCase("New York"))
                        {
                            toNum = timeZone.convertmoscowtonewyork();
                        }
                        else if(to.equalsIgnoreCase("London"))
                        {
                            toNum = timeZone.convertmoscowtolondon();
                        }
                        else if(to.equalsIgnoreCase("Cairo"))
                        {
                            toNum = timeZone.convertmoscowtocairo();
                        }
                    }

                    toNum = ((toNum % 24) + 24) % 24;
                }
                else if(view.equalsIgnoreCase("Speed"))
                {
                    //"M/S", "KM/H", "Mile/H", "FT/min"
                    Speed speed = new Speed();
                    speed.setSpeed(fromNum);

                    if(from.equalsIgnoreCase("M/S"))
                    {
                        if(to.equalsIgnoreCase("KM/H"))
                        {
                            toNum = (float)speed.converMETER_SECtoKILOMETER_HOUR();
                        }
                        else if(to.equalsIgnoreCase("Mile/H"))
                        {
                            toNum = (float)speed.convertMETER_SECtoMILE_HOUR();
                        }
                        else if(to.equalsIgnoreCase("FT/min"))
                        {
                            toNum = (float)speed.convertMETER_SECtoFEET_MIN();
                        }
                    }
                    else if(from.equalsIgnoreCase("KM/H"))
                    {
                        if(to.equalsIgnoreCase("M/S"))
                        {
                            toNum = (float)speed.convertKILOMETER_HOURtoMETER_SEC();
                        }
                        else if(to.equalsIgnoreCase("Mile/H"))
                        {
                            toNum = (float)speed.convertKIlOMETER_HOURtoMILE_HOUR();
                        }
                        else if(to.equalsIgnoreCase("FT/min"))
                        {
                            toNum = (float)speed.convertKIlOMETER_HOURtoFEET_MIN();
                        }
                    }
                    else if(from.equalsIgnoreCase("Mile/H"))
                    {
                        if(to.equalsIgnoreCase("KM/H"))
                        {
                            toNum = (float)speed.convertMILE_HOURtoKILOMETER_HOUR();
                        }
                        else if(to.equalsIgnoreCase("M/S"))
                        {
                            toNum = (float)speed.convertMILE_HOURtoMETER_SEC();
                        }
                        else if(to.equalsIgnoreCase("FT/min"))
                        {
                            toNum = (float)speed.convertMILE_HOURtoFEET_MIN();
                        }
                    }
                    else if(from.equalsIgnoreCase("FT/min"))
                    {
                        if(to.equalsIgnoreCase("KM/H"))
                        {
                            toNum = (float)speed.convertFEET_MINtoKILOMETER_HOUR();
                        }
                        else if(to.equalsIgnoreCase("Mile/H"))
                        {
                            toNum = (float)speed.convertFEET_MINtoMILE_HOUR();
                        }
                        else if(to.equalsIgnoreCase("M/S"))
                        {
                            toNum = (float)speed.convertFEET_MINtoMETER_SEC();
                        }
                    }

                }

                toText.setText(String.valueOf(toNum));
            }
        });
    }
}
