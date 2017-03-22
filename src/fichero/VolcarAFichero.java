/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fichero;

import boletin22.Libro;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author ricky_000
 */
public class VolcarAFichero{
    PrintWriter fichero;
    FileWriter fich;
    
    public void AñadirAlFichero(String nomFich, Libro dato){
        try{
            fichero = new PrintWriter(new FileWriter(nomFich,true));
            fichero.println(dato);
        }catch(IOException ex){
            System.out.println("Erro2" + ex.getMessage());
        }
        finally{
            fichero.close();
        }
    }
}
