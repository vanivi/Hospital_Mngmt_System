/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aed2.java;

/**
 *
 * @author Vidhi
 */
public class House extends Community{
    private String name;
    House(String name,String communityName,String cityName){
        super(communityName,cityName);
        this.setHouseName(name);
    }
    public String getHouseName(){
        return name;
    }
    public void setHouseName(String name){
        this.name=name;
    }
}
