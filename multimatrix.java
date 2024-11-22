
import java.io.*;

public class multimatrix {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int a[][];
		int b[][];
		int c[][];
		int columnas;
		int filas;
		int i;
		int j;
		int suma;
		int z;
		System.out.println("Ingresa el tama�o de la matriz");
		filas = Integer.parseInt(bufEntrada.readLine());
		columnas = Integer.parseInt(bufEntrada.readLine());
		a = new int[filas][columnas];
		b = new int[filas][columnas];
		c = new int[filas][columnas];
		if (filas==columnas && filas>1) {
			System.out.println("LLenado de la matriz A");
			for (i=1;i<=filas-1;i++) {
				for (j=1;j<=columnas-1;j++) {
					System.out.println("Ingresa un numero");
					a[i-1][j-1] = Integer.parseInt(bufEntrada.readLine());
				}
			}
			System.out.println("LLenado de la matriz B");
			for (i=1;i<=filas-1;i++) {
				for (j=1;j<=columnas-1;j++) {
					System.out.println("Ingresa un numero");
					b[i-1][j-1] = Integer.parseInt(bufEntrada.readLine());
				}
			}
			suma = 0;
			for (z=1;z<=filas-1;z++) {
				for (i=1;i<=filas-1;i++) {
					for (j=1;j<=columnas-1;j++) {
						suma = suma+a[i-1][j-1]*b[j-1][z-1];
					}
					c[z-1][i-1] = suma;
					suma = 0;
				}
			}
			System.out.println("Matriz A");
			for (i=1;i<=filas-1;i++) {
				for (j=1;j<=columnas-1;j++) {
					System.out.print(a[i-1][j-1]+" ");
				}
				System.out.println("");
			}
			System.out.println("Matriz B");
			for (i=1;i<=filas-1;i++) {
				for (j=1;j<=columnas-1;j++) {
					System.out.print(b[i-1][j-1]+" ");
				}
				System.out.println("");
			}
			System.out.println("Matriz C");
			for (i=1;i<=filas-1;i++) {
				for (j=1;j<=columnas-1;j++) {
					System.out.print(c[i-1][j-1]+" ");
				}
				System.out.println("");
			}
		}
	}


}

