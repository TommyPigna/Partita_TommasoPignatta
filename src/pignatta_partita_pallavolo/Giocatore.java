/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pignatta_partita_pallavolo;

/**
 *
 * @author tommaso pignatta
 */
public class Giocatore implements Runnable {
      int numPassaggi;
      int ID;
      
      public Giocatore(int ID){
          numPassaggi=0;
          this.ID=ID;
}
      public void run(){
       while (true){
           System.out.println("ID GIOCATORE: "+ID+" NUMERO PASSAGGI: "+numPassaggi);
           numPassaggi++;
           Thread.currentThread().yield();
}  
      }
}
    
