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
public class User {
    
    public ArrayList <Integer> cards = new ArrayList <Integer>();
    
      public ArrayList<Integer> hit(){
         Random rand = new Random();
         Integer index = rand.nextInt(cards.size());
         
         Integer hit[];
         
         cards.remove(1);
          return cards ;
           }
           
         public ArrayList<Integer> deal(){
        Random rand = new Random();
        ArrayList<Integer>al;
        al=new ArrayList<>();
        al.get(2);
        cards.remove(2);
        return al;
           }
}

