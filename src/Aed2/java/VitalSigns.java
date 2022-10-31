/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aed2.java;

/**
 *
 * @author Vidhi
 */
public class VitalSigns {
    public int bp;
    public int heartRate;
    public VitalSigns(int bp,int heartRate) {
        this.setBp(bp);
        this.setHeartRate(heartRate);
    }

    public void setBp(int bp) {
        this.bp = bp;
    }

    public int getBp() {
        return bp;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public int getHeartRate() {
        return heartRate;
    }
    public boolean isNormal(int bp,int heartRate){
        if(bp<30||heartRate<30){
            return false;
        }
        return true;
    } 
}
