package com.example.retrofitrecyclerhorvercompaginscreen;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

public class New_Image extends AppCompatActivity {



    ImageView myImage;
    String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_old);

        url = getIntent().getStringExtra("image_url");
        myImage = findViewById(R.id.myImage);
        Picasso.get().load(url).resize(600, 600).placeholder(R.drawable.loading)
                .error(R.drawable.ic_backbars).into(myImage);
    }

}