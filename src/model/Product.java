/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Asus
 */
public class Product {

    private int productid;
    private String productname;
    private String productdescription;
    private int productstock;
    private double productprice;

    /**
     * @return the productid
     */
    public int getProductid() {
        return productid;
    }

    /**
     * @param productid the productid to set
     */
    public void setProductid(int productid) {
        this.productid = productid;
    }

    /**
     * @return the productname
     */
    public String getProductname() {
        return productname;
    }

    /**
     * @param productname the productname to set
     */
    public void setProductname(String productname) {
        this.productname = productname;
    }

    /**
     * @return the productdescription
     */
    public String getProductdescription() {
        return productdescription;
    }

    /**
     * @param productdescription the productdescription to set
     */
    public void setProductdescription(String productdescription) {
        this.productdescription = productdescription;
    }

    /**
     * @return the productstock
     */
    public int getProductstock() {
        return productstock;
    }

    /**
     * @param productstock the productstock to set
     */
    public void setProductstock(int productstock) {
        this.productstock = productstock;
    }

    /**
     * @return the productprice
     */
    public double getProductprice() {
        return productprice;
    }

    /**
     * @param productprice the productprice to set
     */
    public void setProductprice(double productprice) {
        this.productprice = productprice;
    }

}
