/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin22;

import fichero.VolcarAFichero;
import java.util.ArrayList;

/**
 *
 * @author ricky_000
 */
public class Libreria extends VolcarAFichero {

    public ArrayList<Libro> libreria = new ArrayList<>();

    VolcarAFichero fichero = new VolcarAFichero();

    public ArrayList<Libro> añadirLibro(String nombre, String autor, int precio, int uds) {
        libreria.add(new Libro(nombre, autor, precio, uds));
        return libreria;
    }

    public void añadirLibroAFichero() {
        for (int i = 0; i < libreria.size(); i++) {
            fichero.AñadirAlFichero("libros.txt", libreria.get(i));
        }
    }

    public void consultar(String titulo) {
        for (int i = 0; i < libreria.size(); i++) {
            if (titulo.equals(libreria.get(i).nombre)) {
                System.out.println(libreria.get(i).precio + "euros");
            } else {
                System.out.println("Libro descatalogado");
            }
        }
    }

    public void visualizar() {
        for (int i = 0; i < libreria.size(); i++) {
            System.out.println(libreria.get(i).toString());
        }
    }
    
    public void borrar(){
        for (int i = 0; i < libreria.size(); i++) {
            if(libreria.get(i).unidades == 0){
                libreria.remove(i);
            }
        }       
    }    
}
