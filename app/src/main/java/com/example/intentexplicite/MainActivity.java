package com.example.intentexplicite;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText editText1, editText2, editText3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        editText3 = findViewById(R.id.editText3);

        Button btnCalculate = findViewById(R.id.btnCalculate);
        // MainActivity.java
// ... (previous code)

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str1 = editText1.getText().toString();
                String str2 = editText2.getText().toString();
                String str3 = editText3.getText().toString();

                if (str1.isEmpty() || str2.isEmpty() || str3.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Veuillez remplir tous les champs", Toast.LENGTH_SHORT).show();
                    return;
                }

                Double note1 = Double.parseDouble(str1);
                Double note2 = Double.parseDouble(str2);
                Double note3 = Double.parseDouble(str3);

                Double moyenne = (note1 + note2 + note3) / 3;

                if (moyenne > 10) {
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    intent.putExtra("moyenne", moyenne);
                    startActivity(intent);
                } else {
                    Intent intent2 = new Intent(MainActivity.this, ThirdActivity.class);
                    intent2.putExtra("moyenne", moyenne);
                    startActivity(intent2);
                }
            }
        });

    }

}
