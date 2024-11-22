import java.util.ArrayList; 
import javax.swing.JOptionPane;
import java.math.*;


public class Gauss { 

static int var=3;
static String sal="";
static double d;
static double p;
static float  matrix [][]= new float [var][var+1];

	public static void main(String args[]){ 
  
    matrixf();
    //matrixm();
    jordan();
    
} 

public static void matrixm(){
	
	for(int i=0; i<var; i++){
		for(int j=0; j<var+1; j++){
		String ell="INTRODUZCA EL ELEMENTO : "+i+" "+j;	
			
		 matrix[i][j] = Float.parseFloat(JOptionPane.showInputDialog(ell));	
			
		}
	}
	
}


public static void matrixf(){
		
	matrix[0][0] = 6600f;
    	matrix[0][1] = -5600f;
    	matrix[0][2] = 0f;
    	matrix[0][3] = 3f;
    
    	matrix[1][0] = -5600f;
    	matrix[1][1] = 11100f;
    	matrix[1][2] = 2200f;
    	matrix[1][3] = 9f;
    	
    	matrix[2][0] = 0f;
    	matrix[2][1] = 2200f;
    	matrix[2][2] = 6900f;
    	matrix[2][3] = 6f;
    	
	
}

 static void pivote(float matriz[][], int piv, int var) {
        float temp = 0;
        temp = matriz[piv][piv];
        for (int y = 0; y < (var + 1); y++) {

            matriz[piv][y] = matriz[piv][y] / temp;
        }
    }
    
    static void hacerceros(float matriz[][], int piv, int var) {
        for (int x = 0; x < var; x++) {
            if (x != piv) {
                float c = matriz[x][piv];
                for (int z = 0; z < (var + 1); z++) {
                    matriz[x][z] = ((-1 * c) * matriz[piv][z]) + matriz[x][z];
                }
            }
        }
    }
    
    static void muestramatriz(float matriz[][], int var) {
        for (int x = 0; x < var; x++) {
            for (int y = 0; y < (var + 1); y++) {
            	//sal+= " " + matriz[x][y] + " |";
                System.out.print(" " + matriz[x][y] + " |");
            }
           
            System.out.println("");
           // JOptionPane.showMessageDialog(null,sal,"GAUSS-JORDAN",JOptionPane.ERROR_MESSAGE);
        }

    }
    

public static void jordan(){
	int piv=0;
    
    for (int a = 0; a < var; a++) {
            pivote(matrix, piv, var);

            System.out.println("\tRenglon " + (a + 1) + " entre el pivote");
            muestramatriz(matrix, var);

            System.out.println("");

            System.out.println("\tHaciendo ceros");
            hacerceros(matrix, piv, var);

            muestramatriz(matrix, var);
            System.out.println("");
            piv++;
        }
        for (int x = 0; x < var; x++) {
           // System.out.println("La variable X" + (x + 1) + " es: " + matrix[x][var]);
          	sal+= "La variable X" + (x + 1) + " es: " + matrix[x][var]+"\n";	
        }
        
    JOptionPane.showMessageDialog(null,sal,"GAUSS-JORDAN",JOptionPane.ERROR_MESSAGE);
    
 
}

}
