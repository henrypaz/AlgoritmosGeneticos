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
public class Agente3 extends Agent{

    @Override
    protected void setup() {
        //To change body of generated methods, choose Tools | Templates.
        super.setup(); 
        addBehaviour(new ComportamientoAgente3());
    }

    @Override
    protected void takeDown() {
        //To change body of generated methods, choose Tools | Templates.
        super.takeDown();
        System.out.println("Proceso realizado Agente3");
    }
    
    class ComportamientoAgente3 extends CyclicBehaviour{

        @Override
        public void action() {
            //SI EL VALOR > 20000 IMPRIMO OK APROBADO PARA LA VENTA
            
            System.out.println(getName());
            ACLMessage acl = blockingReceive();
            System.out.println(acl);
            
//              if(acl.getConversationId().equalsIgnoreCase("COD003")){
                
                    if (acl.getContent().equalsIgnoreCase("VALOR > 20000")){
                        System.out.println("APROBADO PARA VENDER !!!");
                    }else{

                    }
//              }else{
                    if(acl.getConversationId().equalsIgnoreCase("COD005")){
                        System.out.println("NO APROBADO PARA LA VENTA");
                    }else{
                        if(acl.getConversationId().equalsIgnoreCase("COD006")){
                            System.out.println("APROBADO PARA LA VENTA");
                        }
                    }
//              }
            
            //doWait();
            
        }
    }
}
