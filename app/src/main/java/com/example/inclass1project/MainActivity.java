package com.example.inclass1project;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = findViewById(R.id.button);
        final ImageView image = findViewById(R.id.imageView);
        final ProgressBar pbar1 = findViewById(R.id.progressBar);

        button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),R.string.message1,Toast.LENGTH_LONG).show();
                image.setVisibility(View.VISIBLE);
                pbar1.setVisibility(View.GONE);
            }
        });
    }
}
