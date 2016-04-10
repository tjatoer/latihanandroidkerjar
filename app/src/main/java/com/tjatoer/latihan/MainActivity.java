package com.tjatoer.latihan;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button klik;

    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setTitle("Keluar")
                .setMessage("Apakah Anda Yakin Keluar ?")
                .setNegativeButton("No", null)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface arg0, int arg1) {

                        MainActivity.super.onBackPressed();
                    }
                })

                .create().show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
        Typeface fontku = Typeface.createFromAsset(getAssets(),"jogja.ttf");
        TextView textaja = (TextView) findViewById(R.id.textview1);
        textaja.setTypeface(fontku);

    }
    public  void addListenerOnButton() {
        final Context context = this;
        klik = (Button) findViewById(R.id.button1);
        Typeface fontku1 = Typeface.createFromAsset(getAssets(),"CandyCane.ttf");
        klik.setTypeface(fontku1);
        klik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(context, Login.class);
                startActivity(intent);

            }
        });
    }

}
