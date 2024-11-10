import javax.swing.JOptionPane;
public class ArreglosUni2 {
    public static void main(String [] args){
        byte arreA1 []=new byte [5];
        byte arreA2 []=new byte [5];
        short arreresult []=new short [6];
        byte a=4;
        byte i;
        for(i=0; i<5; i++){
            arreA1[i]=Byte.parseByte(JOptionPane.showInputDialog("Dame un valor"+arreA1[i]));
            System.out.print(arreA1[i]+"   ");
        }
        
        System.out.println("");
        for(i=0; i<5; i++){
            arreA2[i]=Byte.parseByte(JOptionPane.showInputDialog("Dame otros valores"+arreA2[i]));
            System.out.print(arreA2[i]+"   ");
        }
        System.out.println("");
        for(i=0; i<5;i++){
            arreresult[i]= (short) (arreA1[i] * arreA2[a]);
            a--;
            System.out.print(arreresult[i]+"    ");
            }
        
    }
       
        
}
