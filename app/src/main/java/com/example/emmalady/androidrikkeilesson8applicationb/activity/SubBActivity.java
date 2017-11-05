package com.example.emmalady.androidrikkeilesson8applicationb.activity;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.emmalady.androidrikkeilesson8applicationb.R;

public class SubBActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_b);
        showDialog();
    }
    public void showDialog(){
        AlertDialog.Builder dialog =  new AlertDialog.Builder(SubBActivity.this);
        String title = "SEND BROASTCAST TO SUB B";
        String msg = "Hello SUB B";
        String ok = "OK";
        String cancel = "CANCEL";
        dialog.setTitle(title).setMessage(msg).setPositiveButton(ok, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        }).setNegativeButton(cancel, null);
        AlertDialog alertDialog = dialog.create();
        alertDialog.show();
    }
}
