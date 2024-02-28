package com.smp.broadcastreceiverutility;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class battery_receive extends AppCompatActivity {

    private EditText battery_guess;
    private Button nextButton;
    private int guess;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.battery_receive);

        battery_guess = findViewById(R.id.battery_guess);
        nextButton = findViewById(R.id.nextButton);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String guessText = battery_guess.getText().toString();

                if (!guessText.isEmpty()) {
                    guess = Integer.parseInt(guessText);
                    Intent intent = new Intent(battery_receive.this, battery_display.class);
                    intent.putExtra("guessedPercentage", guess);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(battery_receive.this, "Please Enter an Integer Value", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}