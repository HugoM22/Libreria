package com.example.libreria.model;

import java.io.Serializable;

public class Book implements Serializable {
    private int id;
    private String titulo;
    private String autor;
    private int paginas;
    private String genero;
    private int year;
    private String descripcion;

    public Book(int id, String descripcion, int year, String genero, int paginas, String autor, String titulo) {
        this.id = id;
        this.descripcion = descripcion;
        this.year = year;
        this.genero = genero;
        this.paginas = paginas;
        this.autor = autor;
        this.titulo = titulo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", paginas=" + paginas +
                ", genero='" + genero + '\'' +
                ", year=" + year +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
