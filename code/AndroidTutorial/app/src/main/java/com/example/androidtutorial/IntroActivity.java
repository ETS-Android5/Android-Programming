package com.example.androidtutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/**
 * Introduction activity, this activity could be used to display initial logo of application.
 * It start another activity after <delay> seconds and then finish, rather it is destroyed by SO.
 *
 * @author kevinmala00
 */
public class IntroActivity extends AppCompatActivity {
    private final Context mContext= this;
    private long delay = 2 * 1000;    //numero di millisecondi da attendere prima di startare la nuova activity

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intro_activity);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(mContext, HomeActivity.class);
                finish();
                startActivity(intent);
            }
        }, delay);
    }
}