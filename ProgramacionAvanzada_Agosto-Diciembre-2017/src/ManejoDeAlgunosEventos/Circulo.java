/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManejoDeAlgunosEventos;

/**
 *
 * @author Sala2
 */
public class Circulo implements Formula{
    double radio;
    public Circulo(double r){
        radio=r;
    }
    public double area(){
        return Math.PI*Math.pow(radio, 2);
    }
}
