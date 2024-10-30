/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.poo_unidad2;

import com.poo_unidad2.uni1a.Caricaturas;
import com.poo_unidad2.uni1a.ContenidoAudiovisual;
import com.poo_unidad2.uni1a.Documental;
import com.poo_unidad2.uni1a.Pelicula;
import com.poo_unidad2.uni1a.SerieDeTV;
import com.poo_unidad2.uni1a.VideoYoutube;

/**
 *
 * @author Willian
 */
public class Poo_unidad2 {

    public static void main(String[] args) {
        System.out.println("Hello from Eclipse!");

        // Crear instancias de las subclases
        ContenidoAudiovisual[] contenidos = new ContenidoAudiovisual[5];
        contenidos[0] = new Pelicula("Avatar", 125, "Accion", "20th Century Studios");
        contenidos[1] = new SerieDeTV("Game of Thrones", 60, "Fantasy", 8);
        contenidos[2] = new Documental("Cosmos", 45, "Science", "Astronomy");
        contenidos[3] = new Caricaturas(1998, 20," Seria de 20 temmporadas una esponja baja el mar", "Bob Esponja", 45, "Animacion");
        contenidos[4] = new VideoYoutube("Videos de viajes", 20,"  Viaje al mas alla", 45, "Viajes");

        // Mostrar los detalles de cada contenido audiovisual
        for (ContenidoAudiovisual contenido : contenidos) {
            contenido.mostrarDetalles();
            //System.out.println("Contenido: "+contenido);
        }
    }
}
