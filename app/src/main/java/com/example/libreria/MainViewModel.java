package com.example.libreria;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.libreria.data.BookRepositorio;
import com.example.libreria.model.Book;

public class MainViewModel extends ViewModel {
    private final BookRepositorio repo = new BookRepositorio();

    private final MutableLiveData<Book> resultado = new MutableLiveData<>();
    private final MutableLiveData<String> error = new MutableLiveData<>();

    public LiveData<Book> getResultado(){
        return resultado;
    }
    public LiveData<String> getError(){
        return error;
    }
    public void buscarPorTitulo(String titulo){
        if (titulo == null || titulo.trim().isEmpty()) {
            error.setValue("Ingresa un titulo.");
            resultado.setValue(null);
            return;
        }
        Book b = repo.buscarPorTitulo(titulo.trim());
        if(b!= null){
            resultado.setValue(b);
            error.setValue(null);
        }else{
            error.setValue("No se encontro ningun libro.");
        }
    }
}
