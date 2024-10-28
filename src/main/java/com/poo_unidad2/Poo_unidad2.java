/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.poo_unidad2;

import com.poo_unidad2.uni1a.ContenidoAudiovisual;
import com.poo_unidad2.uni1a.Documental;
import com.poo_unidad2.uni1a.Pelicula;
import com.poo_unidad2.uni1a.SerieDeTV;

/**
 *
 * @author Willian
 */
public class Poo_unidad2 {

    public static void main(String[] args) {
        System.out.println("Hello from Eclipse!");

        // Crear instancias de las subclases
        ContenidoAudiovisual[] contenidos = new ContenidoAudiovisual[3];
        contenidos[0] = new Pelicula("Avatar", 125, "Accion", "20th Century Studios");
        contenidos[1] = new SerieDeTV("Game of Thrones", 60, "Fantasy", 8);
        contenidos[2] = new Documental("Cosmos", 45, "Science", "Astronomy");

        // Mostrar los detalles de cada contenido audiovisual
        for (ContenidoAudiovisual contenido : contenidos) {
            contenido.mostrarDetalles();
            //System.out.println("Contenido: "+contenido);
        }
    }
}
