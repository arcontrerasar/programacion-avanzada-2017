/*
*EditorLineaxLinea.java Una clase para crear archivos de texto introduciendo 
* linea por linea (una linea de texto cada vez)
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejodeventos;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.ActionListener;//
import java.awt.event.ActionEvent;//Paso 1 de 5
/**
 *
 * @author Sala2
 * 
 */
////public class EditorLineaxLinea implements WindowListener{
public class EditorLineaxLinea implements ActionListener{//paso 2/5 se implementa action listener 
   
Frame F;
TextArea TA;
Button B;
TextField TF;
Panel P;
GridLayout GL;
BorderLayout BL;
public EditorLineaxLinea(){
    F=new Frame("Editor linea por linea");
    F.setLayout(BL=new BorderLayout());
    TA=new TextArea();
    F.add(TA,BorderLayout.CENTER);
    P=_hacerPanel();
    B.addActionListener(this);//paso 3/5
    F.add(P,BorderLayout.SOUTH);
    F.setSize(400, 300);
    F.setLocationRelativeTo(null);
    F.addWindowListener(new WindowAdapter(){
    public void windowClosing(WindowEvent we) {
      F.dispose();
      System.exit(0);
   }
});
    TF.requestFocus();
    F.setVisible(true);
} 

    private Panel _hacerPanel() {
     Panel Presult=new Panel();
     Presult.setLayout(GL=new GridLayout(1,2));
     Presult.add(TF=new TextField(100));
     B=new Button("AGREGAR");
     B.setMaximumSize(new Dimension(60,25));
     Presult.add(B);
     return Presult;
    }
////    public void actionPerfomed(ActionEvent ae){//paso 4/5 interface action listener
////        Boolean Bool=false;
////        if(ae.getSource().equals(B)){//paso 5/5
////            String S=TA.getText(),s="";
////            s=(S.equals(s))?s:"\n";
////            S=S+s+TF.getText();
////            TA.setText(S);
////            TF.requestFocus();
////
////        }
////        
//    }
    public static void main(String[] args) {
        new EditorLineaxLinea();
    }

////    @Override
////    public void windowOpened(WindowEvent we) {
////        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
////    }
////
////    @Override
////    public void windowClosing(WindowEvent we) {
////        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
////    }
////
////    @Override
////    public void windowClosed(WindowEvent we) {
////        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
////    }
////
////    @Override
////    public void windowIconified(WindowEvent we) {
////        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
////    }
////
////    @Override
////    public void windowDeiconified(WindowEvent we) {
////        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
////    }
////
////    @Override
////    public void windowActivated(WindowEvent we) {
////        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
////    }
////
////    @Override
////    public void windowDeactivated(WindowEvent we) {
////        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
////    }

  
    public void actionPerformed(ActionEvent ae) {
        Boolean Bool=false;
        if(ae.getSource().equals(B)){//paso 5/5
            String S=TA.getText(),s="";
            s=(S.equals(s))?s:"\n";
            S=S+s+TF.getText();
            TA.setText(S);
            TF.requestFocus();

        }
    }
}
