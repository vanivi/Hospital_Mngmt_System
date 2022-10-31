/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aed2.java;

/**
 *
 * @author Vidhi
 */
public class Patient extends Person {
    private String patientUserName;
    Patient(String patientUserName,String name, int age, String gender,String house,
            String community,String city){
        super(name,age,gender,house,community,city);
        this.setPatientUserName(patientUserName);
    } 
    public void setPatientUserName(String patientUserName){
        this.patientUserName=patientUserName;
    }
    public String getPatientUserName(){
        return patientUserName;
    }
}
