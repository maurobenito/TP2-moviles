package com.benito.tp2.Libros;

import java.io.Serializable;

public class Libros implements Serializable {
    private String titulo;
    private String ISNB;
    private String autor;
    private String editorial;
    private String descripcion;
    private String etiqueta;
    private int anio;
    private int paginas;
    private int portadaLibro;

    public Libros(String titulo, String ISNB, String autor, String editorial, String descripcion, String etiqueta, int anio, int paginas, int portada) {
        this.titulo = titulo;
        this.ISNB = ISNB;
        this.autor = autor;
        this.editorial = editorial;
        this.descripcion = descripcion;
        this.etiqueta = etiqueta;
        this.anio = anio;
        this.paginas = paginas;
        this.portadaLibro = portada;

    }

    public Libros() {

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getISNB() {
        return ISNB;
    }

    public void setISNB(String ISNB) {
        this.ISNB = ISNB;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public int getPortadaLibro() {
        return portadaLibro;
    }

    public void setPortadaLibro(int portadaLibro) {
        this.portadaLibro = portadaLibro;
    }

    public Libros(int portadaLibro) {this.portadaLibro = portadaLibro;

    }
}