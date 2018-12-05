package com.example.android.customfancontroller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private DialView mDialView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDialView = findViewById(R.id.dialView);


    }
    /**
     * When the user taps the Switch Colors button,
     * this method sets the custom view attribute for
     * the alternate color.
     */
    public void onSwitchButton(View view) {
        mDialView = (DialView) findViewById(R.id.dialView);
        if (mDialView.isSetToAltColor()) {
            // Since mAltColor is true,
            // switch to false by passing false to setAltColor().
            mDialView.setAltColor(false);
        } else {
            // Since mAltColor is false,
            // switch to true by passing true to setAltColor().
            mDialView.setAltColor(true);
        }
    }

}
