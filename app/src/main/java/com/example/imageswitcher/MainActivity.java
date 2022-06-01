package com.example.imageswitcher;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ViewSwitcher;

import com.google.android.material.badge.BadgeUtils;

public class MainActivity extends AppCompatActivity {

    Button b1,b2;
    ImageSwitcher sw;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1= findViewById(R.id.btn1);
        b2 = findViewById(R.id.btn2);
        sw= findViewById(R.id.imgswitcher);


        sw.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView myView = new ImageView(getApplicationContext());
                myView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                return myView;

            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Next Image", Toast.LENGTH_SHORT).show();
                sw.setImageResource(R.drawable.farmer1);

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Previous Image", Toast.LENGTH_SHORT).show();
                sw.setImageResource(R.drawable.farmer4);

            }
        });
    }
}