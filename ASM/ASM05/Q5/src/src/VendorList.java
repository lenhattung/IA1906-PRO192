
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tungi
 */
public class VendorList extends ArrayList<Vendor> {

    public void addVendor(Vendor v) {
        this.add(v);
    }

    public double getVendorSaleById(int id) {
        for (Vendor v : this) {
            if (v.getId() == id) {
                return v.getSale();
            }
        }
        return Double.parseDouble(String.format("%.3f", id));
    }

    public Vendor getVendorWithMaxSale() {
        // Tìm max
        double maxSale = Double.MIN_VALUE;
        for (Vendor v : this) {
            if (v.getSale() > maxSale) {
                maxSale = v.getSale();
            }
        }
        // Tìm Vendor
        for (Vendor v : this) {
            if (v.getSale() == maxSale) {
                return v;
            }
        }
        return null;
    }

    public double getTotalSaleAllVendors() {
        double total = 0;
        for (Vendor v : this) {
            total += v.getSale();
        }
        return total;
    }

    public void printVendorList() {
        ArrayList<Vendor> temp = (ArrayList<Vendor>) this.clone();
        // Cach 1 => phai viet compareTo trong Vendor\
        // Khuyen khich lam cach 1
        Collections.sort(temp); // Sắp xếp

//        // Cach 2 => Khong phai viet compareTo trong Vendor
//        Collections.sort(temp, new Comparator<Vendor>() {
//            @Override
//            public int compare(Vendor o1, Vendor o2) {
//                if (o1.getSale() == o2.getSale()) {
//                    return o1.getName().compareTo(o2.getName());
//                } else {
//                    // descending
//                    if (o1.getSale() - o2.getSale() < 0) {
//                        return 1;
//                    } else {
//                        return -1;
//                    }
//                }
//            }
//        });

        for (Vendor vendor : temp) {
            System.out.println(vendor);
        }
    }
}
