package com.example.happynewyear;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.constraintlayout.utils.widget.ImageFilterButton;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

//import ru.myitschool.mte.databinding.ActivityMainBinding;

public class MainActivity2 extends AppCompatActivity {
    ActivityMainBinding binding;
    ImageView imageView2;
    private final int[] images = {R.drawable.img_1, R.drawable.img_2, R.drawable.img_3};
    private int catsNum = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        binding = ActivityMainBinding.iflate(getLayoutInflater());
        setContentView(R.layout.activity_main2);

        imageView2 = findViewById(R.id.imageView2);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextCat();
            }
        });
    }

    private void nextCat() {
        catsNum = ++catsNum % 3;
        imageView2.setImageDrawable(AppCompatResources.getDrawable(getApplicationContext(), images[catsNum]));
    }
}