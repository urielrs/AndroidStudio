package main.java;

import javax.swing.JOptionPane;
public class Promedio {
    public static void main(String args[]){
        
        byte suma=0;
        byte x = 0;
        byte edad;
        float a;
        
        for(x=1; x<=5; x++){
            edad=Byte.parseByte(JOptionPane.showInputDialog("Captura tu edad"));
            
            suma= (byte)(suma + edad);
        }
        a=suma/5;
        System.out.println("El promedio de edades es:"+a);
    }
    
}
