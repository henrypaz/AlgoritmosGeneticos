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
import static java.lang.Math.log;
import packageAG.Prueba2;
import packageAG.Prueba3;

/**
 *
 * @author César Taco
 */
public class AgenteH extends Agent {
    int hijo = 0;
    String nombreHijo;
    Contenedor contenedor;

    @Override
    protected void setup() {
        contenedor = (Contenedor) getArguments()[0];
        addBehaviour(new Comportamiento());
    }

    @Override
    protected void takeDown() {
        if(hijo < 3)
            contenedor.crearHijos(nombreHijo, new Object[]{contenedor,hijo});
        
        System.out.println("Muerto: " + getName());
        super.takeDown();
    }

    class Comportamiento extends SimpleBehaviour{
        boolean bandera = false;
        @Override
        public void action() {
            //MANDA INFORM A AG2 Y MUERE
                        
            int fit2;
            double y2;
            Prueba2 a2 = new Prueba2();
            fit2 = a2.empezar();
            y2 = 3884.7 * fit2 - 173594;
            
            int fit3;
            double y3;
            Prueba3 a3 = new Prueba3();
            fit3 = a3.empezar();
            y3 = 27156 * log(fit3) - 188752; 
            
            contenedor = (Contenedor) getArguments()[0];
            
//            if (hijo == 2) {
                Mensajes.enviarMsj(String.valueOf(y2), getAgent(), "Agente2", "COD020", ACLMessage.INFORM);
//            }else{
                Mensajes.enviarMsj(String.valueOf(y3), getAgent(), "Agente2", "COD030", ACLMessage.INFORM);
                
//            }
            doWait();
            
            contenedor = (Contenedor) getArguments()[0];
            
            hijo = (int) getArguments()[1];
            nombreHijo = "AgenteH"+hijo;
            hijo++;
            
            System.out.println("HIJO: " + hijo);
            
            bandera = true;
//            doDelete();
        }

        @Override
        public boolean done() {
            return bandera;
        }
        
    }
}
