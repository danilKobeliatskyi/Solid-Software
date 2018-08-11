package com.example.danilkobeliatskyi.testapplication;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private View view;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView textView = (TextView) findViewById(R.id.text_title);
        view = this.getWindow().getDecorView();
        setContentView(R.layout.activity_main);
    }

    public void onTouch(View view) {
        Random random = new Random();
        switch (random.nextInt(10)) {
            case 0:
                view.setBackgroundResource(R.color.backColor0);
                break;
            case 1:
                view.setBackgroundResource(R.color.backColor1);
                break;
            case 2:
                view.setBackgroundResource(R.color.backColor2);
                break;
            case 3:
                view.setBackgroundResource(R.color.backColor3);
                break;
            case 4:
                view.setBackgroundResource(R.color.backColor4);
                break;
            case 5:
                view.setBackgroundResource(R.color.backColor5);
                break;
            case 6:
                view.setBackgroundResource(R.color.backColor6);
                break;
            case 7:
                view.setBackgroundResource(R.color.backColor7);
                break;
            case 8:
                view.setBackgroundResource(R.color.backColor8);
                break;
            case 9:
                view.setBackgroundResource(R.color.backColor9);
                break;
        }
    }
}
