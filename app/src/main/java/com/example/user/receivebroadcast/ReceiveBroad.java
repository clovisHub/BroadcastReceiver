package com.example.user.receivebroadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class ReceiveBroad extends BroadcastReceiver {


    private String res ="";
    @Override
    public void onReceive(Context context, Intent intent) {

        Toast.makeText(context,""+ intent.getExtras().get("Sent"),Toast.LENGTH_SHORT).show();
        String value = "";
        value = intent.getExtras().get("Sent").toString();

        if(!(value.equalsIgnoreCase("")||value == null)){

            res = value;

            checkValue();
        }

    }

    public String checkValue(){

        return res;
    }
}
