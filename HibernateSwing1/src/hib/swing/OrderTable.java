/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hib.swing;

/**
 *
 * @author ishita
 */
public class OrderTable {
    private String name; 
private String price; 
private String  quantity;
private int total;
private String grandTotal;
     public OrderTable()
                                {
                                }
                              public OrderTable(String name,String price,String quantity,int total,String grandTotal){
              this.name=name;
              this.price=price;
               this.quantity=quantity;
                this.total=total;
                this.grandTotal=grandTotal;
               
                
               
              
          }

    public OrderTable(String name, String price, String quantity, String total) {
 
    }

    public OrderTable(String name, String price, String quantity, int total) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the price
     */
    public String getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(String price) {
        this.price = price;
    }

    /**
     * @return the quantity
     */
    public String getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the total
     */
    public int getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * @return the grandTotal
     */
    public String getGrandTotal() {
        return grandTotal;
    }

    /**
     * @param grandTotal the grandTotal to set
     */
    public void setGrandTotal(String grandTotal) {
        this.grandTotal = grandTotal;
    }
}
    /**
     * @return the name
     */
   