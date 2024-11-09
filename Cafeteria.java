import java.util.Scanner;
public class Cafeteria {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Fiesta en la Cafe");
        System.out.println("¿Cuanto vas a pagar?");
        byte t;
        t=sc.nextByte();
        System.out.println("¿Que bola sacastes de la urna. Presiona 1.-Verde, 2.-Amarilla, 3.-Roja");
        
        byte p,s;
        short n,t1;
        
        p=sc.nextByte();
        
        if(p==1){
            n=(short) (t * 0.1);
            t1= (short) (t - n);
            System.out.println("Tienes un 10% de descuento:"+t1);
        }else if(p==2){
            n=(short) (t * 0.05);
            t1= (short) (t - n);
            System.out.println("Tienes un 5% de descuento:"+t1);
        }else if(p==3){
            n=(short) (t * 0.15);
            t1= (short) (t - n);
            System.out.println("Tienes 15% de descuento:"+t1);
        }
        System.out.println("¿Eres alumno de Sistemas? Si presiona 1");
        
        s=sc.nextByte();
        
        if(s==1){
            System.out.println("Te ganaste un jugo");
        }else{
            System.out.println("Debes ser alumno de Sistemas");
        }
    }
}
