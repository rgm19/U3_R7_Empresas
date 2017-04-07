package com.example.ruben.u3_r7_empresas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class VerJefes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_jefes);

        JefeAdapter arrayAdapter=new JefeAdapter(this, Bd.jefes);
        ListView listView = (ListView)findViewById(R.id.activity_ver_jefes);
        listView.setAdapter(arrayAdapter);
    }
}
