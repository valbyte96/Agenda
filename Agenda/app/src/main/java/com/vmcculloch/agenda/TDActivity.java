package com.vmcculloch.agenda;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;



public class TDActivity extends AppCompatActivity {
    LinearLayout containerLayout;
    static int totalEditTexts = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_td);
        containerLayout = (LinearLayout)findViewById(R.id.tdLayout);



        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        android.support.v7.app.ActionBar actionBar = getSupportActionBar(); //hide action bar
        actionBar.hide();

        //Dynamically create fields here
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Element Added", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
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
