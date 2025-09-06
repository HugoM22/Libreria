package com.example.libreria.data;

import com.example.libreria.model.Book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class BookRepositorio {
    private List<Book> libros = new ArrayList<>();

    public BookRepositorio() {
        //crear libros
        Book estrella = new Book(1, "Mara debe enfrentar una acusación de violación contra su hermano y un trauma propio, aborda consentimiento y culpa con mucha sensibilidad.",
                2019,"Juvenil", 296,"Ashley Herring Blake","Hecha de Estrellas");
        Book animalitos = new Book(2,"Dos niñxs montan una “funeraria” para animalitos y, con humor tierno, exploran la muerte y los rituales."
                ,2008,"Infatil",48,"Ulf Nilsson","Tantos Animalitos Muertos");
        Book principito = new Book(3,"Fábula poética sobre amistad, pérdida y mirada infantil al mundo; ilustrada por el autor."
                , 1943,"Infantil",100,"Antoine de Saint-Exupéry","El principito");
        Book matilda = new Book(4,"Una niña genial, padres horribles, directora temible y un poder inesperado; clásico irreverente.",
                1988,"Infantil",116,"Roald Dahl","Matilda");
        Book hobbit = new Book(5,"Bilbo Bolsón, un hobbit acomodado, se une a trece enanos y al mago Gandalf para recuperar el tesoro del dragón Smaug; clásico de fantasía y viaje del héroe.",
                1937,"Fantasía",320,"J. R. R. Tolkien","El hobbit");
        libros.addAll(Arrays.asList(estrella,animalitos,principito,matilda,hobbit));
    }
    public Book buscarPorTitulo(String titulo){
        if(titulo == null) return null;
        String q = titulo.toLowerCase(Locale.ROOT).trim();
        if(q.isEmpty()) return null;

        for(Book b : libros){
            if(b.getTitulo() != null &&
            b.getTitulo().toLowerCase(Locale.ROOT).contains(q)){
                return b;
            }
        }
        return null;
    }
}
