/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

/**
 *
 * @author guest1Day
 */
public class Blackjack {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
     
        
   Dealer dealer = new Dealer();
   dealer.deal();
   dealer.hit();
      
   User user = new User();
   user.deal();
   user.hit();
   
  System.out.println(dealer);
   System.out.println(user);
   
    }
      }
        
        
        
    
    

