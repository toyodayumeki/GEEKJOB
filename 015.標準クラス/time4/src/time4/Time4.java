/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package time4;
import java.util.Date;
import java.text.SimpleDateFormat;
/**
 *
 * @author guest1Day
 */
public class Time4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date now = new Date(); 
        SimpleDateFormat fmt = new SimpleDateFormat("2015/1/1 00:00:002");
        System.out.println(fmt.format(now));

        Date next = new Date();
        SimpleDateFormat wer = new SimpleDateFormat("2015/12/31 23:59:59");
        System.out.println(wer.format(next));
        
         Date c = new Date(1*365*24*60*60*1000L);
        System.out.println(c);
        
        
        
        
        
        
    }
    
}
