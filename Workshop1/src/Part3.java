
import java.util.Scanner;

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
        String[] names1 = s.split(" ");
        System.out.println(names1[0]);
        
        String s1 = s.substring(5, 7);
        System.out.println(s1);
        
        String s2 = s.substring(1);
        System.out.println(s2);
        
        /* part3 */
        int n=3;
        String[] list = new String[n];
        Scanner sc= new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Enter a name: ");
            sc = new Scanner(System.in);
            list[i] = sc.nextLine();
        }
        
        // process
        for (int i = 0; i < n; i++) {
            String names[] = list[i].split(" ");
            for (int j = 0; j < names.length; j++) {
                names[j] = names[j].substring(0,1).toUpperCase() + names[j].substring(1).toLowerCase();
            }
            list[i] = String.join(" ", names);
        }
        
        // output
        for (int i = 0; i < n; i++) {
            System.out.println(list[i]);
        }
    }
}
