package com.tjatoer.latihan;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by tjatoer on 10/04/16.
 */
public class Login extends AppCompatActivity{
    EditText user, pass;
    Button login;
    Context context = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        Typeface fontku = Typeface.createFromAsset(getAssets(),"jogja.ttf");
        TextView textaja = (TextView) findViewById(R.id.text1);
        textaja.setTypeface(fontku);
        user =(EditText) findViewById(R.id.edittext1);
        pass =(EditText) findViewById(R.id.edittext2);
        login =(Button) findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (user.getText().toString().equals("admin") && pass.getText().toString().equals("admin")) {
                    Toast.makeText(getApplicationContext(), "Sukses Login", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(context, Home.class);
                    startActivity(intent);
                }
                else{

                    Toast.makeText(getApplicationContext(), "User atau Password Anda Salah", Toast.LENGTH_SHORT).show();
                }
            }

        });



    }
}
