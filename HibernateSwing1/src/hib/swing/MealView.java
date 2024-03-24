/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hib.swing;

/**
 *
 * @author ishita
 */
public class MealView {
    private String mealName;
    private String mealPrice;
    
      public MealView()
                                {
                                }
                              public MealView(String mealName,String mealPrice){
              this.mealName=mealName;
              this.mealPrice=mealPrice;
          }

    /**
     * @return the mealName
     */
    public String getMealName() {
        return mealName;
    }

    /**
     * @param mealName the mealName to set
     */
    public void setMealName(String mealName) {
        this.mealName = mealName;
    }

    /**
     * @return the mealPrice
     */
    public String getMealPrice() {
        return mealPrice;
    }

    /**
     * @param mealPrice the mealPrice to set
     */
    public void setMealPrice(String mealPrice) {
        this.mealPrice = mealPrice;
    }
    
}
