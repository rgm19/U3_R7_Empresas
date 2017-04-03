package com.example.ruben.u3_r7_empresas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.ruben.u3_r7_empresas.R.string.nombre;

public class addEmpleado extends AppCompatActivity {

    TextView txt_nombre, txt_apellidos, txt_dni, txt_funcion, txt_puesto;
    EditText edt_nombre, edt_apellidos, edt_dni, edt_funcion, edt_puesto;
    Button btn_addEmp;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_empleado);

        edt_nombre=(EditText)findViewById(R.id.edt_nombre);
        edt_apellidos=(EditText)findViewById(R.id.edt_apellidos);
        edt_dni=(EditText)findViewById(R.id.edt_dni);
        edt_puesto=(EditText)findViewById(R.id.edt_puesto);
        edt_funcion=(EditText)findViewById(R.id.edt_funcion);
        btn_addEmp=(Button)findViewById(R.id.btn_addemp);
        final Toast mensaje= Toast.makeText(this,"Hay campos vacios en el formulario",Toast.LENGTH_LONG);
        final Toast add = Toast.makeText(this,"Se ha añadido la informacion",Toast.LENGTH_LONG);

        btn_addEmp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(edt_funcion.getText().toString().equals("") || edt_nombre.getText().toString().equals("")||edt_dni.getText().toString().equals("")||edt_puesto.getText().toString().equals("")||edt_apellidos.getText().toString().equals("")){
                    mensaje.show();
                }else {
                    Bd.addEmpleado(edt_nombre.getText().toString(), edt_apellidos.getText().toString(), edt_dni.getText().toString(), edt_puesto.getText().toString(), edt_funcion.getText().toString());
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
           edt_funcion.setText("");
           edt_puesto.setText("");

        }



}
