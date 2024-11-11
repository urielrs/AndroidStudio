//Paquetes
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class Encriptado extends JFrame{
        //Atributos
       private JTextField entrada;
       private JLabel entradaLbl, salida, salidaCadena;
       private JButton encriptar, desencriptar, limpiar, salir;
       private JPanel central;
       private JLabel encabezado;
       //Constructor
       public Encriptado(){
           Eventos manejador = new Eventos();
           Container contenedor= getContentPane();
           contenedor.setLayout(new BorderLayout());
           central = new JPanel(new GridLayout(4,2));
           entrada= new JTextField(10);
           entradaLbl = new JLabel("Texto Encriptar");
           salida = new JLabel("Encriptar");
           salidaCadena = new JLabel("Desencriptar");
           encriptar = new JButton("ENCRIPTAR");
           encriptar.addActionListener(manejador);
           desencriptar = new JButton("DESENCRIPTAR");
           desencriptar.addActionListener(manejador);
           encabezado = new JLabel("EJERCICIO PARA ENCRIPTAR");
           limpiar = new JButton("limpiar");
           limpiar.addActionListener(manejador);
           salir = new JButton("Salir");
           salir.addActionListener(manejador);
           entradaLbl.setForeground(Color.BLUE);
           encabezado.setForeground(Color.RED);
           central.add(entradaLbl);
           central.add(entrada);
           central.add(encriptar);
           central.add(salida);
           central.add(desencriptar);
           central.add(salidaCadena);
           central.add(encabezado);
           central.add(limpiar);
           central.add(salir);
           contenedor.add(central,BorderLayout.CENTER);
           contenedor.add(encabezado,BorderLayout.NORTH);
           setSize(300,300);
           setVisible(true);
           this.setTitle("Ejercicio para Encriptar");
       }
       public void Activar(){
           int l, i;
           String encriptado;
           char array[] = entrada.getText().toCharArray();
           l=array.length;
           for(i=0; i<l; i++){
               array[i]=(char)(array[i]+ (char)l);
           }
           encriptado = String.valueOf(array);
           salida.setText(encriptado);
       }
       public void Desactivar(){
           int l, i;
           String desencriptado;
           char array[] = salida.getText().toCharArray();
           l=array.length;
           for(i=0; i<l; i++){
               array[i]=(char)(array[i]- (char)l);
           }
           desencriptado = String.valueOf(array);
           salidaCadena.setText(desencriptado);
       }
       public void Limpiar(){
           entrada.setText(null);
           salida.setText(null);
           salidaCadena.setText(null);
    
       }
       public void SalirMenu(){
           System.exit(0);
       }
       //Metodo principal
       public static void main(String[]args){
           Encriptado ventana= new Encriptado();
           ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       } 
       
       class Eventos implements ActionListener{
          @Override
          public void actionPerformed(ActionEvent ev){
              if(ev.getSource() == encriptar){
                  Activar();
              }
              if(ev.getSource() == desencriptar){
                  Desactivar();
              }
              if (ev.getSource() == limpiar){
                  Limpiar();
              }
              if (ev.getSource() == salir){
                  SalirMenu();
              }
          }
       }  
}
