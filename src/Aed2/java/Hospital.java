/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aed2.java;

/**
 *
 * @author Vidhi
 */
public class Hospital extends Community {
    private String hospitalName;
    public Hospital(String hospitalName,String communityName,String cityName) {
        super(communityName, cityName);
        this.setHospitalName(hospitalName);
    }
    public void setHospitalName(String hospitalName){
        this.hospitalName=hospitalName;
    }
    public String getHospitalName(){
        return hospitalName;
    }
}
