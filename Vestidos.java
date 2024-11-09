import javax.swing.JOptionPane;
public class Vestidos {
    public static void main(String [] args){
        byte opcion;
        short x, c;
        opcion=Byte.parseByte(JOptionPane.showInputDialog("Selecciona la talla a elegir:\n 1.-Chica:\n 2.-Mediana:\n 3.-Grande"));
        switch(opcion){
            case 1:
                System.out.println("Costo de la talla chica=300");
                c=Byte.parseByte(JOptionPane.showInputDialog("¿Cuantos vestidos deseas comprar?"));
                x=(short) (c * 300);
                System.out.println("El total es: $"+x);
                break;
            
            case 2:
                System.out.println("Costo de la talla mediana=400");
                c=Byte.parseByte(JOptionPane.showInputDialog("¿Cuantos vestidos deseas comprar?"));
                x=(short) (c * 400);
                System.out.println("El total es: $"+x);
                break;
                
            case 3:
                System.out.println("Costo de la talla grande=500");
                c=Byte.parseByte(JOptionPane.showInputDialog("¿Cuantos vestidos deseas comprar?"));
                x=(short) (c * 500);
                System.out.println("El total es: $"+x);
                break;
                
            default: System.out.print("Opcion no existente");
                
        }

    }
}
