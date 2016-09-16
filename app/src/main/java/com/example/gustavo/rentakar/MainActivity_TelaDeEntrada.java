package com.example.gustavo.rentakar;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.*;

public class MainActivity_TelaDeEntrada extends AppCompatActivity implements View.OnClickListener{

    private ImageButton bntAcessar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ateladeentrada);

        bntAcessar = (ImageButton) findViewById(R.id.btnAcessar);
    }

    @Override
    public void onClick(View v) {
        Intent it = new Intent(this,TelaDeLogin.class);
        startActivity(it);
    }
}
