package com.example.gustavo.rentakar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.widget.Button;
import android.widget.*;
import android.view.*;
import android.content.*;

public class TelaDeLogin extends AppCompatActivity {

    private Button bntAcessarMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_de_login);

        bntAcessarMenu = (Button) findViewById(R.id.btnAcessarLogin);

        bntAcessarMenu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent it = new Intent();
                it.setClass(TelaDeLogin.this, Menu.class);
                startActivity(it);
                finish();
            }
        });
    }


}
