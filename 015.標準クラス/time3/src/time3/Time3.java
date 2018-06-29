/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package time3;
import java.util.Date;
import java.text.SimpleDateFormat;


/**
 *
 * @author guest1Day
 */
public class Time3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           Date now = new Date();
        // SimpleDateFormat作成
        SimpleDateFormat sdf =
         new SimpleDateFormat("2016/11/04 10:00:00");
        System.out.print(sdf.format(now));
        
        Date c = new Date(46*365*24*60*60*1000);
        System.out.println(c);
        
    }
}

