/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import java.util.ArrayList;
import java.util.Random;


/**
 *
 * @author guest1Day
 */
public class Dealer {
    
    
    
     public ArrayList <Integer> cards = new ArrayList <Integer>();
 
     
    public  Dealer (){
        
        for (int i = 0; i <=13; i++){
            for(int j=1; j<=4; j++){
            }
        }
    }          
    

           public ArrayList<Integer> hit(){
         Random rand = new Random();
         Integer index = rand.nextInt(cards.size());
         ArrayList<Integer>el;
         el=new ArrayList<>();
         el.get(1);
         cards.remove(1);
          return el;
           }
           
         public ArrayList<Integer> deal(){
        Random rand = new Random();
        ArrayList<Integer>al;
        al=new ArrayList<>();
        cards.remove(2);
        return al;
           }
}