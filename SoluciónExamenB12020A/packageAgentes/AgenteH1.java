/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packageAgentes;

import packageContenedor.Contenedor;
import jade.core.Agent;
import jade.core.behaviours.SimpleBehaviour;
import jade.lang.acl.ACLMessage;
import packageAG.Prueba1;

/**
 *
 * @author César Taco
 */

public class AgenteH1 extends Agent{
    int hijo = 1;
    String nombreHijo;
    Contenedor c;
    
    @Override
    protected void setup() {
        addBehaviour(new Comportamiento());
        c = (Contenedor) getArguments()[0];
    }

    @Override
    protected void takeDown() {
        c.crearHijos("AgenteH", new Object[]{c,1});
        System.out.println("Muerto: " + getName());
    }

    class Comportamiento extends SimpleBehaviour{
        boolean bandera = false;
        @Override
        public void action() {
            //MANDA INFORM A AG2 Y MUERE
            System.out.println(getName());
//            hijo = (int) getArguments()[1];
//            nombreHijo = "AgenteH" + hijo;
            
            int fit;
            double y;
            Prueba1 a1 = new Prueba1();
            fit = a1.empezar();
            y =     (0.2585 * Math.pow(fit, 6) + (Math.pow(fit, 5) * (-19.338) ) + 
                    562.55 * Math.pow(fit, 4) + (Math.pow(fit, 3) * (-7979.2) ) + 
                    56266 * Math.pow(fit, 2)  - (171797 * fit) - 8038.4);
            
            
            Mensajes.enviarMsj(String.valueOf(y), getAgent(), "Agente2", "COD010", ACLMessage.INFORM);

            c = (Contenedor) getArguments()[0];
            
            System.out.println("HIJO: " + hijo);
            hijo++;
            
//            doWait();

            bandera = true;
//            doDelete();
        }

        @Override
        public boolean done() {
            return bandera;
        }
    }
}
