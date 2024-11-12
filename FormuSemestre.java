//Paquetes Principales
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
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

public class FormuSemestre extends JFrame implements Formu{
    //Atributos
    private JLabel semestre, periodo, materia, isic;
    private JButton aceptar, cancelar, datos;
    private JComboBox salidasemestre, salidaperiodo, salidamateria;
    private JPanel izquierda, central, norte, sur;
    
    //Constructor
    public FormuSemestre(){
        Eventos manejador = new Eventos();
        Container contenedor2 = getContentPane();
        contenedor2.setLayout(new BorderLayout());
        izquierda = new JPanel(new GridLayout(3,0));
        central = new JPanel(new GridLayout(3,0));
        sur = new JPanel(new GridLayout(0,3));
        norte = new JPanel(new GridLayout(0,1));
        semestre = new JLabel(" Semestre");
        semestre.setFont(new Font("Helvetica",Font.ITALIC,20));
        periodo = new JLabel("  Periodo");
        periodo.setFont(new Font("Helvetica",Font.ITALIC,20));
        materia = new JLabel("  Materia");
        materia.setFont(new Font("Helvetica",Font.ITALIC,20));
        isic = new JLabel("   Ing.Sistemas Computacionales");
        isic.setFont(new Font("Arial Black",Font.ITALIC,18));
        isic.setForeground(Color.WHITE);
        aceptar = new JButton("Aceptar");
        aceptar.addActionListener(manejador);
        cancelar = new JButton("Cancelar");
        cancelar.addActionListener(manejador);
        datos = new JButton("Consulta");
        datos.addActionListener(manejador);
        salidasemestre = new JComboBox();
        salidasemestre.addItem(null);
        salidasemestre.addItem("2 Sem");
        salidasemestre.addItem("4 Sem");
        salidasemestre.addItem("6 Sem");
        salidasemestre.addItem("8 Sem");
        salidaperiodo = new JComboBox();
        salidaperiodo.addItem(null);
        salidaperiodo.addItem("2023-1");
        salidaperiodo.addItem("2024-1");
        salidaperiodo.addItem("2025-1");
        salidaperiodo.addItem("2026-1");
        salidamateria = new JComboBox();
        salidamateria.addItem(null);
        salidamateria.addItem("POO");
        salidamateria.addItem("Probabilidad y Estadistica");
        salidamateria.addItem("Algebra Lineal");
        salidamateria.addItem("Calculo Integral");
        salidamateria.addItem("Ingles");
        salidamateria.addItem("Fisica");
        salidamateria.addItem("Taller de Administracion");
        central.add(salidasemestre);
        central.add(salidaperiodo);
        central.add(salidamateria);
        izquierda.add(semestre);
        izquierda.add(periodo);
        izquierda.add(materia);
        sur.add(aceptar);
        sur.add(cancelar);
        sur.add(datos);
        norte.add(isic);
        contenedor2.add(central,BorderLayout.CENTER);
        contenedor2.add(izquierda,BorderLayout.WEST);
        contenedor2.add(sur,BorderLayout.SOUTH);
        contenedor2.add(norte,BorderLayout.NORTH);
        setSize(350,350);
        setVisible(true);
        this.setTitle("SELECCIÓN SEMESTRE");
        this.setLocationRelativeTo(null);
        central.setBackground(Color.ORANGE);
        izquierda.setBackground(Color.ORANGE);
        norte.setBackground(Color.ORANGE);
    }
    
    @Override
    public void Aceptar(){
        Registro ventana3 = new Registro();
        ventana3.setVisible(true);
        
       
        try{
        String sem =salidasemestre.getSelectedItem().toString();
        String peri =salidaperiodo.getSelectedItem().toString();
        String materi =salidamateria.getSelectedItem().toString();
       
        }catch(NullPointerException u){
            JOptionPane.showMessageDialog(this,"No estan llenas las casillas");
            System.out.println(u);
        }
        
    }
    
    @Override
    public void Cancelar(){
        salidasemestre.setSelectedIndex(0);
        salidaperiodo.setSelectedIndex(0);
        salidamateria.setSelectedIndex(0);
        
        System.exit(0);
        
    }
        
    
    public void Datos(){
        
        try{
            File file = new File("Isic.txt");
            BufferedReader br = new BufferedReader(new FileReader (file));
            String u;
            while((u = br.readLine())!=null){
                System.out.println(u);
            }
            br.close();
        }catch(IOException e){
            JOptionPane.showMessageDialog(this,"No se encuentra el archivo");
            System.out.println(e);
        }
    }
       
    //Metodo Principal
    public static void main(String args[]){
        FormuSemestre ventana2 = new FormuSemestre();
        ventana2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    class Eventos extends Formu2 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ev) {
         if (ev.getSource() == aceptar)
             Aceptar();
         if (ev.getSource() == cancelar)
             Cancelar();
         if (ev.getSource() == datos)
             Datos();
      }
    }
}
