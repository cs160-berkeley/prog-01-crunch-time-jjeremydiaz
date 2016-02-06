package com.example.jeremy.crunchtime;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //New activities for each button
        ImageButton launchPushUpActivity = (ImageButton) findViewById(R.id.imageButton);
        launchPushUpActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pushup_intent = new Intent(MainActivity.this, PushupActivity.class);
                startActivity(pushup_intent);
            }
        });

        ImageButton launchSitUpActivity = (ImageButton) findViewById(R.id.imageButton2);
        launchSitUpActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent situp_intent = new Intent(MainActivity.this, SitupActivity.class);
                startActivity(situp_intent);
            }
        });

        ImageButton launchJumpingjacksActivity = (ImageButton) findViewById(R.id.imageButton4);
        launchJumpingjacksActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jumpingjacks_intent = new Intent(MainActivity.this, JumpingjacksActivity.class);
                startActivity(jumpingjacks_intent);
            }
        });

        ImageButton launchJoggingActivity = (ImageButton) findViewById(R.id.imageButton5);
        launchJoggingActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jogging_intent = new Intent(MainActivity.this, JoggingActivity.class);
                startActivity(jogging_intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
