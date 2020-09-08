package com.example.app2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.app2.Modals.TinderExpert;

public class MainActivity extends AppCompatActivity
{

    TextView descriptionTextView;
    Button MatchButton;
    Button NopeButton;
    ImageView profilePic;
    TextView profilename;

    TinderExpert tinderExpert = new TinderExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindViews();
        setUpListeners();
    }
    private void bindViews()
    {
        descriptionTextView = findViewById(R.id.textView_description);
        MatchButton = findViewById(R.id.likeButton);
        NopeButton = findViewById(R.id.dislikeButton);
        profilePic = findViewById(R.id.imageView_profilePic);
        profilename = findViewById(R.id.textView_name);
    }

    private void setUpListeners()
    {
        MatchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                int index = tinderExpert.getOne();
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("index", index);
                startActivity(intent);
            }
        });

        NopeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                profilePic.setImageResource(tinderExpert.nextImage());
                profilename.setText(tinderExpert.nextName());
                descriptionTextView.setText(tinderExpert.nextDescription());
            }
        });
    }
}