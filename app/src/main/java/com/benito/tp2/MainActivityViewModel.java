package com.benito.tp2;

import android.app.Application;
import android.content.Intent;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;


import com.benito.tp2.Libros.Libros;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class MainActivityViewModel extends AndroidViewModel {
    private List<Libros> listaLibros = Arrays.asList(
            new Libros("Siddharta", "1111", "Hermann Hesse", "Planeta", "Un viaje espiritual", "Filosofía", 1922, 250,  R.drawable.siddharta),
            new Libros("Rayuela", "2222", "Julio Cortázar", "Sudamericana", "Una obra maestra de la literatura", "Ficción", 1963, 400,  R.drawable.rayuela),
            new Libros("Colapso", "3333", "Jared Diamond", "Debate", "Un análisis sobre sociedades que desaparecieron", "Historia", 2005, 450, R.drawable.colapso),
            new Libros("It", "4444", "Stephen King", "Viking", "Terror clásico con un payaso siniestro", "Terror", 1986, 1138, R.drawable.it),
            new Libros("Crimen", "5555", "Fiódor Dostoievski", "Alianza", "Inspirado en Crimen y Castigo", "Novela", 1866, 500, R.drawable.descarga),
            new Libros("Fahrenheit", "6666", "Ray Bradbury", "Ballantine", "Un mundo donde los libros están prohibidos", "Ciencia Ficción", 1953, 249,R.drawable.descarga),
            new Libros("Ensayo", "7777", "José Saramago", "Alfaguara", "Un estilo narrativo único", "Novela", 1995, 350,R.drawable.descarga),
            new Libros("Metamorfosis", "8888", "Franz Kafka", "Kurt Wolff", "Un hombre despierta convertido en insecto", "Clásico", 1915, 325,R.drawable.descarga),
            new Libros("Solaris", "9999", "Stanisław Lem", "Minotauro", "Contacto humano con una inteligencia alienígena", "Ciencia Ficción", 1961, 300,R.drawable.descarga),
            new Libros("Inferno", "1010", "Dan Brown", "Doubleday", "Una aventura con Robert Langdon", "Thriller", 2013, 480,R.drawable.descarga));
    private MutableLiveData<Libros> mutablelibro = new MutableLiveData<>();
    private MutableLiveData<String> mutableError = new MutableLiveData<>();

    public MainActivityViewModel(@NonNull Application application) {
        super(application);
    }

    public LiveData<Libros> getMutablelibro() {
        if (mutablelibro == null)
            mutablelibro = new MutableLiveData<>();
        return mutablelibro;
    }

    public void buscarLibro(String titulo) {
        Libros libroEncontrado = null;
        for (Libros libro : listaLibros
        ) {
            if (libro.getTitulo().toLowerCase().contains(titulo.toLowerCase())){
                libroEncontrado = libro;
                break;
            }
        }
                Intent intent = new Intent(getApplication(), EncontradoActivity.class);
                intent.putExtra("encontrado", libroEncontrado);
                intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK);
                getApplication().startActivity(intent);
            }


        }
