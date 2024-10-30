/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo_unidad2.uni1a;

/**
 *
 * @author Willian
 */
public class Caricaturas extends ContenidoAudiovisual {
    private int añoCreacion;
    private int temporadas; 
    private String sinopsis; 

    public Caricaturas(int añoCreacion, int temporadas, String sinopsis, String titulo, int duracionEnMinutos, String genero) {
        super(titulo, duracionEnMinutos, genero);
        this.añoCreacion = añoCreacion;
        this.temporadas = temporadas;
        this.sinopsis = sinopsis;
    }
    
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la película:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Año Creacion: "+getAñoCreacion());
        System.out.println("Sinopsis: "+getSinopsis());
        System.out.println("");
    }

    public int getAñoCreacion() {
        return añoCreacion;
    }

    public void setAñoCreacion(int añoCreacion) {
        this.añoCreacion = añoCreacion;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }
    
}
