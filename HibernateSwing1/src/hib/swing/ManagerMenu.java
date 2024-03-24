/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hib.swing;

/**
 *
 * @author ishita
 */
public class ManagerMenu {
//    private int foodId; 

private String foodCategory; 
private String foodName; 
private String  image;
private String price;

//    public ManagerMenu(String foodName) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//    
//public void setFoodId(int foodId){
//    this.foodId = foodId;
//}
//public int getFoodId(){
//   return foodId;
//}
                        public ManagerMenu()
                                {
                                }
                              public ManagerMenu(String foodCategory,String foodName,String image,String price ){
              this.foodCategory=foodCategory;
              this.foodName=foodName;
              this.image=image;
              this.price=price;
              
          }

    /**
     * @return the serialNo
     */
   

    /**
     * @return the foodCategory
     */
    public String getFoodCategory() {
        return foodCategory;
    }

    /**
     * @param foodCategory the foodCategory to set
     */
    public void setFoodCategory(String foodCategory) {
        this.foodCategory = foodCategory;
    }

    /**
     * @return the foodName
     */
    public String getFoodName() {
        return foodName;
    }

    /**
     * @param foodName the foodName to set
     */
    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    /**
     * @return the image
     */
    public String getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(String image) {
        this.image = image;
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
}
    