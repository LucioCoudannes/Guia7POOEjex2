/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Puntos;
import java.util.Scanner;

/**
 *
 * @author A288808
 */
public class PuntosServicio {

    Scanner leer = new Scanner(System.in);

    public void crearPuntos(Puntos cx) {

        System.out.println("Ingrese el valor de x1");
        cx.setX1(leer.nextInt());

        System.out.println("Ingrese el valor de x2");
        cx.setY1(leer.nextInt());

        System.out.println("Ingrese el valor de y1");
        cx.setX2(leer.nextInt());

        System.out.println("Ingrese el valor de y2");
        cx.setY2(leer.nextInt());

    }

    public void calcularDis(Puntos d) {

        System.out.println(d.toString());
       

        double distancia = Math.sqrt(Math.pow((d.getX2()-d.getX1()), 2)+Math.pow((d.getY2()-d.getY1()), 2));

        System.out.println("La distancia entre ambos puntos es de " + distancia);

    }

}
