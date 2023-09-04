package com.example.sistemaacademico;
import com.example.sistemaacademico.Libro;

public class Autor {
    private String autor_name;
    private String libros;

    public String getLibros() {
        return libros;
    }

    public void setLibros(String libros) {
        this.libros = libros;
    }

    public String getAutor_name() {
        return autor_name;
    }

    public void setAutor_name(String autor_name) {
        this.autor_name = autor_name;
    }

    public String toString(){
        return "Nombre del Autor: "+autor_name+" / libros: "+libros;
    }

}
