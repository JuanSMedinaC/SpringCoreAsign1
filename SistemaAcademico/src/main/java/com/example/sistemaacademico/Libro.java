package com.example.sistemaacademico;
import com.example.sistemaacademico.Autor;
public class Libro {
    private String libro_name;
    private Autor autor;

    public String getLibro_name() {
        return libro_name;
    }

    public void setLibro_name(String libro_name) {
        this.libro_name = libro_name;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String toString(){
        return "Nombre del libro: "+libro_name+" / Autor: "+autor;
    }
}
