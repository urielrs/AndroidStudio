import javax.swing.JOptionPane;
public class ArreglosUni {
    public static void main(String [] args){
        byte arre []= new byte[5];
        String titulos []= {"Uni1","Uni2","Uni3","Uni4","Uni5"};
        byte i;
        float suma=0;
        for( i=0; i<5; i++){
            arre [i]=Byte.parseByte(JOptionPane.showInputDialog("Dame la calificacion de la"+titulos[i]));
            
            suma+=arre[i];
            System.out.print(titulos[i]+"    ");
        }
        suma/=i;
        
        System.out.println("promedio");
        for(i=0; i<5; i++){
            System.out.print(arre[i]+"      ");
        }
        System.out.println(suma);
    }
    
}
