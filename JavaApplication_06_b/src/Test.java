
import java.util.Date;

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
    public static void main(String[] args) {
        ElectronicProduct ep = new ElectronicProduct("LT01", "LG Gram 2in1", "LG", 35000000, "2 years", "220V", "1000w");
        System.out.println(ep.getName());  
        System.out.println(ep);
        
        
        CeramicProduct cp = new CeramicProduct("CR01", "Binh su THAI CONG", "FRANCE1", 100000000, "Binh su");
        System.out.println(cp.getPrice());
        System.out.println(cp);
        
        FoodProduct fp = new FoodProduct("MT01", "Hao hao chua cay", "Acecook", 3500, new Date(System.currentTimeMillis()), new Date(125, 11, 15) );
        System.out.println(fp.getDate());
        System.out.println(fp.getExpiredDate());
        System.out.println(fp);
    }
}
