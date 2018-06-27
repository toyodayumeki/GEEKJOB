/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package time1;
import java.util.Calendar;
/**
 *
 * @author guest1Day
 */
public class Time1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calendar c = Calendar.getInstance();
        
        c.set(2016,1,1,0,0,0);
        System.out.print(c.get(Calendar.YEAR)+"年");
        System.out.print(c.get(Calendar.MONTH)+"月");
        System.out.print(c.get(Calendar.DAY_OF_MONTH)+"日");
        System.out.print(c.get(Calendar.HOUR_OF_DAY)+"時");
         System.out.print(c.get(Calendar.MINUTE)+"分");
         System.out.print(c.get(Calendar.SECOND)+"秒");
        
    }
    
}
