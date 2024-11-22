

public class ProductoCartesiano{
    public static void main (String []args){
      System.out.println("Si el conjunto A son los numeros pares que 20");
      System.out.println("Si el conjuunto B son los numeros impares menores que 20");
      System.out.println("¿Cual es el conjunto de AxB");
      byte A;
      A=2;
      while (A<=20){
      
      byte B;
      B=1;
      while (B<19){
         B++;
         System.out.println("AxB="+A+ ","+B);
      }
      A++;
      }   
    }
}