/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part1;

/**
 *
 * @author tungi
 */
public class ItemList {
    private Item[] list;
    private int numberOfItems;
    private int MAX = 100;

    public ItemList() {
        list = new Item[MAX];
        numberOfItems = 0;
    }

    public Item[] getList() {
        return list;
    }

    public void setList(Item[] list) {
        this.list = list;
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }

    public void setNumberOfItems(int numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

    public int getMAX() {
        return MAX;
    }

    public void setMAX(int MAX) {
        this.MAX = MAX;
    }
    
    public boolean addItem(Item item){
        if(item==null || numberOfItems>=MAX){
            return false;
        }
        list[numberOfItems] = item;
        numberOfItems++;
        return true;
    }
    
    public void displayAll(){
        if(numberOfItems==0){
            System.out.println("The list is empty!");
        }
        for (int i = 0; i < numberOfItems; i++) {
            System.out.println(list[i]);
        }
    }
    
    public Item findItem(String creator){
        for (Item item : list) {
            if(item.getCreator().equals(creator)){
                return item;
            }
        }
        return null;
    }
    
    public int findItemIndex(String creator){
       
    }
}
