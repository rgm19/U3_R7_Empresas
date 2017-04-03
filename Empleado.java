package com.example.ruben.u3_r7_empresas;

/**
 * Created by ruben on 21/10/16.
 */

public class Empleado extends Persona{
    private String puesto;
    private String funcion;


    Empleado(){}

    Empleado(String nombre,String apellidos,String dni,String puesto, String funcion){
        super(dni,nombre, apellidos);
        this.puesto=puesto;
        this.funcion=funcion;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    @Override
    String saludar(String saludo) {
        return super.saludar(saludo);
    }
}
