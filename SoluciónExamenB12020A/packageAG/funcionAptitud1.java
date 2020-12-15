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
import org.jgap.FitnessFunction;
import org.jgap.IChromosome;

public class funcionAptitud1 extends FitnessFunction {

    private double fitness; //La variable que llevará el valor de aptitud

    public funcionAptitud1() {
        fitness = 0;
    }

    @Override
    protected double evaluate(IChromosome cromosoma) {
        Evaluar(cromosoma);
        return fitness;//agregar comprobacion de si es 50
    }

    private void Evaluar(IChromosome cromosoma) {
        Integer c1 = (Integer) cromosoma.getGene(0).getAllele();//Inicio entero X
        Integer c2 = (Integer) cromosoma.getGene(1).getAllele(); 
        Integer c3 = (Integer) cromosoma.getGene(2).getAllele();
        Integer c4 = (Integer) cromosoma.getGene(3).getAllele();
        Integer c5 = (Integer) cromosoma.getGene(4).getAllele();
        
        Integer c6 = (Integer) cromosoma.getGene(5).getAllele();//Signo Y
        Integer c7 = (Integer) cromosoma.getGene(6).getAllele();//Inicio entero Y
        Integer c8 = (Integer) cromosoma.getGene(7).getAllele();
        Integer c9 = (Integer) cromosoma.getGene(8).getAllele();
        Integer c10 = (Integer) cromosoma.getGene(9).getAllele(); 
        Integer c11 = (Integer) cromosoma.getGene(10).getAllele(); 
        Integer c12 = (Integer) cromosoma.getGene(11).getAllele(); 
        Integer c13 = (Integer) cromosoma.getGene(12).getAllele(); 
        Integer c14 = (Integer) cromosoma.getGene(13).getAllele(); 
        Integer c15 = (Integer) cromosoma.getGene(14).getAllele(); 
        Integer c16 = (Integer) cromosoma.getGene(15).getAllele(); 
        Integer c17 = (Integer) cromosoma.getGene(16).getAllele(); 
        Integer c18 = (Integer) cromosoma.getGene(17).getAllele(); 
        Integer c19 = (Integer) cromosoma.getGene(18).getAllele(); 
        Integer c20 = (Integer) cromosoma.getGene(19).getAllele(); 
        Integer c21 = (Integer) cromosoma.getGene(20).getAllele(); 
        Integer c22 = (Integer) cromosoma.getGene(21).getAllele(); 
        Integer c23 = (Integer) cromosoma.getGene(22).getAllele(); 
        Integer c24 = (Integer) cromosoma.getGene(23).getAllele(); //Fin entero Y
        
        String valorX =     c1.toString()  + c2.toString() + c3.toString() + c4.toString() + c5.toString();
        String valorY =     c7.toString() + c8.toString() + c9.toString() +  c10.toString() + c11.toString()  + c12.toString() + 
                            c13.toString() + c14.toString() + c15.toString()  + c16.toString() + c17.toString()  + c18.toString() + 
                            c19.toString()  + c20.toString() + c21.toString() + c22.toString() + c23.toString()  + c24.toString(); 
        
        
        int valorXint = (Integer.parseInt(valorX, 2));
        int valorYint = (Integer.parseInt(valorY, 2));

        if (c6 == 0) {
            valorYint = -valorYint;
        }
        System.out.println(valorXint + " ; " + valorYint);
        
        if (valorXint > 0 ) {
                fitness =   6345452 + (0.2585 * Math.pow(valorXint, 6) + (Math.pow(valorXint, 5) * (-19.338) )+ 
                            562.55 * Math.pow(valorXint, 4) + (Math.pow(valorXint, 3) * (-7979.2) )+ 
                            56266 * Math.pow(valorXint, 2) - (171797 * valorXint) - 8038.4);   
        }
    }
}
