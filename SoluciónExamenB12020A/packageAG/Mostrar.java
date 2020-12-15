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
import org.jgap.IChromosome;

public class Mostrar {

    Integer c1, c2, c3, c4, c5, c6, c7, c8, c9,  c10, c11, c12, c13, 
            c14, c15, c16, c17, c18, c19, c20, c21, c22, c23, c24;

    public int mostrarIndividuo(IChromosome ind) {
        
        c1 = (Integer) ind.getGene(0).getAllele();
        c2 = (Integer) ind.getGene(1).getAllele();
        c3 = (Integer) ind.getGene(2).getAllele();
        c4 = (Integer) ind.getGene(3).getAllele();
        c5 = (Integer) ind.getGene(4).getAllele();
        c6 = (Integer) ind.getGene(5).getAllele();
        c7 = (Integer) ind.getGene(6).getAllele();
        c8 = (Integer) ind.getGene(7).getAllele();
        c9 = (Integer) ind.getGene(8).getAllele();
        c10 = (Integer) ind.getGene(9).getAllele();
        c11 = (Integer) ind.getGene(10).getAllele();
        c12 = (Integer) ind.getGene(11).getAllele();
        c13 = (Integer) ind.getGene(12).getAllele();
        c14 = (Integer) ind.getGene(13).getAllele();
        c15 = (Integer) ind.getGene(14).getAllele();
        c16 = (Integer) ind.getGene(15).getAllele();
        c17 = (Integer) ind.getGene(16).getAllele();
        c18 = (Integer) ind.getGene(17).getAllele();
        c19 = (Integer) ind.getGene(18).getAllele();
        c20 = (Integer) ind.getGene(19).getAllele();
        c21 = (Integer) ind.getGene(20).getAllele();
        c22 = (Integer) ind.getGene(21).getAllele();
        c23 = (Integer) ind.getGene(22).getAllele();
        c24 = (Integer) ind.getGene(23).getAllele();
        

        String signoY;
        if (c6 == 0) {
            signoY = "-";
        } else {
            signoY = "";
        }
        
        
            String valorX =     c1.toString()  + c2.toString() + c3.toString() + c4.toString() + c5.toString();
            String valorY =     c7.toString() + c8.toString() + c9.toString() +  c10.toString() + c11.toString()  + c12.toString() + 
                                c13.toString() + c14.toString() + c15.toString()  + c16.toString() + c17.toString()  + c18.toString() + 
                                c19.toString()  + c20.toString() + c21.toString() + c22.toString() + c23.toString()  + c24.toString(); 
        
        int valorXint = (Integer.parseInt(valorX, 2));
        int valorYint = (Integer.parseInt(valorY, 2));

        System.out.println(valorXint + " ; " + signoY + valorYint);
        System.out.println("");
     
        return valorXint;
    }

    public void mostrarTodosIndividuos(IChromosome[] ind) {

        for (IChromosome iChromosome : ind) {
            c1 = (Integer) iChromosome.getGene(0).getAllele();
            c2 = (Integer) iChromosome.getGene(1).getAllele();
            c3 = (Integer) iChromosome.getGene(2).getAllele();
            c4 = (Integer) iChromosome.getGene(3).getAllele();
            c5 = (Integer) iChromosome.getGene(4).getAllele();
            c6 = (Integer) iChromosome.getGene(5).getAllele();
            c7 = (Integer) iChromosome.getGene(6).getAllele();
            c8 = (Integer) iChromosome.getGene(7).getAllele();
            c9 = (Integer) iChromosome.getGene(8).getAllele();
            c10 = (Integer) iChromosome.getGene(9).getAllele();
            c11 = (Integer) iChromosome.getGene(10).getAllele();
            c12 = (Integer) iChromosome.getGene(11).getAllele();
            c13 = (Integer) iChromosome.getGene(12).getAllele();
            c14 = (Integer) iChromosome.getGene(13).getAllele();
            c15 = (Integer) iChromosome.getGene(14).getAllele();
            c16 = (Integer) iChromosome.getGene(15).getAllele();
            c17 = (Integer) iChromosome.getGene(16).getAllele();
            c18 = (Integer) iChromosome.getGene(17).getAllele();
            c19= (Integer) iChromosome.getGene(18).getAllele();
            c20 = (Integer) iChromosome.getGene(19).getAllele();
            c21 = (Integer) iChromosome.getGene(20).getAllele();
            c22 = (Integer) iChromosome.getGene(21).getAllele();
            c23 = (Integer) iChromosome.getGene(22).getAllele();
            c24 = (Integer) iChromosome.getGene(23).getAllele();

            String signoY;
            if (c6 == 0) {
                signoY = "-";
            } else {
                signoY = "";
            }
            
            String valorX =     c1.toString()  + c2.toString() + c3.toString() + c4.toString() + c5.toString();
            String valorY =     c7.toString() + c8.toString() + c9.toString() +  c10.toString() + c11.toString()  + c12.toString() + 
                                c13.toString() + c14.toString() + c15.toString()  + c16.toString() + c17.toString()  + c18.toString() + 
                                c19.toString()  + c20.toString() + c21.toString() + c22.toString() + c23.toString()  + c24.toString(); 
        
            int valorXint = (Integer.parseInt(valorX, 2));
            int valorYint = (Integer.parseInt(valorY, 2));
            System.out.println(valorXint + " ; " + signoY + valorYint);

        }
    }
}
