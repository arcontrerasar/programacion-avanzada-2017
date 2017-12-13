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
class CUtil {
    static double  longitud;
    static int elecc;
    static java.util.Scanner scanner;
    static Formula InterfFormula;
    static Formula getFormula(){
        System.out.println("1.- Cuadro \n2.- Circulo\n Opcion: ");
        scanner=new java.util.Scanner(System.in);
        elecc=scanner.nextInt();
        switch(elecc){
            case 1:{System.out.println("lado? ");
            longitud=scanner.nextDouble();
                InterfFormula=new Cuadro(longitud);break;}
            case 2:{System.out.println("Radio? ");
            longitud=scanner.nextDouble();
                InterfFormula=new Circulo(longitud);break;}
            default:{System.exit(0);
                break;}
        }
        return InterfFormula;
    }
}
