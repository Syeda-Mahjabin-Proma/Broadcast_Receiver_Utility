package com.smp.broadcastreceiverutility;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class custom_broadcast_display extends AppCompatActivity {

    private TextView receivedText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_broadcast_display);

        Intent intent = getIntent();
        String message = intent.getStringExtra("inputText");

        receivedText = findViewById(R.id.receivedText);
        receivedText.setText(message);
    }
}
