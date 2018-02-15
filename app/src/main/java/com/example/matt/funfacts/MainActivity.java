package com.example.matt.funfacts;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = MainActivity.class.getSimpleName();

    private FactBook factBook = new FactBook();
    private ColorWheel colorWheel = new ColorWheel();

    private TextView factTextView;
    private Button showButton;
    Random random;
    private RelativeLayout relativeLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        factTextView = (TextView) findViewById(R.id.factTextView);
        showButton = (Button) findViewById(R.id.showButton);
        relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

        final View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String fact = factBook.getFact();
                int color = colorWheel.getColor();

                factTextView.setText(fact);
                relativeLayout.setBackgroundColor(color);
                showButton.setTextColor(color);

            }
        };

        showButton.setOnClickListener(listener);

        //Toast.makeText(this,"Yay! Our activity was created!",Toast.LENGTH_LONG).show();

        Log.d(TAG, "We're logging from the onCreate() method!");

    }
}
