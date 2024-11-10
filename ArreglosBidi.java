import javax.swing.JOptionPane;
public class ArreglosBidi {
    public static void main(String [] args){
        byte[] arre1[]=new byte[6][6];
        byte x, y;
        short promuni = 0;
        short sumaUni = 0;
    
        String materia []={"Matematicas Discretas      ", "Fundamentos de Programacion ", "Quimica                     ", "Calculo Diferencial         ", "Fundamentos de Investigacion", "Desarrollo Sustentable      "};
        String unidad []={"Unidad 1", "Unidad 2", "Unidad 3", "Unidad 4", "Unidad 5"};
        System.out.println("\t\t\t\tUnidad 1\tUnidad 2\tUnidad 3\tUnidad 4\tUnidad 5\t\tPromedio");
        System.out.println("");
        for(x=0; x<6;x++){
            short suma = 0;
            System.out.print(materia[x]);
            for(y=0; y<5; y++){
                arre1[x][y]=Byte.parseByte(JOptionPane.showInputDialog("Dame tu calificación de   "+materia[x]+"  de  la Unidad "+y));
        
                System.out.print("\t   "+arre1[x][y]+"    ");
                suma+=arre1[x][y];
                        
            }
            promuni=(byte)(suma/5);
            sumaUni += promuni;
            arre1[x][5]=(byte) promuni;
            System.out.println("\t\t  "+arre1[x][5]);
            System.out.print("\n");
                
        }
        byte promeGe = (byte)(sumaUni/6);
        System.out.print("El promedio general es: " +promeGe);   
    }
    
}
