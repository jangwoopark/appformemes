package com.example.android.jokeandroidlibrary;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;


public class JokeActivity extends AppCompatActivity {

    private static final String JOKE_KEY = "joke_key";

    //TextView textViewJoke;
    ImageView imageViewMeme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        //textViewJoke = findViewById(R.id.tv_joke);
        imageViewMeme = findViewById(R.id.imgRandom);

        Intent intentCalled = getIntent();
        if (intentCalled != null && intentCalled.hasExtra(JOKE_KEY)) {
            String jokeText = intentCalled.getStringExtra(JOKE_KEY);
            //textViewJoke.setText(jokeText);

            imageViewMeme.setImageDrawable(getResources().getDrawable(getResources().getIdentifier(jokeText, "drawable",
                          getApplicationContext().getApplicationInfo().packageName)));

//            final Random rnd = new Random();
//            if (jokeText.equals("unique")) {
//                final String imageName = String.format(Locale.ENGLISH, "unique__%2d_", rnd.nextInt(9) + 1);
//                imageViewMeme.setImageDrawable(getResources().getDrawable(getResources().getIdentifier(imageName, "drawable",
//                        getApplicationContext().getApplicationInfo().packageName)));
//            }
//
//            if (jokeText.equals("funny")) {
//                final String imageName = String.format(Locale.ENGLISH, "funny__%2d_", rnd.nextInt(29) + 1);
//                imageViewMeme.setImageDrawable(getResources().getDrawable(getResources().getIdentifier(imageName, "drawable",
//                        getApplicationContext().getApplicationInfo().packageName)));
//            }
//
//            if (jokeText.equals("geek")) {
//                final String imageName = String.format(Locale.ENGLISH, "geek__%2d_", rnd.nextInt(26) + 1);
//                imageViewMeme.setImageDrawable(getResources().getDrawable(getResources().getIdentifier(imageName, "drawable",
//                        getApplicationContext().getApplicationInfo().packageName)));
//            }
//
//            if (jokeText.equals("cute")) {
//                final String imageName = String.format(Locale.ENGLISH, "cute__%2d_", rnd.nextInt(32) + 1);
//                imageViewMeme.setImageDrawable(getResources().getDrawable(getResources().getIdentifier(imageName, "drawable",
//                        getApplicationContext().getApplicationInfo().packageName)));
//            }
//
//            if (jokeText.equals("animals")) {
//                final String imageName = String.format(Locale.ENGLISH, "animals__%2d_", rnd.nextInt(108) + 1);
//                imageViewMeme.setImageDrawable(getResources().getDrawable(getResources().getIdentifier(imageName, "drawable",
//                        getApplicationContext().getApplicationInfo().packageName)));
//            }

        }
    }
}
