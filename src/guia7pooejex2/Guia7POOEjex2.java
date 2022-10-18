/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7pooejex2;

import Entidades.Puntos;
import Servicios.PuntosServicio;

/**
 *
 * @author A288808
 */
public class Guia7POOEjex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus 
        //atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos 
        //usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en 
        //los atributos del objeto. Después, a través de otro método calcular y devolver la distancia 
        //que existe entre los dos puntos que existen en la clase Puntos
        
        Puntos p1 = new Puntos();
 
        
        PuntosServicio ps = new PuntosServicio();
        
        ps.crearPuntos(p1);
              
        
        ps.calcularDis(p1);
        
        
        
        
    }
    
}
