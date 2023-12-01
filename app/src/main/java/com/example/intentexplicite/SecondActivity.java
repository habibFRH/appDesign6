package com.example.intentexplicite;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        TextView tvMoyenne = findViewById(R.id.tvMoyenne);
        Intent intent = getIntent();
        if (intent.hasExtra("moyenne")) {
            Double moyenne = intent.getDoubleExtra("moyenne", 0.0);
            tvMoyenne.setText("Moyenne: " + moyenne);
        } else {
            tvMoyenne.setText("Moyenne non disponible");
        }
    }
}
