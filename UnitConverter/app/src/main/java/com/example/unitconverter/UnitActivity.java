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
        String view = extras.getString("View");
        textView.setText(view);
        Button backBtn = (Button) findViewById(R.id.backBtn);
        TextView toText = (TextView) findViewById(R.id.toView);
        EditText fromText = (EditText) findViewById(R.id.fromText);
        Spinner fromSpin = (Spinner) findViewById(R.id.fromSpinner);
        Spinner toSpin = (Spinner) findViewById(R.id.toSpinner);

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
            String str[] = {"Fahrenheit", "Celsius", "Kelvin"};

            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, str);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            toSpin.setAdapter(adapter);
            fromSpin.setAdapter(adapter);
        }
        else if(view.equalsIgnoreCase("Length"))
        {
            String str[] = {};

            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, str);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            toSpin.setAdapter(adapter);
            fromSpin.setAdapter(adapter);
        }
        else if(view.equalsIgnoreCase("Weight"))
        {
            String str[] = {};

            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, str);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            toSpin.setAdapter(adapter);
            fromSpin.setAdapter(adapter);
        }
        else if(view.equalsIgnoreCase("Volume"))
        {
            String str[] = {};

            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, str);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            toSpin.setAdapter(adapter);
            fromSpin.setAdapter(adapter);
        }
        else if(view.equalsIgnoreCase("Currency"))
        {
            String str[] = {};

            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, str);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            toSpin.setAdapter(adapter);
            fromSpin.setAdapter(adapter);
        }
        else if(view.equalsIgnoreCase("Time"))
        {
            String str[] = {};

            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, str);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            toSpin.setAdapter(adapter);
            fromSpin.setAdapter(adapter);
        }
        else if(view.equalsIgnoreCase("Speed"))
        {
            String str[] = {};

            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, str);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            toSpin.setAdapter(adapter);
            fromSpin.setAdapter(adapter);
        }
    }
}
