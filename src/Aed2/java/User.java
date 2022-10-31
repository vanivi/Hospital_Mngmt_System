/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aed2.java;

/**
 *
 * @author Vidhi
 */
public class User {
    private String userName;
    private String password;
    private String type;
    User(String userName,String password,String type){
        this.setUserName(userName);
        this.setPassword(password);
        this.setType(type);
    }
    public void setUserName(String userName){
        this.userName=userName;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public void setType(String type){
        this.type=type;
    }
    public String getUserName(){
        return userName;
    }
    public String getPassword(){
        return password;
    }
    public String getType(){
        return type;
    }
}
