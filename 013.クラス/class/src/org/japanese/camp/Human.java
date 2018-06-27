/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japanese.camp;

/**
 *
 * @author guest1Day
 */
public class Human {
String name="";
int age=0;

public void setHuman(String n,int a){
    this.name=n;
    this.age=a;
    
    
}
}        
class Teacher extends Human {
    
   
    public void kougi() {
        String msg = "静岡では" + this.name + "が、有名です。";
        System.out.print(msg);
    }
}
