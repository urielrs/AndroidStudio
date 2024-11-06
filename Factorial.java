import javax.swing.JOptionPane;
public class Factorial {
    public static void main(String [] args){
        
        byte num=0;
        short f=1;
        long num1=1;
        
        num=Byte.parseByte(JOptionPane.showInputDialog("Dame un numero para calcular el factorial"));
        for(num=num; num>=1; num--){
            
            f=(short)(num-1);
            System.out.print(+num+"*");
            num1=(long) (num * num1);
        }
        System.out.println("="+num1);
    }
    
}
