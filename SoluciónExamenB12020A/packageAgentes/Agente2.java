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
public class Agente2 extends Agent{

    @Override
    protected void setup() {
        //To change body of generated methods, choose Tools | Templates.
        super.setup(); 
        addBehaviour(new ComportamientoAgente2());
    }

    @Override
    protected void takeDown() {
        //To change body of generated methods, choose Tools | Templates.
        System.out.println("Proceso realizado Agente2");
        super.takeDown(); //To change body of generated methods, choose Tools | Templates.
    }


    class ComportamientoAgente2 extends CyclicBehaviour{
        @Override
        public void action(){
            //GENERO UNA VARIABLE Q OBTENGA EL MAXIMO DE CADA FUNCION, GENERO UN PONDERADO
            //LO ALMACENO COMO STRING Y LO ENVIO DESPUES DE LA COMPARACION PARA TRASNFORMACION FUTURA 
                        
            System.out.println(getName());
            ACLMessage acl = blockingReceive(); 
            System.out.println(acl);
                        
//            if(acl.getConversationId().equalsIgnoreCase("COD010")){
//                
//                System.out.println(acl); 
//            }else{
//                if(acl.getConversationId().equalsIgnoreCase("COD020")){
//                    
//                    System.out.println(acl); 
//                }else{
//                    if(acl.getConversationId().equalsIgnoreCase("COD030")){
//                        
//                        System.out.println(acl); 
//                    }
//                }
//            }
            
            double y = Double.parseDouble(acl.getContent());
            
            if (y > 20000){
                Mensajes.enviarMsj("VALOR > 20000", getAgent(), "Agente3", "COD003", ACLMessage.INFORM);

            }else{
                Mensajes.enviarMsj("VALOR < 20000", getAgent(), "Agente4", "COD004", ACLMessage.INFORM);
                
            }
            
            //doWait();
        } 
    }
}
