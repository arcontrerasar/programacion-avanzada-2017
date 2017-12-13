/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciayreutilizacion;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Dialog;
import java.awt.GridBagConstraints;
import java.awt.Label;
import java.awt.Insets;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JCheckBox;
import java.awt.Frame;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Sala2
 */
public class MyDialog implements ActionListener{
Dialog D;
Checkbox CB1,CB2,CB3,CB4,CB5,CB6;
Button BC,BA;
Label L;

public MyDialog(Frame F){
    D=new Dialog(new Frame(), "Tipo de eleccion");
    D.setLayout(new GridBagLayout());
    GridBagConstraints c=new GridBagConstraints();
    CB1=new Checkbox("Presidente de la republica");
    CB2=new Checkbox("Senador");
    CB3=new Checkbox("Diputado");
    CB4=new Checkbox("Gobernador");
    CB5=new Checkbox("Delegado");
    CB6=new Checkbox("Presidente municipal");
    L= new Label ("  ");
    c.weighty = 1;
    c.weightx = 1;
    c.gridx= 0;
    c.anchor= GridBagConstraints. FIRST_LINE_START;
    c.insets = new Insets(0,0,0,0);
    D.add(CB1,c);
    D.add(CB2,c);
    D.add(CB3,c);
    D.add(CB4,c);
    D.add(CB5,c);
    D.add(CB6,c);
    BA.addActionListener(this);
    BC.addActionListener(this);
    
            
    
    
            
    
    
    
    
    
}
public void actionPerformed(ActionEvent ae){
  if (ae.getSource().equals(BC)){
      
    

} if(ae.getSource().equals(BA)){
    
}
}
        
}
