package com.example.happynewyear;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.content.res.AppCompatResources;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity3 extends AppCompatActivity {
    ImageView imageView3;
    public int catsNum = 0;
    public int[] images = {R.drawable.img_5, R.drawable.img_6, R.drawable.img_7,R.drawable.img_8,R.drawable.img_9};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        imageView3 = findViewById(R.id.imageView3);

        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextCat();
            }
        });
    }

    public void nextCat() {
        catsNum = ++catsNum % 5;
        imageView3.setImageDrawable(AppCompatResources.getDrawable(getApplicationContext(), images[catsNum]));
    }
}