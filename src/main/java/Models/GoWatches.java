/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Sanoj de silva
 */
public class GoWatches{
    private String YOM;
    private String Brand;
    private String ModelNO;
    private double price;

    public GoWatches(String YOM, String Brand, String ModelNO, double price) {
        this.YOM = YOM;
        this.Brand = Brand;
        this.ModelNO = ModelNO;
        this.price = price;
    }

    public String getYOM() {
        return YOM;
    }

    public String getBrand() {
        return Brand;
    }

    public String getModelNO() {
        return ModelNO;
    }

    public double getPrice() {
        return price;
    }

    
    
    
    public void setYOM(String YOM) {
        this.YOM = YOM;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    public void setModelNO(String ModelNO) {
        this.ModelNO = ModelNO;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
