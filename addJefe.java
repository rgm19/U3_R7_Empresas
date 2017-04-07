package com.example.ruben.u3_r7_empresas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class addJefe extends AppCompatActivity {

    EditText edt_nombre, edt_apellidos, edt_dni, edt_departamento;
    TextView txt_num_empleados;
    Button btn_addJefe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_jefe);

        edt_nombre=(EditText)findViewById(R.id.edt_nombre);
        edt_apellidos=(EditText)findViewById(R.id.edt_apellidos);
        edt_dni=(EditText)findViewById(R.id.edt_dni);
        edt_departamento=(EditText)findViewById(R.id.edt_dep);
        btn_addJefe=(Button)findViewById(R.id.btn_addJefe);
        txt_num_empleados=(TextView)findViewById(R.id.txt_empleados_acargo);

        int aux = (int) Bd.empleados.size();
        txt_num_empleados.setText("Empleados a su cargo: "+aux);


        final Toast mensaje= Toast.makeText(this,"Hay campos vacios en el formulario",Toast.LENGTH_LONG);
        final Toast add = Toast.makeText(this,"Se ha añadido la informacion",Toast.LENGTH_LONG);



        btn_addJefe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(edt_departamento.getText().toString().equals("") || edt_nombre.getText().toString().equals("")||edt_dni.getText().toString().equals("")||edt_apellidos.getText().toString().equals("")){
                    mensaje.show();
                }else {
                    Bd.addJefe(edt_nombre.getText().toString(), edt_apellidos.getText().toString(), edt_dni.getText().toString(), edt_departamento.getText().toString(), Bd.getEmpleados());
                    add.show();
                    limpiarEDT();
                }
            }
        });



    }
    void limpiarEDT(){
        edt_apellidos.setText("");
        edt_nombre.setText("");
        edt_dni.setText("");
        edt_departamento.setText("");


    }
}
