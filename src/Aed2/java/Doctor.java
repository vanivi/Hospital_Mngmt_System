/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aed2.java;

/**
 *
 * @author Vidhi
 */
public class Doctor extends Hospital {
    private String name;
    private String doctorUserName;
    Doctor(String doctorUserName,String name,String hospitalName,String community,String city){
        super(hospitalName,community,city);
        this.setDoctorUserName(doctorUserName);
        this.setDoctorName(name);
    } 
    public void setDoctorUserName(String doctorUserName){
        this.doctorUserName=doctorUserName;
    }
    public String getDoctorUserName(){
        return doctorUserName;
    }
    public void setDoctorName(String name){
        this.name=name;
    }
    public String getDoctorName(){
        return name;
    }
}
