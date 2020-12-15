/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packageAgentes;

import jade.core.AID;
import jade.core.Agent;
import jade.lang.acl.ACLMessage;

/**
 *
 * @author César Taco
 */
public class Mensajes {

    public static void enviarMsj(String objeto, Agent agent, String receptor,
        String idConversation, int tipoMsj) {
        ACLMessage message = new ACLMessage(tipoMsj);
     
        message.setContent(objeto);
      
        AID aid = new AID();
        aid.setLocalName(receptor);
        message.addReceiver(aid);
        message.setSender(agent.getAID());
        message.setLanguage("Esp");
        message.setConversationId(idConversation);
        agent.send(message);
    }
}