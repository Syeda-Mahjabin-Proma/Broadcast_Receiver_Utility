package com.smp.broadcastreceiverutility;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class custom_broadcast_receiver extends AppCompatActivity {
    private EditText editText;
    private Button message_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_broadcast_receiver);
        message_button = findViewById(R.id.button_custom_message);
        editText = findViewById(R.id.message_text);
        message_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = editText.getText().toString();
                Intent intent = new Intent(custom_broadcast_receiver.this, custom_broadcast_display.class);
                intent.putExtra("inputText", message);
                startActivity(intent);
            }
        });
    }
}
