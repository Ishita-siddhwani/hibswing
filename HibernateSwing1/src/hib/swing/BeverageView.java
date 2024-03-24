/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hib.swing;

/**
 *
 * @author ishita
 */
public class BeverageView {
    
     private String beverageName;
    private String beveragePrice;
    
      public BeverageView()
                                {
                                }
                              public BeverageView(String beverageName,String beveragePrice){
              this.beverageName=beverageName;
              this.beveragePrice=beveragePrice;
          }

    /**
     * @return the beverageName
     */
    public String getBeverageName() {
        return beverageName;
    }

    /**
     * @param beverageName the beverageName to set
     */
    public void setBeverageName(String beverageName) {
        this.beverageName = beverageName;
    }

    /**
     * @return the beveragePrice
     */
    public String getBeveragePrice() {
        return beveragePrice;
    }

    /**
     * @param beveragePrice the beveragePrice to set
     */
    public void setBeveragePrice(String beveragePrice) {
        this.beveragePrice = beveragePrice;
    }
                              
                              
}
