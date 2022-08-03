package com.example.aula01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class KmM extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_km_m);

        EditText edtKmprog = (EditText) findViewById(R.id.edtKM);
        EditText edtMprog = (EditText) findViewById(R.id.edtM);
        Button btnConerterprog = (Button) findViewById(R.id.btconverter);

        btnConerterprog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float km, m;
                km = Float.parseFloat(edtKmprog.getText().toString());
                m = km* 1000;
                edtMprog.setText(String.valueOf(m));
            }
        });

    }


}