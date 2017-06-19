package com.vmcculloch.agenda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //got to calendar
        ((Button) findViewById(R.id.calButton)).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                calendar();
            }
        });
        //go to local list
        ((Button) findViewById(R.id.localButton)).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                local();
            }
        });
        //go to settings
        ((Button) findViewById(R.id.settingsButton)).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                settings();
            }
        });
    }
    private void calendar(){
        startActivity(new Intent(this, CalActivity.class));
    }

    private void local(){
        startActivity(new Intent(this, TDActivity.class));
    }

    private void settings(){
        startActivity(new Intent(this, SettingsActivity.class));
    }

}
