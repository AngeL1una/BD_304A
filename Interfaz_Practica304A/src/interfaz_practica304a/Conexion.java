/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaz_practica304a;

import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import com.sun.jdi.connect.spi.Connection;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.plaf.RootPaneUI;


/**
 *
 * @author AngelXi
 */
public class Conexion {

    Connection conectar = null;
    
    String usuario = "root";
    String contraseña = "";
    String bd = "practica";
    String ip = "localhost";
    String puerto = "3306";
    
    String cadena = "jdbc:mysql://"+ip+":"+puerto+"/"+bd;
 
    
    public Connection establececonexion(){
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            DriverManager.getConnection(cadena, usuario, contraseña);
            JOptionPane.showMessageDialog(null, "conectado a la base de datos","Tecnologico Superior de Huatusco",JOptionPane.PLAIN_MESSAGE,new ImageIcon("C:\\Users\\52273\\Documents\\NetBeansProjects\\Interfaz_Practica304A\\src\\descargar.png"));
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error de conexion a bsade de datos"+e.toString(),"Tecnologico Superior de Huatusco",JOptionPane.PLAIN_MESSAGE,new ImageIcon("C:\\Users\\52273\\Documents\\NetBeansProjects\\Interfaz_Practica304A\\src\\interfaz_practica304a"));
            
            
        }
        return conectar;
        
    }
}
