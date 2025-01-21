/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tungi
 */
public class Supplier {

    private int id;
    private String name;
    private String address;
    private String phone;
    private boolean status;

    public Supplier() {
        this.id = 0;
        // this.name = "" => setName("");
        setName("");
        this.address = "";
        setPhone("");
        this.status = false;
    }

    public Supplier(int id, String name, String address, String phone) {
        this.id = id;
        // this.name = name => setName(name);
        setName(name);
        this.address = address;
        setPhone(phone);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return toTitleCase(name);
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty() && name.length() >= 5 && name.length() <= 50) {
            this.name = name;
            this.status = true;
        } else {
            this.name = "no name";
            this.status = false;
        }
    }

    public String getAddress() {
        return toTitleCase(address);
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        // phone.startsWith("0") => true / false
        // this.phone = phone;
        if (phone != null && !phone.isEmpty()  && phone.startsWith("0")&& ((phone.length() == 9) || (phone.length() == 10))) {
            this.phone = phone;
        }else{
            this.phone= "000.000.0000";
        }
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    
    public String toTitleCase(String s){
        // Xoa khoang trang o 2 dau
        s = s.trim();
        String[] temp = s.split(" ");
        // xu ly tung tu
        for (int i = 0; i < temp.length; i++) {
            String word = temp[i];
            if(word.length()>0){
                word = word.substring(0, 1).toUpperCase()+word.substring(1).toLowerCase();
            }
            temp[i] = word;
        }
        // noi lai thanh chuoi
        s = String.join(" ", temp);
        
        // Loai bo khoang trang du thua
        while(s.indexOf("  ")>-1){
            s = s.replace("  ", " ");
        }
        
        return s;
    }
    
//    public static void main(String[] args) {
//        Supplier s = new Supplier();
//        System.out.println(s.toTitleCase("nguyen xuan           son"));
//        //  System.out.println("Nguyen Xuan           Son".indexOf("Son"));
//    }
}
