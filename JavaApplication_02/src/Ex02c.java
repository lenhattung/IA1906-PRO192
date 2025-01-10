/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tungi
 */
public class Ex02c {
    public static void main(String[] args){
        int a = 5;
        int b = 2;
        System.out.println(a/b);// 2
        System.out.println(a%b);// 1
        System.out.println((double)a/b);
        
        int x = 5;
        System.out.println(x++);//5
        System.out.println(++x);//7
        System.out.println(--x);//6
        System.out.println(x--);//6
        // x=5
        
        int y = 5;
        int z = 4;
        System.out.println(y++ - ++z);
        
        
        // 
        int t = 15;
        System.out.println(t>>1);
        t=t>>1;
        System.out.println(t);
        t=t<<1;
        System.out.println(t);
        t=t<<1;
        System.out.println(t);
    }
}
