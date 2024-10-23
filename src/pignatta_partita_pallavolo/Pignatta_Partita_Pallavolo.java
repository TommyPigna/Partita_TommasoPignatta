/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pignatta_partita_pallavolo;

/**
 *
 * @author tommaso pignatta
 */
public class Pignatta_Partita_Pallavolo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Giocatore g1 = new Giocatore(1); //non è un thread perchè implementa solo Runnable
        Giocatore g2 = new Giocatore(2);
        Thread t1 = new Thread(g1, "THREAD GIOCATORE 1");
        t1.setPriority(Thread.MAX_PRIORITY);//è un thread
        System.out.println("ID THREAD: "+t1.getId()+"\nPRIORITA': "+t1.getPriority()+"\nNOME: "+t1.getName()+"\n");
        t1.start();        
        Thread t2 = new Thread(g2, "THREAD GIOCATORE 2");
        System.out.println("ID THREAD: "+t2.getId()+"\nPRIORITA': "+t2.getPriority()+"\nNOME: "+t2.getName()+"\n");
        t2.start();
        
        
    }
    
}
