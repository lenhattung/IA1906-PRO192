/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part1;

import java.util.Scanner;

/**
 *
 * @author tungi
 */
public class Item {
    protected int value;
    protected String creator;

    public Item() {
    }

    public Item(int value, String creator) {
        this.value = value;
        this.creator = creator;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        int v = 0;
        do {
            System.out.println("Input value (value>0): ");
            try {
                sc = new Scanner(System.in);
                v = sc.nextInt();
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        }while(v<=0);
        
        String c = "";
        do {
            System.out.println("Input creator: ");
            sc = new Scanner(System.in);
            c = sc.nextLine();
        }while(c.isEmpty());
        
        this.setValue(v);
        this.setCreator(c);
    }
    
    public void output(){
        System.out.println("Value: "+ this.getValue());
        System.out.println("Creator: "+ this.getCreator());
    }

    @Override
    public String toString() {
        return "..... add code..";
    }
    
    
}
