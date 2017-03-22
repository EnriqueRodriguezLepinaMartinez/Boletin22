/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fichero;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 *
 * @author ricky_000
 */
public class VolcarDesdeFichero {

    File fichero;
    FileReader lectura;
    BufferedReader contenido;

    public String[] volcarAlArray(String nomFich) throws IOException {
        String book1;
        String[] libros = null;
        try {
            fichero = new File(nomFich);
            lectura = new FileReader(fichero);
            contenido = new BufferedReader(lectura);
            book1 = contenido.readLine();
            libros = book1.split(",");
        } catch (IOException ex) {
            System.out.println("erro1" + ex.getMessage());
        } finally {
            lectura.close();
        }
       return libros; 
    }
}
