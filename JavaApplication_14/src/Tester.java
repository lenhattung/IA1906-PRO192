
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tungi
 */
public class Tester {

    public static void main(String[] args) {
        // Integer => Kiểu dữ liệu tham chiếu
        // int => Kiểu dữ liệu nguyên thủy
        // Double / double
        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(5);
        intList.add(1);
        intList.add(2);
        intList.add(8);
        intList.add(4);
        intList.add(5);
        intList.add(3);
        System.out.println(intList);
        intList.remove(3);
        System.out.println(intList);
        intList.remove(new Integer(3));
        System.out.println(intList);
        
    }
}
