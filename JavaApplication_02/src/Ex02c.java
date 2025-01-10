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

    public static void main(String[] args) {
        boolean check = 5 >= 4;
        System.out.println(check);

        check = ((5 >= 4) && (15 % 2 == 0));
        System.out.println(check);
        
        // 
        int x = 100;
        // (condition)?op1:op2;
        System.out.println((x%2==0)?"chan":"le");
        
        /*
        String ketQua = "";
        if(x%2==0){
            ketQua = "chan";
        }else{
            ketQua = "le";
        }
        
        ketQua = (x%2==0)?"chan":"le";
        */
        
        int z = 5;
        z+=10; // z = z+10;
    }
}
