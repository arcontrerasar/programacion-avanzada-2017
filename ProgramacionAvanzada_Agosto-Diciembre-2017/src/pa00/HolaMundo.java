/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa00;

import java.util.Scanner;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
/**
 *
 * @author Sala2
 */
public class HolaMundo {
    static int intA;
    Frame F;
    Button B;
    Label L;
    public HolaMundo(){
        F=new Frame("HolaMundo.class");
        F.setLayout(new FlowLayout());
        F.add(B=new Button("Botón"));
        F.add(L=new Label("Hola Mundo GUI"));
        F.setSize(400,300);
        F.setLocationRelativeTo(null);
        F.addWindowListener(new WindowAdapter() {
            public void WindowClosing(WindowEvent we){
                F.dispose();
                System.exit(0);
            }
});
        F.setVisible(true);
        
    }
    public static void main(String[] args) {
        System.out.println("Hola Mundo JAVA JAVA DOO");
        System.out.print("Teclee un entero: ");
        Scanner scanner=new Scanner(System.in);
        intA=scanner.nextInt();
        for (int i = 31; i >= 0; i--) {
            System.out.printf("%d",(intA>>i)&0x1);
            
        }
        new HolaMundo();
    }        
}
