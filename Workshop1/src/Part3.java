/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tungi
 */
public class Part3 {
    public static void main(String[] args) {
        /* String */
        String s = "nGuyeN xUan SoN";
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s);
        s=s.toUpperCase();
        System.out.println(s);
        System.out.println(s.length());
        String[] names = s.split(" ");
        System.out.println(names[0]);
        
        String s1 = s.substring(5, 7);
        System.out.println(s1);
        
        String s2 = s.substring(1);
        System.out.println(s2);
    }
}
