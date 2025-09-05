package com.benito.tp2;

import android.app.Application;
import android.content.Intent;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.benito.tp2.Libros.Libros;

public class EncontradoActivityViewModel extends AndroidViewModel {
    private MutableLiveData<Libros> librosMutableLiveData;

    public EncontradoActivityViewModel(Application application) {
        super(application);
    }

    public LiveData<Libros> getLibrosMutableLiveData() {
        if (librosMutableLiveData == null) {
            librosMutableLiveData = new MutableLiveData<>();
        }
        return librosMutableLiveData;
    }

    public void leerLibro(Intent intent) {
        Libros libroenc = (Libros) intent.getSerializableExtra("encontrado");
        librosMutableLiveData.setValue(libroenc);
        if (libroenc != null) {

            Log.d("Libro", "Título: " + libroenc.getTitulo());
        } else {
            Log.e("Libro", "No se recibió ningún objeto en el Intent");
        }
    }

}