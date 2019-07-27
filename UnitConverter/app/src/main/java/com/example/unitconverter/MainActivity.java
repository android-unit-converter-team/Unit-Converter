package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton tempBtn = (ImageButton) findViewById(R.id.tempBtn);
        ImageButton lenBtn = (ImageButton) findViewById(R.id.lenBtn);
        ImageButton weightBtn = (ImageButton) findViewById(R.id.weightBtn);
        ImageButton volBtn = (ImageButton) findViewById(R.id.volBtn);
        ImageButton currBtn = (ImageButton) findViewById(R.id.currBtn);
        ImageButton timeBtn = (ImageButton) findViewById(R.id.timeBtn);
        ImageButton speedBtn = (ImageButton) findViewById(R.id.speedBtn);

        tempBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent unit = new Intent(getApplicationContext(), UnitActivity.class);
                unit.putExtra("View", "Temperature");
                startActivity(unit);
            }
        });

        lenBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent unit = new Intent(getApplicationContext(), UnitActivity.class);
                unit.putExtra("View", "Length");
                startActivity(unit);
            }
        });

        weightBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent unit = new Intent(getApplicationContext(), UnitActivity.class);
                unit.putExtra("View", "Weight");
                startActivity(unit);
            }
        });

        volBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent unit = new Intent(getApplicationContext(), UnitActivity.class);
                unit.putExtra("View", "Volume");
                startActivity(unit);
            }
        });

        currBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent unit = new Intent(getApplicationContext(), UnitActivity.class);
                unit.putExtra("View", "Currency");
                startActivity(unit);
            }
        });

        timeBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent unit = new Intent(getApplicationContext(), UnitActivity.class);
                unit.putExtra("View", "Time");
                startActivity(unit);
            }
        });

        speedBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent unit = new Intent(getApplicationContext(), UnitActivity.class);
                unit.putExtra("View", "Speed");
                startActivity(unit);
            }
        });
    }
}
