/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AGPeliculas;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Henry Paz
 */
public class EjemploAGPeliculas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            TestMovieFitness test = new TestMovieFitness();
            test.initialize("Accion");
            test.testSelectFittestMovies();
        } catch (Exception ex) {
            Logger.getLogger(EjemploAGPeliculas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
