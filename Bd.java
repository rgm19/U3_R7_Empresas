package com.example.ruben.u3_r7_empresas;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by ruben on 24/10/16.
 */

public class Bd {

     static  ArrayList<Jefe> jefes= new ArrayList<>();
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

    static void addJefe(String nombre, String apellidos, String dni, String departamento, ArrayList<Empleado> empleados){
        jefes.add(new Jefe(nombre,apellidos,dni,departamento,empleados));
    }

    static String numLista(){
        String lista="El tamaño de la lista es de "+empleados.size()+" empleados";
        return lista;

    }
}
