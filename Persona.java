package com.example.ruben.u3_r7_empresas;

import android.util.Log;

/**
 * Created by ruben on 21/10/16.
 */

public class Persona {
    private String dni;
    private String nombre;
    private String apellidos;

    Persona(){}

    Persona(String dni, String nombre, String apellidos){
        this.apellidos=apellidos;
        this.nombre=nombre;
        this.dni=dni;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    String saludar(String saludo){
        Log.d("Hola", saludo);
     return saludo;
    }
}
