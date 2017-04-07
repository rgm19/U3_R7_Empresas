package com.example.ruben.u3_r7_empresas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class ActivityMain extends AppCompatActivity {

        Button addEmp, verEmp, addJefe, verJefe;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addEmp=(Button)findViewById(R.id.btn_addEmp);
        verEmp=(Button)findViewById(R.id.btn_verEmpleado);
        addJefe=(Button)findViewById(R.id.btn_anadirJefe);

        addEmp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(ActivityMain.this, addEmpleado.class);
                startActivity(myIntent);

            }
        });

        verEmp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent verListEmp = new Intent(ActivityMain.this, VerEmpleados.class);
                startActivity(verListEmp);
            }
        });

    }

    void addJefe(View view){
        Intent myintent = new Intent(ActivityMain.this, addJefe.class);
        startActivity(myintent);
    }

}
