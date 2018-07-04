/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;
/**
 *
 * @author guest1Day
 */
public class yomitori {
    
     public static void main(String[] args) {
    
      try{
          //オープン
        File fp =new File("test.txt");
          //ファイルから読み出す。
        FileReader fr = new FileReader(fp);
          //インスタンス作成
        BufferedReader br = new BufferedReader(fr);
          //1行読み
         System.out.print(br.readLine());
          //クローズ
        br.close();
        
        }catch(IOException e){
        e.printStackTrace();
        }   
    }   
}
