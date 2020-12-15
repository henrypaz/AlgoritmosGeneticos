/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packageContenedor;

import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.wrapper.AgentContainer;
import jade.wrapper.StaleProxyException;
import java.util.logging.Level;
import java.util.logging.Logger;
import packageAgentes.Agente2;
import packageAgentes.Agente3;
import packageAgentes.Agente4;
import packageAgentes.AgenteH;
import packageAgentes.AgenteH1;

/**
 *
 * @author USREPS
 */
public class Contenedor {

    private AgentContainer mainContainer;

    public void iniciarContenedor() {
        jade.core.Runtime runtime = jade.core.Runtime.instance();
        runtime.setCloseVM(true);
        //profile
        Profile profile = new ProfileImpl(null, 1099, null);
        this.mainContainer = runtime.createMainContainer(profile);
        this.iniciarAgentes();
    }

    public void iniciarAgentes() {
      Object[] arg ={this};
        try {
            mainContainer.createNewAgent("AgenteH1", AgenteH1.class.getName(), arg).start();
            mainContainer.createNewAgent("Agente2", Agente2.class.getName(), arg).start();
            mainContainer.createNewAgent("Agente3", Agente3.class.getName(), arg).start();
            mainContainer.createNewAgent("Agente4", Agente4.class.getName(), arg).start();
            
        } catch (StaleProxyException ex) {
            Logger.getLogger(Contenedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public AgentContainer getMainContainer() {
        return mainContainer;
    }
    
    public void crearHijos(String nickname, Object[] conocimiento){
        try {
            mainContainer.createNewAgent(nickname,AgenteH.class.getName(), conocimiento).start();
        } catch (StaleProxyException ex) {
            Logger.getLogger(Contenedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
       
}
