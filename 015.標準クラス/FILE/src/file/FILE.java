/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.io.*;
/**
 *
 * @author guest1Day
 */
public class FILE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    try{
        //ファイルオープン
         File fp = new File("test.txt");
         //インスタンス作成
        FileWriter fw = new FileWriter(fp);
        
        //自己紹介書き込み
        
        fw.write("My name is Toyoda.");
        fw.close();
        
        
    }catch(IOException e){
      e.printStackTrace();
    }
  }
}
