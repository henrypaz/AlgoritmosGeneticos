/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packageAgentes;

import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;

/**
 *
 * @author César Taco
 */
public class Agente4 extends Agent{

    @Override
    protected void setup() {
        //To change body of generated methods, choose Tools | Templates.
        super.setup(); 
        addBehaviour(new ComportamientoAgente4());
    }

    @Override
    protected void takeDown() {
        //To change body of generated methods, choose Tools | Templates.
        super.takeDown();
        System.out.println("Proceso realizado Agente4");
    }
    
    class ComportamientoAgente4 extends CyclicBehaviour{

        @Override
        public void action() {
            //SI EL VALOR < 20000 IMPRIMO NO APROBADO PARA LA VENTA
            
            double cupo = 30000;                                                //VALOR QUEMADO
            
            System.out.println(getName());
            ACLMessage acl = blockingReceive();
            System.out.println(acl);
                  
            double y = Double.parseDouble(acl.getContent());
            
//            if(acl.getConversationId().equalsIgnoreCase("COD004")){
                if(y > cupo){
                    Mensajes.enviarMsj("VALOR > CUPO", getAgent(), "Agente3", "COD005", ACLMessage.INFORM);
                }else{
                    Mensajes.enviarMsj("VALOR < CUPO", getAgent(), "Agente3", "COD006", ACLMessage.INFORM);
                }
//            }
            
            //doWait();
        }
    }
}