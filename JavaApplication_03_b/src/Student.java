/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tungi
 */
public class Student {

    // attributes
    private String code;
    private String name;
    private int bYear;
    private String address;

    // methods
    public Student() {
    }

    public Student(String code, String name, int bYear, String address) {
        this.code = code;
        this.name = name;
        this.bYear = bYear;
        this.address = address;
    }

    // toString
    @Override
    public String toString() {
        return "Student{" + "code=" + code + ", name=" + name + ", bYear=" + bYear + ", address=" + address + '}';
    }

    public void setCode(String code) {
        if (code != null && code.length() > 0) {
            this.code = code;
        }
    }

    public void setName(String name) {
        if (name != null && name.length() > 0) {
            this.name = name;
        }
    }

    public void setbYear(int bYear) {
        if (bYear > 0) {
            this.bYear = bYear;
        }
    }

    public void setAddress(String address) {
        this.address = address;
    }

//    public String getCode() {
//        return code;
//    }

    public String getName() {
        return name;
    }

    public int getbYear() {
        return bYear;
    }

    public String getAddress() {
        return address;
    }

    
}
