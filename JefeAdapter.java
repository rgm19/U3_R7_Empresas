package com.example.ruben.u3_r7_empresas;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class JefeAdapter extends ArrayAdapter<Jefe> {

    public JefeAdapter(Context context, ArrayList<Jefe> resource) {super(context,0, resource);}



    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_esqueleto_adapter_jefe, parent, false);
        }

        Jefe currentAndroidFlavor = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.nom_jefe);
        nameTextView.setText(currentAndroidFlavor.getNombre());

        TextView nameTextView2 = (TextView) listItemView.findViewById(R.id.ape_jefe);
        nameTextView2.setText(currentAndroidFlavor.getApellidos());

        TextView nameTextView3 = (TextView) listItemView.findViewById(R.id.dni_jefe);
        nameTextView3.setText(currentAndroidFlavor.getDni());

        TextView nameTextView4 = (TextView) listItemView.findViewById(R.id.dep_jefe);
        nameTextView4.setText(currentAndroidFlavor.getDepartamento());


        TextView nameTextView5 = (TextView) listItemView.findViewById(R.id.empleados_del_jefe);
        int num_emp = (int) Bd.empleados.size();
        nameTextView5.setText(String.valueOf(num_emp).toString());





        return listItemView;

    }
}
