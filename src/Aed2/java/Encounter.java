/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aed2.java;

import java.util.Date;

/**
 *
 * @author Vidhi
 */
public class Encounter extends VitalSigns {
    public String patientUserName;
    public String doctorUserName;
    public String encounterId;
    public String timeStamp;
    public Encounter(String encounterId,String patientUserName,String doctorUserName,String timeStamp,int bp, int heartRate) {
        super(bp,heartRate);
        this.setPatientUserName(patientUserName);
        this.setDoctorUserName(doctorUserName);
        this.setEncounterId(encounterId);
        this.setTimeStamp(timeStamp);
    }

    public void setPatientUserName(String patientUserName) {
        this.patientUserName = patientUserName;
    }
    public void setDoctorUserName(String doctorUserName) {
        this.doctorUserName = doctorUserName;
    }
    public void setEncounterId(String encounterId) {
        this.encounterId = encounterId;
    }
    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }
    public String getDoctorUserName() {
        return doctorUserName;
    }
    public String getPatientUserName() {
        return patientUserName;
    }
    public String getEncounterId() {
        return encounterId;
    }
    public String getTimeStamp() {
        return timeStamp;
    }
    
    
    
}
