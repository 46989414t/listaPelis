package com.pelis.listapeliculas;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * A placeholder fragment containing a simple view.
 */
public class PelisListaActivityFragment extends Fragment {

    //el arraylist y adapter que guardaran las pelis
    private ArrayList<String> items;
    private ArrayAdapter<String> adapter;
    //*********

    public PelisListaActivityFragment() {
    }
    //agragar items al menu
    //@Override
    /*public void onCreateOptionsMenu(Menu menu, MenuInflater inflater){
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.menu_pelis_lista, menu);
    }*/


    //informar al Activity que se agregaran items al menu
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //return inflater.inflate(R.layout.fragment_pelis_lista, container, false);

        //declarar el view para la lista
        //antes de conectarla a la API la mostrará vacía
        View vista = inflater.inflate(R.layout.fragment_pelis_lista, container, false);
        //View lsPelis = vista.findViewById(R.id.lsPelis);
        ListView lsPelis = (ListView) vista.findViewById(R.id.lsPelis);

        //conectamos el arrayadapter con el listView
        //items = new ArrayList<>();

        //datos de ejemplo
        String[] data = {
          "el padrino", "el padrino 2", "el padrino 3", "infiltrados", "Star Wars: una nueva esperzanza"
        };

        items = new ArrayList<>(Arrays.asList(data));

        adapter = new ArrayAdapter<String>(
                getContext(),
                R.layout.content_lista_pelis_row,
                R.id.tituloPeli,
                items
        );
        lsPelis.setAdapter(adapter);
        //**********************
        return vista;
    }

    //Gestión del click refresh
    @Override
    public  void onCreateOptionsMenu(Menu menu, MenuInflater inflater){
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.menu_pelis_lista, menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
            // Handle action bar item clicks here. The action bar will
            // automatically handle clicks on the Home/Up button, so long
            // as you specify a parent activity in AndroidManifest.xml.
            int id = item.getItemId();

            //noinspection SimplifiableIfStatement
            if (id == R.id.action_refresh) {
                 refresh();
                return true;
            }

           return super.onOptionsItemSelected(item);
         }

         private void refresh() {
         }



}
