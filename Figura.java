public interface Figura {
    public void calcularArea();
    public static void main(String args[]){
        Triangulo obj1 = new Triangulo();
        obj1.calcularArea();
        Rectangulo obj2 = new Rectangulo();
        obj2.calcularArea();
    }
}
