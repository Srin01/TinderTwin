package com.example.app2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.app2.Modals.TinderExpert;

public class MainActivity2 extends AppCompatActivity {

    TextView descriptionView;
    TextView resultView;
    TextView age;
    TextView sex;
    TinderExpert tinderExpert = new TinderExpert();
    Button submitButton;
    int index;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        bindViews();
        createNextActivity();
        setUplistener();
    }

    private void bindViews() {
        descriptionView = findViewById(R.id.textView_dexcription1);
        resultView = findViewById(R.id.textView_descriptionResult);
        age = findViewById(R.id.textView_age);
        sex = findViewById(R.id.textView_Sex);
        submitButton = findViewById(R.id.submitButton);
    }

    private void createNextActivity() {
        Intent intent = getIntent();
        index = intent.getIntExtra("index", 0);
        descriptionView.setText(tinderExpert.nextExtraDescription(index));
        resultView.setText(String.format("%s%s", getString(R.string.matched), tinderExpert.nextName(index)));
        age.setText(tinderExpert.nextAge(index));
        sex.setText(tinderExpert.getSex(index));
    }

    private void setUplistener() {
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String to = tinderExpert.nextName(index);
                String subject = "Tinder contact profile";
                String message = "Hi, " + tinderExpert.nextName(index) + " how are you? ";


                Intent email = new Intent(Intent.ACTION_SEND);
                email.putExtra(Intent.EXTRA_EMAIL, new String[]{to});
                email.putExtra(Intent.EXTRA_SUBJECT, subject);
                email.putExtra(Intent.EXTRA_TEXT, message);
                email.setType("message/rfc822");

                startActivity(Intent.createChooser(email, "Choose an Email client :"));

            }
        });
    }
}