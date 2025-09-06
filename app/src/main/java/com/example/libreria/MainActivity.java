package com.example.libreria;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.ViewModelProvider;

import com.example.libreria.model.Book;

public class MainActivity extends AppCompatActivity {

    private EditText etTitulo;
    private Button btnBuscar;
    private TextView tvError;
    private MainViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etTitulo = findViewById(R.id.etTitulo);
        btnBuscar = findViewById(R.id.btnBuscar);
        tvError = findViewById(R.id.tvError);

        viewModel = new ViewModelProvider(this).get(MainViewModel.class);

        //error
        viewModel.getError().observe(this, msg ->{
            if (msg != null && !msg.isEmpty()){
                tvError.setText(msg);
                tvError.setVisibility(View.VISIBLE);
            }else{
                tvError.setVisibility(View.GONE);
            }
        });
        //resultado
        viewModel.getResultado().observe(this,(Book book) ->{
            if(book != null){
                Intent i = new Intent(MainActivity.this, DetailActivity.class);
                i.putExtra(DetailActivity.EXTRA_BOOK, book);
                startActivity(i);
            }
        });
        //boton
        btnBuscar.setOnClickListener(v ->{
            String q = etTitulo.getText().toString();
            viewModel.buscarPorTitulo(q);
        });
    }
}