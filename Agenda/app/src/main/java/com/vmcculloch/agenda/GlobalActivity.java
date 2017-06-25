package com.vmcculloch.agenda;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class GlobalActivity extends AppCompatActivity {
    LinearLayout containerLayout;
    static int totalEditTexts = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_global);
        containerLayout = (LinearLayout)findViewById(R.id.globalLayout);

        ((Button) findViewById(R.id.addButton)).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                onPressed();
            }
        });

    }



    public void onPressed() {
        totalEditTexts++;
        if (totalEditTexts > 100)
            return;
        EditText editText = new EditText(this);
        containerLayout.addView(editText);
        editText.setGravity(Gravity.RIGHT);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) editText.getLayoutParams();
        layoutParams.width = LinearLayout.LayoutParams.MATCH_PARENT;
        editText.setLayoutParams(layoutParams);
        //if you want to identify the created editTexts, set a tag, like below
        editText.setTag("EditText" + totalEditTexts);

    }



}
