//Paquetes Principales
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

//Clase Principal
public class Formulario extends JFrame implements Formu{
    //Atributos
    private JTextField usuariosalida;
    private JLabel usuario, pasword, encabezado;
    private JButton aceptar, cancelar;
    private JPanel central;
    private JPanel izquierda;
    private JPanel sur;
    private JPasswordField contraseña;
    private byte intentos=0;
    
    //Constructor
    public Formulario(){
        Eventos manejador = new Eventos();
        Container contene = getContentPane();
        contene.setLayout(new BorderLayout());
        izquierda = new JPanel(new GridLayout(2,0));
        central = new JPanel(new GridLayout(2,0));
        central.setLayout(null);
        sur = new JPanel(new GridLayout(0,2));
        usuariosalida = new JTextField();
        usuariosalida.setBounds(25, 55, 200, 30);
        contraseña = new JPasswordField();
        contraseña.setBounds(25, 180, 200, 30);
        usuario = new JLabel("   Usuario");
        usuario.setFont(new Font("Helvetica",Font.ITALIC,20));
        pasword = new JLabel("  Password");
        pasword.setFont(new Font("Helvetica",Font.ITALIC,20));
        encabezado = new JLabel("         !BIENVENIDO¡");
        encabezado.setFont(new Font("Arial Black",Font.ITALIC,25));
        encabezado.setForeground(Color.WHITE);
        aceptar = new JButton("Aceptar");
        aceptar.addActionListener(manejador);
        cancelar = new JButton("Cancelar");
        cancelar.addActionListener(manejador);
        central.add(usuariosalida);
        central.add(contraseña);
        central.add(encabezado);
        izquierda.add(usuario);
        izquierda.add(pasword);
        add(encabezado);
        sur.add(aceptar);
        sur.add(cancelar);
        contene.add(central,BorderLayout.CENTER);
        contene.add(sur,BorderLayout.SOUTH);
        contene.add(izquierda,BorderLayout.WEST);
        contene.add(encabezado,BorderLayout.NORTH);
        setSize(350,350);
        setVisible(true);
        this.setTitle("AUTENTIFICACIÓN");
        this.getContentPane().setBackground(Color.ORANGE);
        this.setLocationRelativeTo(null);
        central.setBackground(Color.ORANGE);
        izquierda.setBackground(Color.ORANGE);
        
    }
    
    //Metodo para el Boton Cancelar
    @Override
    public void Cancelar(){
        usuariosalida.setText(null);
        contraseña.setText(null);
        System.exit(0);
    }
    
    //Metodo para el Boton Aceptar
    @Override
    public void Aceptar(){
       
        String user= usuariosalida.getText();
        char[] contra= contraseña.getPassword();
        String clavedef = new String(contra);

        if( user.equals("Uriel") & clavedef.equals("1234")){
        
        FormuSemestre obj = new FormuSemestre();
        obj.setVisible(true);
        
        
        }else if(intentos == 3){
            System.exit(0);
        }else{
            JOptionPane.showMessageDialog(this,"Usuario y Contraseña Incorrectos");
            intentos++;
        }
        
        try{
          contra[3]=(0);
                    
        }catch(ArrayIndexOutOfBoundsException j){
            JOptionPane.showMessageDialog(this,"Incompatible");
            System.out.println(j);
        }
    }
    
    //Metodo Principal
    public static void main(String args[]){
        Formulario ventana = new Formulario();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    
    //Clase Eventos de los Botones
    class Eventos extends Formu2 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ev) {
            if(ev.getSource()== aceptar){
            Aceptar();
            }
           if(ev.getSource() == cancelar){
            Cancelar();
         
           }   
        }    
    }
}
