/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciayreutilizacion;

import java.awt.Frame;

import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.WindowAdapter; //paso 1/5 para action listener 
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Sala2
 */
public class VPrincipal {
Frame F;   
MenuBar MB;
Menu M;
MenuItem MIAbrir;
MenuItem MITipo;
public VPrincipal(String str){
F= new Frame("str");
F.setMenuBar(MB=new MenuBar());
MB.add(M=new Menu("Archivo")); //se agrega menu a barra menus
M.addSeparator();
M.add(MIAbrir=new MenuItem("Abrir"));//se agrega submenu abrir
M.addSeparator();
M.add(MITipo=new MenuItem("Tipo de Votacion"));
MITipo.addActionListener(new ListenMITipo());
F.addWindowListener(new WindowAdapter(){ //paso 3 de 5 
    public void WindowClosing(WindowEvent we){
        F.dispose();
        System.exit(0);
    }
});
F.setSize(400,300);
F.setVisible(true);
}
class ListenMITipo implements ActionListener{ //para 2 de 5 de interface actionlistener
    public void actionPerformed(ActionEvent ae){
        MD=new MyDialog(F,true);
    }
}
public static void main(String arg[]){
new VPrincipal("Ventana Principal");
}
}

 