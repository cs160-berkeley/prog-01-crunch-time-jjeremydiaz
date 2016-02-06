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

public class JoggingActivity extends AppCompatActivity {

    final double calories_per_pushup = 0.285;
    final double calories_per_jogging = 8.33;
    final double calories_per_situp = 0.5;
    final double calories_per_jumpingjacks = 10;

    TextView mTextview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jogging_activity);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button mButton = (Button) findViewById(R.id.calculate_button3);
        final EditText mEdit = (EditText) findViewById(R.id.jumpingjacks_results);
        mTextview = (TextView) findViewById(R.id.textView4);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double result = calculate_calories(Double.valueOf(mEdit.getText().toString()));
                    mTextview.setText(getConversions(result));
                }
                catch (NumberFormatException e){

                }
            }
        });

    }

    public double calculate_calories(double reps){
        return reps * calories_per_jogging;
    }
    public String getConversions(double calories){
        return "You have burned " + calories + " calories. To burn the same calories you will need to do "
                + String.valueOf(calories/calories_per_pushup)
                + " pushups, " + String.valueOf(calories/calories_per_situp) + " situps and "
                + String.valueOf(calories/calories_per_jumpingjacks) + " minutes of jumping jacks";
    }

}
