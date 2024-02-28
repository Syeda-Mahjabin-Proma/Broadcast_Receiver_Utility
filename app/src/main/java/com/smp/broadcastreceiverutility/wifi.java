package com.smp.broadcastreceiverutility;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class wifi extends AppCompatActivity {
    private TextView networkType;
    private TextView networkStatus;
    private ConnectivityReceiver connectivityReceiver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wifi);

        networkType = findViewById(R.id.networkType);
        networkStatus = findViewById(R.id.networkStatue);

        connectivityReceiver = new ConnectivityReceiver();
        registerReceiver(connectivityReceiver, new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION));

        getNetworkDetails();
    }

    private void getNetworkDetails() {
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
        if (networkInfo != null ) {
            networkType.setText(networkInfo.getTypeName());
            networkStatus.setText(networkInfo.getState().name());
        }

        else {
            networkType.setText("No Internet Connection!!!");
            networkStatus.setText("Disconnected!!!");
        }
    }

    private class ConnectivityReceiver extends BroadcastReceiver {
        @Override
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (action != null && action.equals(ConnectivityManager.CONNECTIVITY_ACTION)) {
                getNetworkDetails();
            }
        }
    }
}
