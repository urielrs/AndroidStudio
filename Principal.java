/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo;

import java.io.File;



/**
 *
 * @author sonyc
 */
public class Principal {
    public static void main(String[] args) {
        String ruta = "C:/Users/sonyc/Documents/NetBeansProjects/analizadorLexico/src/codigo/Lexer.flex";
        generarLexer(ruta);
    }
 public static void generarLexer(String ruta){
     File archivo = new File(ruta);
     JFlex.Main.generate(archivo);
 }
}
