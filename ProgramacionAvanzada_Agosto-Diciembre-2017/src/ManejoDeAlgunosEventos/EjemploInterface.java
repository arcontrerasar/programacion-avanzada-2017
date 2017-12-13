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
class FiguraGeom{
    Formula F;
    
}
public class EjemploInterface {
    public static void main(String[] args) {
        Cuadro C;
        Circulo Ci;
        C=new Cuadro(200);
        Ci=new Circulo(300);
        System.out.println("Circulo de area: "+Ci.area());
        System.out.println("Cuadrado de area: "+C.area());
        FiguraGeom FG=new FiguraGeom();FG.F=CUtil.getFormula();
        System.out.println("Figura Geometrica de area: "+FG.F.area());
    }
}
