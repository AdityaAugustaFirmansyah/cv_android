package com.example.mycv.skill;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.example.mycv.R;
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

public class SkillActivity extends AppCompatActivity {
     int [] images = {R.drawable.skill_java,R.drawable.skill_kotlin,R.drawable.ic_skill_php,
             R.drawable.skill_mysql,R.drawable.skill_javascript,R.drawable.skill_html,R.drawable.skill_css};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skill);

        CarouselView carouselView = findViewById(R.id.carousel_view);
        carouselView.setPageCount(images.length);
        carouselView.setImageListener(imageListener);
    }


    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setImageResource(images[position]);
        }
    };
}
