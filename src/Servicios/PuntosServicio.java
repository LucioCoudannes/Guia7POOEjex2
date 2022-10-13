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

    public void crearPuntos(Puntos cx, Puntos cy) {

        System.out.println("Ingrese el valor de x1");
        cx.setX1(leer.nextInt());

        System.out.println("Ingrese el valor de x2");
        cx.setX2(leer.nextInt());

        System.out.println("Ingrese el valor de y1");
        cy.setY1(leer.nextInt());

        System.out.println("Ingrese el valor de y2");
        cy.setY2(leer.nextInt());

    }

    public void calcularDis(Puntos d, Puntos f) {

        System.out.println(d.toString());
        System.out.println(f.toString());

        double distancia = Math.sqrt(Math.pow((f.getY1()-d.getX1()), 2)+Math.pow((f.getY2()-d.getX2()), 2));

        System.out.println("La distancia entre ambos puntos es de " + distancia);

    }

}
