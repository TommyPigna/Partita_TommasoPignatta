/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pignatta_partita_pallavolo;

import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Tommaso06
 */
public class Palla {
    public boolean possGioc1; //indica se la palla è in possesso del giocatore 1
    public int passTot;
    
    public synchronized void passPalla(int idGiocatore){
        while((idGiocatore == 1 && !possGioc1) || (idGiocatore == 2 && possGioc1)){
             try {
            wait();
        } catch (InterruptedException ex) {
            Logger.getLogger(Palla.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        System.out.println("GIOCATORE: "+idGiocatore+" passa la palla. I passaggi totali sono: "+(++passTot));
        possGioc1 = !possGioc1;
        notifyAll();
    }
    
    public int getPassTot(){
        return passTot;
    }    
}
