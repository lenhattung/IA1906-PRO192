/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tungi
 */
public class R {

    public static void main(String[] args) {
          // XXxxx
          // [a-zA-Z] : letter a->z hoac A->Z
          // [0-9] hoac \\d
          String regex = "[a-zA-Z]{2}\\d{3}";
          String s1 = "12abc";
          String s2 = "AB123";
          System.out.println(s1.matches(regex));
          System.out.println(s2.matches(regex));
          
          String s3 = "A(123)";
          System.out.println(s3.matches(regex));
          
          // (+84)123456789
          String phone_regex = "\\(\\+84\\)\\d{9}";
          System.out.println("(+84)123456789".matches(phone_regex));
          System.out.println("(84)123456789".matches(phone_regex));
          System.out.println("+84123456789".matches(phone_regex));
    }
}
