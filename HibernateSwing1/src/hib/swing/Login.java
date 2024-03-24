/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hib.swing;

/**
 *
 * @author ishita
 */
public class Login {
    private String username;
    private String password;
    private String post;

    
     public Login()
     {
          }

    /**
     *
     * @param username
     * @param password
     * @param post
     */
    public Login(String username,String password,String post ){
              this.username=username;
              this.password=password;
              this.post=post;
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

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the post
     */
    public String getPost() {
        return post;
    }

    /**
     * @param post the post to set
     */
    public void setPost(String post) {
        this.post = post;
    }
} 
    /**
     * @return the Username
     */
   