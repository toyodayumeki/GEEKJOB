/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japan.camp;

/**
 *
 * @author guest1Day
 */
public class Human {
    
    public String name = null;
    public int age = 0;
    
     public void setHuman(String name, int suji) {
        this.name = name;
        this.age = suji;
    }
}
class Teacher extends Human {
    public void kougi() {
        String msg = "講師の" + this.name + "です。講義を始めます。";
        System.out.print(msg);
    }
}