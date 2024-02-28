package com.smp.broadcastreceiverutility;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class battery_display extends AppCompatActivity {
    private TextView guessedTextView;
    private TextView realTextView;
    private TextView chargingStatusTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.battery_display);

        guessedTextView = findViewById(R.id.guessedTextView);
        realTextView = findViewById(R.id.realTextView);
        chargingStatusTextView = findViewById(R.id.chargingStatusTextView);

        // Retrieve & Display the guessed percentage passed from BatteryGuessActivity
        int guessedPercentage = getIntent().getIntExtra("guessedPercentage", -1);
        guessedTextView.setText((guessedPercentage) + "%");

        // Register BroadcastReceiver to listen for battery status changes
        registerBatteryReceiver();
    }

    private void registerBatteryReceiver() {
        IntentFilter filter = new IntentFilter();
        filter.addAction(Intent.ACTION_BATTERY_CHANGED);
        registerReceiver(batteryReceiver, filter);
    }

    private final BroadcastReceiver batteryReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            if (Intent.ACTION_BATTERY_CHANGED.equals(intent.getAction())) {
                // Retrieve battery status
                int current_level = intent.getIntExtra(BatteryManager.EXTRA_LEVEL, -1);
                int scale = intent.getIntExtra(BatteryManager.EXTRA_SCALE, -1);
                int realPercentage = (int) ((current_level / (float) scale) * 100);
                realTextView.setText((realPercentage) + "%");

                // Determine charging status
                int status = intent.getIntExtra(BatteryManager.EXTRA_STATUS, -1);

                String statusText = "";
                switch (status) {
                    case BatteryManager.BATTERY_STATUS_CHARGING:
                        statusText = "Charging.";
                        break;
                    case BatteryManager.BATTERY_STATUS_FULL:
                        statusText = "Fully Charged. \nPlease Unplug Your Charger.";
                        break;
//                    case BatteryManager.BATTERY_STATUS_NOT_CHARGING:
//                        statusText = "Not Charging";
//                        break;
                    default:
                        statusText = "Not Charging.";
                        break;
                }
                if (statusText == "Not Charging." && realPercentage <= 20){
                    chargingStatusTextView.setText("Please Connect Your Charger.");
                }
                else {
                    chargingStatusTextView.setText(statusText);
                }
            }
        }
    };
}