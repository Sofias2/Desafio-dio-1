package com.example.aula01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Desenvolvimento do Button btnKmMT e associação
        //ao Button btnKmMT da Activity (tela)
        Button btnKmMtprog = (Button) findViewById(R.id.txtButton1);

        Button btnMKMprog = (Button) findViewById(R.id.txtButton2);
        //Estrutura responsável por verificar o momenta que o
        //botao e pressionado, disparando as ações (códigos)
        //para chamar a tela.
        btnKmMtprog.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //Intent informando que estamos na Activity "MainActivity"
                //e vamos para a Activity "Intent"
                Intent intent = new Intent(MainActivity.this, KmM.class);
                //Comando que executa a intenção desenvolvida anteriormente
                startActivity(intent);
            }
        });

        btnMKMprog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this, MKm.class);
            startActivity(intent);
            }
        });
    }

}