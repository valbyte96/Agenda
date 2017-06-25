package com.vmcculloch.agenda;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Switch;

public class SettingsActivity extends AppCompatActivity {
    private Switch rSwitch;
    private Switch sSwitch;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        rSwitch = (Switch) findViewById(R.id.reminderSwitch);
        sSwitch = (Switch) findViewById(R.id.soundSwitch);

        //save preferences
        SharedPreferences prefs = getPreferences(MODE_PRIVATE);
        Boolean restoredReminder = prefs.getBoolean("ReminderOn", false);
        Boolean restoredSound = prefs.getBoolean("soundOn",false);
        if(restoredReminder!=false|restoredSound!=false){
            rSwitch.setChecked(restoredReminder);
            sSwitch.setChecked(restoredSound);
        }

    }

    @Override
    public void onBackPressed(){
        SharedPreferences.Editor editor = getPreferences(MODE_PRIVATE).edit();
        editor.putBoolean("ReminderOn", rSwitch.isChecked());
        editor.putBoolean("soundOn",sSwitch.isChecked());
        editor.commit();
        super.onBackPressed();
    }
}
