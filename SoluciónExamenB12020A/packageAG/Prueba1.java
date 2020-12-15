/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packageAG;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author César Taco
 */
import org.jgap.Chromosome;
import org.jgap.Configuration;
import org.jgap.FitnessFunction;
import org.jgap.Gene;
import org.jgap.Genotype;
import org.jgap.IChromosome;
import org.jgap.InvalidConfigurationException;
import org.jgap.impl.DefaultConfiguration;
import org.jgap.impl.IntegerGene;

public class Prueba1 {

    public int empezar() {
        int mejorIndividuo = 0;
        try {
            //Configuramos JGAP
            Configuration.reset();
            Configuration configuracion = new DefaultConfiguration();
            
            FitnessFunction myFunc = new funcionAptitud1();
            configuracion.setFitnessFunction(myFunc); //Le indicamos a JGAP cual sera nuestra funcion de aptitud
            Gene[] genEjemplo = new Gene[24];

            //Creamos una codificacion de 8 genes que nos servira para nuestros individuos (fenotipo)
            //Los genes seran valores entre 0 y 1  ejem 01001110 individuo ejemplo
            for(int i = 0; i < genEjemplo.length; i++){
                genEjemplo[i] = new IntegerGene(configuracion, 0, 1);
            }
            
            //Recordemos que los cromosomas son el correspondiente a los individuos
            //Creamos un individuo a partir de la configuracion de los genes anterior
            Chromosome cromosomaNumero = new Chromosome(configuracion, genEjemplo);
            //Le indicamos a JGAP un ejemplo de como seran los individuos, a partir del individuo de ejemplo que creamos
            configuracion.setSampleChromosome(cromosomaNumero);
            configuracion.setPopulationSize(5); //Creamos nuestra poblacion inicial
            //Creamos el genotipo de la poblacion
            //Recordemos que el genotipo se determina del fenotipo = la configuracion de los genes para un cromosoma particular
            Genotype population = Genotype.randomInitialGenotype(configuracion);
            //Comienza a iterar el algoritmo
            System.out.println("Poblacion inicial");
            Mostrar show = new Mostrar();
            for (int m = 0; m < 6; m++) { //50 iteraciones, cada iteracion sera una generacion
                System.out.println("-------------------Inicio generacion-------------------");
                System.out.println("Iteracion #" + (m + 1));
                show.mostrarTodosIndividuos(population.getChromosomes());
                population.evolve(10);
                show.mostrarTodosIndividuos(population.getChromosomes());
                IChromosome mejor_individuo = population.getFittestChromosome(); //Obtenemos el mejor individuo para esta generacion
                System.out.println("Mejor Individuo de la generacion " + m + " :");
                show.mostrarIndividuo(mejor_individuo);
                System.out.println("Valor de aptitud obtenido:" + mejor_individuo.getFitnessValue());
                System.out.println("-------------------Fin generacion-------------------");
            }
            System.out.println("Mejor individuo: ");
            System.out.println("Semana: " + show.mostrarIndividuo(population.getFittestChromosome())); //mejor individuo obtenido
            mejorIndividuo = show.mostrarIndividuo(population.getFittestChromosome());
        } catch (InvalidConfigurationException ex) {
            System.out.println("No se pudo ejecutar el AG");
        }
        return mejorIndividuo;
    }
}

