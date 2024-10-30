/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo_unidad2.uni1a;

/**
 *
 * @author Willian
 */
public class VideoYoutube extends ContenidoAudiovisual{
    private String Descripcion; 
    private int numeroDeVideosVirales;

    public VideoYoutube(String Descripcion, int numeroDeVideosVirales, String titulo, int duracionEnMinutos, String genero) {
        super(titulo, duracionEnMinutos, genero);
        this.Descripcion = Descripcion;
        this.numeroDeVideosVirales = numeroDeVideosVirales;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la película:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero()); 
        System.out.println("Descripcion: "+getDescripcion());
        System.out.println("Numero de videos Virales: "+getNumeroDeVideosVirales());
        System.out.println("");
        
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getNumeroDeVideosVirales() {
        return numeroDeVideosVirales;
    }

    public void setNumeroDeVideosVirales(int numeroDeVideosVirales) {
        this.numeroDeVideosVirales = numeroDeVideosVirales;
    }
    
    
    
}
