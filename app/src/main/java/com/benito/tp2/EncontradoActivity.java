package com.benito.tp2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.benito.tp2.Libros.Libros;
import com.benito.tp2.databinding.ActivityEncontradoBinding;

public class EncontradoActivity extends AppCompatActivity {
    private ActivityEncontradoBinding encontradoBinding;
    private EncontradoActivityViewModel encontradoActivityViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        encontradoBinding = ActivityEncontradoBinding.inflate(getLayoutInflater());
        setContentView(encontradoBinding.getRoot());
        encontradoActivityViewModel = ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()).create(EncontradoActivityViewModel.class);
        encontradoActivityViewModel.getLibrosMutableLiveData().observe(this, new Observer<Libros>() {
            @Override
            public void onChanged(Libros libros) {
                if (libros != null) {
                    encontradoBinding.tvLibro.setText(libros.getTitulo());

                } else {
                    encontradoBinding.tvLibro.setText("No se encontró libro");
                }
            }
        });;
        encontradoActivityViewModel.leerLibro(getIntent());
        }
    }





