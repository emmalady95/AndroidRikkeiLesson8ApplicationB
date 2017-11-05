package com.example.emmalady.androidrikkeilesson8applicationb.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.example.emmalady.androidrikkeilesson8applicationb.activity.SubBActivity;

/**
 * Created by Liz Nguyen on 05/11/2017.
 */

public class CustomBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Intent i = new Intent(context, SubBActivity.class);
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(i);
    }
}
