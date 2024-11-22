import java.util.*;
public class Grafos {
    public static int [][] grafos(int[][] obj, int[][] obj1){
        int n = obj.length;
        int [][] mat = new int [n][n];
        copy(mat, obj);
        for (int x=0; x<n; x++)
            for(int i=0; i<n; i++)
                for(int j=0; j<n; j++)
                    if(mat[i][x] + mat[x][j] < mat [i][j]){
                        mat[i][j] = mat[i][x] + mat [x][j];
                        obj1[i][j] = obj1[x][j];
                    }
        return mat;
    }
    public static void copy(int[][] a, int[][]b){
        for(int i=0; i<a.length; i++)
            for(int j=0; j<a[0].length;j++)
                a[i][j] = b[i][j];
    }
    public static void main(String[]args){
    
    
    Scanner distancia = new Scanner(System.in);
    int [][] dist = new int[7][7];
    dist[0][0] = 0;
    dist[0][1] = 2;
    dist[0][2] = 6;
    dist[0][3] = 10000;
    dist[0][4] = 10000;
    dist[0][5] = 10000;
    dist[0][6] = 10000;
    dist[1][0] = 2;
    dist[1][1] = 0;
    dist[1][2] = 10000;
    dist[1][3] = 5;
    dist[1][4] = 10000;
    dist[1][5] = 10000;
    dist[1][6] = 10000;
    dist[2][0] = 6;
    dist[2][1] = 10000;
    dist[2][2] = 0;
    dist[2][3] = 8;
    dist[2][4] = 10000;
    dist[2][5] = 10000;
    dist[2][6] = 10000;
    dist[3][0] = 10000;
    dist[3][1] = 5;
    dist[3][2] = 8;
    dist[3][3] = 0;
    dist[3][4] = 16;
    dist[3][5] = 15;
    dist[3][6] = 10000;
    dist[4][0] = 10000;
    dist[4][1] = 10000;
    dist[4][2] = 10000;
    dist[4][3] = 16;
    dist[4][4] = 0;
    dist[4][5] = 6;
    dist[4][6] = 2;
    dist[5][0] = 10000;
    dist[5][1] = 10000;
    dist[5][2] = 10000;
    dist[5][3] = 15;
    dist[5][4] = 6;
    dist[5][5] = 0;
    dist[5][6] = 6;
    dist[6][0] = 10000;
    dist[6][1] = 10000;
    dist[6][2] = 10000;
    dist[6][3] = 10000;
    dist[6][4] = 2;
    dist[6][5] = 6;
    dist[6][6] = 0;
    int [][]vertices;
    int [][]obj1 = new int [7][7];
    
    }
}
    