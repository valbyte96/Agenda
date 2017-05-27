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

        ((Button) findViewById(R.id.localButton)).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                go();
            }
        });
    }
    private void go(){
        startActivity(new Intent(this, LocalList.class));
    }
}
