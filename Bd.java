package com.example.ruben.u3_r7_empresas;

import java.util.ArrayList;

/**
 * Created by ruben on 24/10/16.
 */

public class Bd {

    private ArrayList<Jefe> jefes;
     static ArrayList<Empleado> empleados= new ArrayList<>();


    public ArrayList<Jefe> getJefes() {
        return jefes;
    }

    public void setJefes(ArrayList<Jefe> jefes) {
        this.jefes = jefes;
    }

    public static ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    static void addEmpleado(String nombre, String apellidos, String dni, String puesto, String funcion){

        empleados.add(new Empleado(nombre,apellidos,dni,puesto,funcion));
    }
}
