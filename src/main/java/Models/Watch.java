/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author acer
 */
public class Watch {
    private String no;
    private String brand;
    private String WatchType;
    private double price;
    private int quantity;

    public Watch(String no, String brand, double price,String WatchType,int quantity) {
        this.no = no;
        this.brand = brand;
        this.price = price;
        this.WatchType = WatchType;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getWatchType() {
        return WatchType;
    }

    public void setWatchType(String WatchType) {
        this.WatchType = WatchType;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
}
