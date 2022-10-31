/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aed2.java;

/**
 *
 * @author Vidhi
 */
public class Community extends City {
    private String name;
    Community(String name,String cityName){
        super(cityName);
        this.setCommunityName(name);
    }
    public String getCommunityName(){
        return name;
    }
    public void setCommunityName(String name){
        this.name=name;
    }
}
