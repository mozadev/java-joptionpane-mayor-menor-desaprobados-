package desaprobados;

import javax.swing.JOptionPane;


public class desaprobados {

    
    public static void main(String[] args) {
           int num;
        
        
        
        num=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el tamaño del arreglo"));
        
            int[]notas=new int[num];
     
        for (int i = 0; i < notas.length; i++) {
          
            notas[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor["+i+"]"));
            
        }
            
        int mayor=notas[0];
        int menor=notas[0];
        for (int i = 0; i < notas.length; i++) {
            if(notas[i]>mayor){
                mayor=notas[i];
                
            }
            if(notas[i]<menor){
                menor=notas[i];
                
            }
             
    }
        
       JOptionPane.showMessageDialog(null, "El numero de mayor  es:  "+mayor);
       JOptionPane.showMessageDialog(null, "El número de desaprobados es: "+menor);
       
    }
    
}