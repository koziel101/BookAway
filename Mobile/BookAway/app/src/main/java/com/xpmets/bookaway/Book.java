package com.xpmets.bookaway;

import android.widget.ImageView;

public class Book {
    private String titulo, autor;
    private boolean vender, trocar, doar, emprestar;
    private ImageView capa;

    public Book() {
    }

    public Book(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        /*this.vender = vender;
        this.trocar = trocar;
        this.doar = doar;
        this.emprestar = emprestar;
//        this.capa = capa;*/
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isVender() {
        return vender;
    }

    public void setVender(boolean vender) {
        this.vender = vender;
    }

    public boolean isTrocar() {
        return trocar;
    }

    public void setTrocar(boolean trocar) {
        this.trocar = trocar;
    }

    public boolean isDoar() {
        return doar;
    }

    public void setDoar(boolean doar) {
        this.doar = doar;
    }

    public boolean isEmprestar() {
        return emprestar;
    }

    public void setEmprestar(boolean emprestar) {
        this.emprestar = emprestar;
    }

    public ImageView getCapa() {
        return capa;
    }

    public void setCapa(ImageView capa) {
        this.capa = capa;
    }
}
