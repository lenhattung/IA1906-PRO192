/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tungi
 */
public abstract class Beverage {

    private String id;
    private String name;
    private double price;
    private int quantity;

    public Beverage() {
        setId("");
        setName("");
        setPrice(0);
        setQuantity(0);
    }

    public Beverage(String id, String name, double price, int quantity) {
        setId(id);
        setName(name);
        setPrice(price);
        setQuantity(quantity);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        String regex = "[a-zA-Z]{2}\\d{3}";
        if (id.matches(regex)) {
            this.id = id;
        } else {
            this.id = "TN000";
        }
    }

    public String getName() {
        return toTitleCase(name);
    }

    public void setName(String name) {
        if (name != null && name.length() >= 5 && name.length() <= 50) {
            this.name = name;
        } else {
            this.name = "new beverage";
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
//        if(price>=1 && price<=5000){
//            this.price = price;
//        }else{
//            this.price = 1;
//        }
        this.price = (price >= 1 && price <= 5000) ? price : 1;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = (quantity >= 1 && quantity <= 100) ? quantity : 1;
    }

    public String toTitleCase(String s) {
        String result = "";
        String[] arr = s.split(" ");
        for (String word : arr) {
            if (word.trim().length() > 0) {
                String temp = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
                result = result + temp + " ";
            }
        }
        return result.trim();
    }

    public abstract double subTotal();

    @Override
    public String toString() {
        return getId() + "," + getName() + "," + String.format("%.3f", getPrice()) + "," + getQuantity() + "," + String.format("%.3f", getPrice() * getQuantity());
    }

}
