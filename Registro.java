//Paquetes Principales
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Registro extends JFrame{
    //Atributos
    private JLabel unidad, calificacion;
    private JComboBox unidadsalida;
    private JTextField salidacalificacion;
    private JButton guardar, cancelar, observar, salir;
    private JPanel izquierda, central, sur;
    
    
    //Constructor
    public Registro(){
        Eventos manejador = new Eventos();
        Container contenedor3 = getContentPane();
        contenedor3.setLayout(new BorderLayout());
        izquierda = new JPanel(new GridLayout(2,0));
        central = new JPanel(new GridLayout(2,0));
        sur = new JPanel(new GridLayout(0,4));
        salidacalificacion = new JTextField(15);
        unidad = new JLabel("   Unidad");
        unidad.setFont(new Font("Helvetica",Font.ITALIC,20));
        calificacion = new JLabel("Calificación");
        calificacion.setFont(new Font("Helvetica",Font.ITALIC,20));
        unidadsalida = new JComboBox();
        unidadsalida.addItem(null);
        unidadsalida.addItem("I");
        unidadsalida.addItem("II");
        unidadsalida.addItem("III");
        unidadsalida.addItem("IV");
        unidadsalida.addItem("V");
        guardar = new JButton("Guardar");
        guardar.addActionListener(manejador);
        cancelar = new JButton("Regresar");
        cancelar.addActionListener(manejador);
        observar = new JButton("Mostrar");
        observar.addActionListener(manejador);
        salir = new JButton("Salir");
        salir.addActionListener(manejador);
        central.add(unidadsalida);
        central.add(salidacalificacion);
        izquierda.add(unidad);
        izquierda.add(calificacion);
        sur.add(guardar);
        sur.add(cancelar);
        sur.add(observar);
        sur.add(salir);
        contenedor3.add(central,BorderLayout.CENTER);
        contenedor3.add(izquierda,BorderLayout.WEST);
        contenedor3.add(sur,BorderLayout.SOUTH);
        setSize(400,400);
        setVisible(true);
        this.setTitle("REGISTRO DE CALIFICACIÓN");
        this.setLocationRelativeTo(null);
        izquierda.setBackground(Color.ORANGE);
        
    }
    
    //Metodo para Boton Guardar
    public void Guardar(){
        try{
        String uni =unidadsalida.getSelectedItem().toString();
        String cali =salidacalificacion.getText();
        Short a = Short.parseShort(cali);
      
        if( a>=0 && a<=69){
            JOptionPane.showMessageDialog(this, "Calificación No Valida");
            salidacalificacion.setText(null);
            unidadsalida.setSelectedIndex(0);
        }else if(a>100){
            JOptionPane.showMessageDialog(this, "Calificacion invalida");
            salidacalificacion.setText(null);
            unidadsalida.setSelectedIndex(0);
        }else{
            JOptionPane.showMessageDialog(this, "Calificacion guardada");
            salidacalificacion.setText(null);
            unidadsalida.setSelectedIndex(0);
            panchis(cali,uni);
               
        }
        
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Estas Ingresando carácteres");
            System.out.println(e);
        }catch(NullPointerException ef){
            JOptionPane.showMessageDialog(null,"No estas ingresando nada");
        }
     
    }
    
    //Metodo para Boton Regresar
    public void Cancelar(){
        FormuSemestre obj2 = new FormuSemestre();
        obj2.setVisible(true);   
    }
    
    public void Salir(){
        System.exit(0);
    }
    
    private void panchis(String cali, String uni) {
        File u = new File("Calificaciones.txt");
        try {
          
            FileWriter mu = new FileWriter(u);
            mu.write(uni);
            mu.write("\n");
            mu.write(cali);
            mu.close();
        } catch (Exception e) {
            System.out.println(e);

        }

    }
    
    public void Mostrar(){
        
        try{
        FileReader nu = new FileReader(new File("Calificaciones.txt"));
        BufferedReader br = new BufferedReader(nu);
        String linea = br.readLine();
        while(linea!=null){
            System.out.println(linea);
            linea=br.readLine();
        }
        br.close();
        nu.close();
        }catch(IOException e){
            System.out.println(e);
           
        }
    }
    
    //Metodo Principal
    public static void main(String args[]){
        Registro ventana3 = new Registro();
        ventana3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }

    
    class Eventos extends Formu2 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ev) {
            if(ev.getSource()== cancelar){
            Cancelar();
            }
            if(ev.getSource()== guardar){
                Guardar();
            }
            if(ev.getSource() == observar){
                Mostrar();
            }
            if(ev.getSource() == salir){
                Salir();
            }
        }
    }
}
