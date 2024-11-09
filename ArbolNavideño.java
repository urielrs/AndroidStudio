
public class ArbolNavideño {
    public static void main(String args []){
        
        System.out.println("Feliz Navidad, Grupo 3101");
        
        byte p=15;
        byte a=0;
        int spc=0;
        
        for(byte n=a; n<=p; n+=2){
            
            spc = ((p/2)-a);
            String espacio;
            espacio = new String(new char[spc]).replace("\0", " ");
            String aster;
            aster = new String(new char[n + 1]).replace("\0", "*");
            System.out.println(espacio + aster);
            
            a++;
        }
        byte z=12;
        for(byte i=a; i<z; i++){
            spc = (8+(z/2)-a);
            String espacio;
            espacio = new String(new char[spc]).replace("\0"," ");
            String aster;
            aster = new String(new char[3]).replace("\0","*");
            System.out.println(espacio + aster);
        }
        
    }
    
}
