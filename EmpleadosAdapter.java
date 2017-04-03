package com.example.ruben.u3_r7_empresas;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ruben on 25/10/16.
 */

public class EmpleadosAdapter extends ArrayAdapter<Empleado> {
    public EmpleadosAdapter(Context context, ArrayList<Empleado> resource) {super(context,0, resource);}



    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.act_adapter, parent, false);
        }

        Empleado currentAndroidFlavor = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.nom_empl);
        nameTextView.setText(currentAndroidFlavor.getNombre());

        TextView nameTextView2 = (TextView) listItemView.findViewById(R.id.ape_empl);
        nameTextView2.setText(currentAndroidFlavor.getApellidos());

        TextView nameTextView3 = (TextView) listItemView.findViewById(R.id.dni_empl);
        nameTextView3.setText(currentAndroidFlavor.getDni());

        TextView nameTextView4 = (TextView) listItemView.findViewById(R.id.puesto_empl);
        nameTextView4.setText(currentAndroidFlavor.getPuesto());

        TextView nameTextView5 = (TextView) listItemView.findViewById(R.id.funcion_empl);
        nameTextView5.setText(currentAndroidFlavor.getFuncion());

        return listItemView;

    }
}
