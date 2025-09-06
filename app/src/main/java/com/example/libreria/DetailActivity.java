package com.example.libreria;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.libreria.model.Book;

public class DetailActivity extends AppCompatActivity {
    public static final String EXTRA_BOOK = "book";

    private ImageView ivImg;
    private TextView tvTitulo, tvAutor, tvPaginas, tvGenero, tvYear, tvDescripcion;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        if(getSupportActionBar() != null){
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setTitle("Detalle del libro");
        }
        ivImg = findViewById(R.id.ivImg);
        tvTitulo = findViewById(R.id.tvTitulo);
        tvAutor = findViewById(R.id.tvAutor);
        tvYear = findViewById(R.id.tvYear);
        tvPaginas = findViewById(R.id.tvPaginas);
        tvGenero = findViewById(R.id.tvGenero);
        tvDescripcion = findViewById(R.id.tvDescripcion);

        Book book = (Book) getIntent().getSerializableExtra(EXTRA_BOOK);
        if(book != null){
            tvTitulo.setText(book.getTitulo());
            tvAutor.setText(book.getAutor());
            tvYear.setText(book.getYear());
            tvPaginas.setText(book.getPaginas() + "pag");
            tvGenero.setText(book.getGenero());
            tvDescripcion.setText(book.getDescripcion());
            ivImg.setImageResource(android.R.drawable.ic_menu_gallery);
        }
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home){finish(); return true;}
        return super.onOptionsItemSelected(item);
    }
}
