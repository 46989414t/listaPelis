package com.pelis.listapeliculas;

import android.graphics.Movie;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.pelis.listapeliculas.JSON.Result;

import java.util.ArrayList;
import java.util.Arrays;

import retrofit.Call;
import retrofit.Callback;
import retrofit.GsonConverterFactory;
import retrofit.Response;
import retrofit.Retrofit;
import retrofit.http.GET;
import retrofit.http.Query;

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
        final String BASE_URL="http://api.themoviedb.org/3/movie/";
        //parametro APIKEY
        final String API_KEY = "18cae3b3818a484b1bf732d10321342b";

             Retrofit retrofit = new Retrofit.Builder()
                     .baseUrl(BASE_URL)
                     .addConverterFactory(GsonConverterFactory.create())
                     .build();
        PelisListaInterface servei = retrofit.create(PelisListaInterface.class);

        Call<Result> call = servei.getPeliculesPopulars(API_KEY);
        //la llamada se hace en segundo plano
        call.enqueue(new Callback<Result>(){
            @Override
            public void onResponse (Response<Result> response, Retrofit retrofit){
                //comprueba que la peticion ha ido OK
                if (response.isSuccess()) {
                    //Log.d(null, "OK");
                    //extraer datos de la respuesta
                    Result Result = response.body();
                    //Log.e("XXXX", Result.getMovies().toString());
                    adapter.clear();
                    for (Movie peli : peli.getMovies()){
                        adapter.add(peli.getTitle());
                    }
                }else{
                    Log.e("XXXX", response.errorBody().toString());
                }

            }
            @Override
            public void onFailure(Throwable t){

            }
        });
        

    }

    public interface PelisListaInterface{
        //link patillado
        @GET("popular")
        Call<Result> getPeliculesPopulars(
                @Query("api_key") String apikey
        );


        //link patillado
        @GET("top_rated")
        Call<Result> getPeliculesMillorNota(
                @Query("api_key") String apikey
        );
    }



}
