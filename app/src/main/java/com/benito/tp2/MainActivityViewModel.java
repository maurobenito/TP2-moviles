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

public class MainActivityViewModel extends AndroidViewModel {
    private List<Libros> listaLibros = Arrays.asList(
            new Libros("Despierta", "1234", "Anthony De Melo", "Mundo", "Es un super libro", "Autoayuda", 2010, 100),
            new Libros("El dia que Nietsche lloró", "5678", "Louis Vilton", "Campana", "alta historia", "Drama", 2005, 302),
            new Libros("Un Mundo Feliz", "9123", "Aldous Houxley", "Banana", "Una critica al mundo moderno", "Ciencia ficción", 2013, 235));
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
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
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
