import java.util.Scanner;
public class CarreraAtletica {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        
        byte cred;
        byte d;
        System.out.println("¿Participastes en el desfile? Si presiona 1");
        d=sc.nextByte();
        cred=0;
        cred=(byte) (cred+0);
        if(d==1) {
        
            cred=(byte) (cred+1);
            
            System.out.println("Ganastes un credito en que taller estas inscrito 1.-Danza, 2.-Basquetbol, 3.-Futbol, 4.-TKD, 5.-Voleibol");
            byte t;
            t=sc.nextByte();
            
            if(t==1){
                System.out.println("Uniforme escolar");
            } else {
                if(t==2){
                    System.out.println("Blanco");
                } else {
                    if(t==3){
                        System.out.println("verde");
                    } else {
                        if(t==4){
                            System.out.println("Uniforme TKD");
                        } else {
                            System.out.println("Rojo");
                        }
                    }
                }
            }    
        } else {
          cred=(byte) (cred+0);  
        }
        
        System.out.println("¿Participastes en la carrera. Si presiona 1");
        byte c;
        c=sc.nextByte();
        if(c==1) {
            cred=(byte) (cred+1);
            System.out.println("Obtuviste uno de los tres primeros lugares. Si presiona 1");
            byte resp;
            resp=sc.nextByte();
            if(resp==1){
                cred=(byte) (cred+1);
                System.out.println("Total de creditos:"+cred);
            } else{
             cred=(byte) (cred+0);
                System.out.println("Total de creditos:"+cred);
            }
        }else{
         cred=(byte) (cred+0);   
        }
    }
    
}
