/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tungi
 */
public class Test {
    public static void main(String[] args){
       Student s1 = new Student();
       Student s2 = new Student("001", "Nguyen Xuan Son", 1997, "Nam Dinh");
       
        System.out.println(s1);
        System.out.println(s2);
        
        //s1.name="Supachok";
        //s1.bYear=-1;
        s1.setName("Tùng");
        s1.setbYear(-1);
        System.out.println(s1);
        
        s1.setbYear(2004);
        System.out.println(s1);
        
        System.out.println(s2);
    }
}
