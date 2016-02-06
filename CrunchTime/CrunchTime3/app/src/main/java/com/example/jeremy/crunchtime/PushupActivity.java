package com.example.jeremy.crunchtime;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PushupActivity extends AppCompatActivity {

    final double calories_per_pushup = 0.285;
    final double calories_per_jogging = 8.33;
    final double calories_per_situp = 0.5;
    final double calories_per_jumpingjacks = 10;

    TextView mOtherTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pushup_activity);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button mButton = (Button) findViewById(R.id.calculate_button);
        final EditText mEdit = (EditText) findViewById(R.id.pushup_results);

        mOtherTextView = (TextView) findViewById(R.id.textView4);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double result = calculate_calories(Double.valueOf(mEdit.getText().toString()));
                    mOtherTextView.setText(getConversions(result));
                }
                catch (NumberFormatException e){

                }
            }
        });

    }

    public double calculate_calories(double reps){
        return reps * calories_per_pushup;
    }
    public String getConversions(double calories){
        return "You have burned " + calories + " calories. To burn the same calories you will need to do "
                + String.valueOf(calories/calories_per_situp)
                + " situps, " + String.valueOf(calories/calories_per_jumpingjacks) + " minutes of jumping jacks and "
                + String.valueOf(calories/calories_per_jogging) + " minutes of jogging";
    }

}
