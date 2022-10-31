/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aed2.java;

/**
 *
 * @author Vidhi
 */
public class Person extends House {
    private String name;
    private int age;
    private String gender;
    Person(String name, int age, String gender,String house,String community,String city){
        super(house,community,city);
        this.setName(name);
        this.setAge(age);
        this.setGender(gender);
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getGender(){
        return gender;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setGender(String gender){
        this.gender=gender;
    }
}
