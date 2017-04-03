package com.example.ruben.u3_r7_empresas;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class VerEmpleados extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_empleados);

        EmpleadosAdapter arrayAdapter=new EmpleadosAdapter(this, Bd.empleados);
        ListView listView = (ListView)findViewById(R.id.activity_ver_empleados);
        listView.setAdapter(arrayAdapter);
    }




}
