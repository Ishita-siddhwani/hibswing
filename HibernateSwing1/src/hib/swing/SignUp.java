/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hib.swing; 

/** 
 *
 * @author ishita
 */
public class SignUp {
    private String email;
    private String username;
    private String password;
     private String post;
    private String dob;
    private String  country;
    private String city;
    private String  contactNo;
    private String address;

    
    public SignUp()
     {
          }

    /**
     *
     * @param username
     * @param password
     * @param post
     */
    public SignUp(String email,String username,String password,String post,String dob,String country,String city,String contactNo,String address ){
              this.email=email;
              this.username=username;
              this.password=password;
              this.post=post;
              this.dob=dob;
              this.country=country;
this.city=city;
this.contactNo=contactNo;
this.address=address;
}

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    
     public String getPassword() {
        return password;
    }

    /**
     * @param email the email to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

      public String getPost() {
        return post;
    }

    /**
     * @param email the email to set
     */
    public void setPost(String post) {
        this.post = post;
    }

    /**
     * @return the dob
     */
    public String getDob() {
        return dob;
    }

    /**
     * @param dob the dob to set
     */
    public void setDob(String dob) {
        this.dob = dob;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the contactNo
     */
    public String getContactNo() {
        return contactNo;
    }

    /**
     * @param contactNo the contactNo to set
     */
    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }
}
 
