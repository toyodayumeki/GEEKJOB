/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package time1;
import java.util.Date;
import java.text.SimpleDateFormat;
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
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    

  
    // 日付を作成します。
         Date now = new Date(); 
        SimpleDateFormat fmt = new SimpleDateFormat("2015/1/1 00:00:002");
        Date next = new Date();
        SimpleDateFormat wer = new SimpleDateFormat("2015/12/31 23:59:59");
  
    // 日付をlong値に変換します。
    long dateTimeTo = fmt.getTime();
    long dateTimeFrom = wer.getTime();
  
    // 差分の時間を算出します。
    long dayDiff = ( fmt - wer  ) / (1000 * 60 * 60 );
  
   
    System.out.println( "差分時間 : " + dayDiff );
    }}
