/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author AKILA KASUN
 */
public class SpareParts {
    
    private String SparePartType;
    private int Quantity;
    private String WatchType;

    public SpareParts(String SparePartType, int Quantity, String WatchType) {
        this.SparePartType = SparePartType;
        this.Quantity = Quantity;
        this.WatchType = WatchType;
    }

    public String getSparePartType() {
        return SparePartType;
    }

    public void setSparePartType(String SparePartType) {
        this.SparePartType = SparePartType;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public String getWatchType() {
        return WatchType;
    }

    public void setWatchType(String WatchType) {
        this.WatchType = WatchType;
    }
    
    
    
}
