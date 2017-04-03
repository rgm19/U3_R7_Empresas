package com.example.ruben.u3_r7_empresas;

import java.util.ArrayList;

/**
 * Created by ruben on 21/10/16.
 */

public class Jefe extends Persona{

    private ArrayList<Empleado> empleados;
    private String departamento;

    Jefe(){}

    Jefe(String departamento, ArrayList empleados){
        this.departamento=departamento;
        this.empleados=empleados;
    }

    @Override
    String saludar(String saludo) {
        return super.saludar(saludo);
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public String getDeàrtamento() {
        return departamento;
    }

    public void setDeàrtamento(String deàrtamento) {
        this.departamento = deàrtamento;
    }

    void addEmpleado(Empleado empleado){}
}
