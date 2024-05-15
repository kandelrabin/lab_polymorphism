package Models;

import Interfaces.Hireable;

import java.util.HashMap;
import java.util.Map;

public class VehicleHireShop {

    private String name;
    private HashMap<String, Hireable> hiredItems;
    private double till;

    public VehicleHireShop(String name){
        this.name = name;
        this.hiredItems = new HashMap<>();
        this.till = 0.00;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addToHiredItems(String key, Hireable hireable){
        this.hiredItems.put(key, hireable);
    }

    public Hireable getFromHiredItems(String key){
        return this.hiredItems.get(key);
    }

    public void removeFromHiredItems(String key){
        this.hiredItems.remove(key);
    }

    public int countHiredItems(){
        return this.hiredItems.size();
    }

    public double getTill() {
        return this.till;
    }

    public void depositToTill(double amount){
        this.till += amount;
    }

    public double calculateHiredItemsEarnings(){
        double total = 0.00;
        for (Map.Entry<String, Hireable> set : hiredItems.entrySet()){
            total += set.getValue().calculateCost();
        }
        return total;
    }

}
