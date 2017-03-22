/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin22;
import fichero.VolcarDesdeFichero;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author ricky_000
 */
public class Boletin22 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
         Libreria biblioteca = new Libreria();
        
        //Pasar el fichero al ArrayList.
        VolcarDesdeFichero cargar = new VolcarDesdeFichero(); 
        String[] cargando = cargar.volcarAlArray("libros.txt");
        String tit = cargando[0];
        String aut= cargando[1];
        String price = cargando[2];
        String cant = cargando[3];
        biblioteca.añadirLibro(tit, aut, Integer.valueOf(price), Integer.valueOf(cant));
          
                
        String br = System.lineSeparator();
    int opcion = Integer.parseInt(JOptionPane.showInputDialog("Escoge una opción: " + br + "0) Añadir libro " + br + "1) Consultar libro " + br + "2) Visualizar libro" + br + "3) Borrar libro" + br + "4) Modificar precio libro " + br + "5) Ordenar por titulo" + br + "6) Buscar por autor"));
    
    switch(opcion){
        case 0:
            String nombre = JOptionPane.showInputDialog("Titulo del libro:");
            String autor = JOptionPane.showInputDialog("Nombre del autor:");
            int precio = Integer.parseInt(JOptionPane.showInputDialog("Precio:"));
            int uds = Integer.parseInt(JOptionPane.showInputDialog("Unidades:"));
            biblioteca.añadirLibro(nombre,autor,precio,uds);
            biblioteca.añadirLibroAFichero();
            break;
        case 1:
           String consultautor = JOptionPane.showInputDialog("Titulo del libro:");
           biblioteca.consultar(consultautor);
           break;
        case 2:
            biblioteca.visualizar();
            break;
        case 3:
            biblioteca.borrar();
    }
  }
}
