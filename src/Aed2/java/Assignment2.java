/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package aed2.java;

import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author Vidhi
 */
public class Assignment2 {
    public static HashMap<String, Doctor> doctors = new HashMap<>();
    public static HashMap<String, Patient> patients = new HashMap<>();
    public static HashMap<String, User> users = new HashMap<>();
    public static HashMap<String,City> cities = new HashMap<>();
    public static HashMap<String,Community> communities = new HashMap<>();
    public static HashMap<String,CommunityAdmin> communityAdmins = new HashMap<>();
    public static HashMap<String, Hospital> hospitals= new HashMap<>();
    public static HashMap<String, Encounter> encounters= new HashMap<>();
    public static String whoAreYou="";
    public static String currentUser="";
    public static void createCity(String cityName){
        City city= new City(cityName);
        cities.put(cityName, city);
    }
    public static void createCommunity(String communityName,String cityName){
        Community community=new Community(communityName,cityName);
        communities.put(communityName,community);
    }
    public static void createCommunityAdmin(String userName,String community,String city,String password){
            CommunityAdmin communityAdmin= new CommunityAdmin(userName, community, city);
            communityAdmins.put(userName, communityAdmin);
            createUser(userName, password, "CommunityAdmin");
        
    }
    public static void createHospital(String hospitalName,String community,String city){
        Hospital hospital= new Hospital(hospitalName, community, city);
        hospitals.put(hospitalName, hospital);
        
    }
    public static void updateHospital(String hospitalName,String community,String city){
        hospitals.replace(hospitalName, new Hospital(hospitalName, community, city));
    }
    public static void deleteHospital(String hopitalName){
        hospitals.remove(hopitalName);
    }
    public static void createUser(String userName,String password,String type){
        User user=new User(userName,password,type);
        users.put(user.getUserName(), user);
    }
    public static void createEncounter(String patientUserName,String doctorUserName,String timeStamp,int bp,int heartRate){
        String encounterId=Integer.toString(encounters.size()+1);
        Encounter encounter=new Encounter(encounterId, patientUserName,doctorUserName,timeStamp,bp,heartRate);
        encounters.put(encounterId, encounter);
        System.out.print(encounters.size());
    }
    public void deleteUser(String userName){
        users.remove(userName);
    }
    public static void createDoctor(String doctorUserName,String name, String hospitalName,String community,String city,String password){
        Doctor doctor=new Doctor(doctorUserName,name, hospitalName, community, city);
        doctors.put(doctor.getDoctorUserName(),doctor);
        createUser(doctor.getDoctorUserName(), password, "Doctor");

    }
    public static void updateDoctor(String doctorUserName,String name, String hospitalName,String community,String city,String password){
        doctors.replace(doctorUserName, new Doctor(doctorUserName,name, hospitalName, community, city));
        users.replace(doctorUserName,new User(doctorUserName,password,"Doctor"));
    }
    public void deleteDoctor(String doctorUserName){
        doctors.remove(doctorUserName);
        users.remove(doctorUserName);
    }
    public static void createPatient(String patientUserName,String name, int age, String gender,String house,String community,String city,String password){
        Patient patient=new Patient(patientUserName, name, age, gender, house, community, city);
        patients.put(patient.getPatientUserName(),patient);
        createUser(patientUserName,password,"Patient");
    }
    public static void updatePatient(String patientUserName,String name, int age, String gender,String house,String community,String city,String password){
        patients.replace(patientUserName, new Patient(patientUserName, name, age, gender, house, community, city));
        users.replace(patientUserName, new User(patientUserName,password,"Patient"));
    }
    public static void deletePatient(String patientUserName){
        patients.remove(patientUserName);
        users.remove(patientUserName);
    }
    public static void main(String[] args) {
//        Doctor doctor=new Doctor("ggwp","sanjay",22,"Male","609","Jvue","Boston");
//        Doctor doctor2=new Doctor("ggwp","sanjay2",23,"Male","619","GG","NYC");
//        Patient patient=new Patient("Chomu", "GGG", 44, "Femal", "555", "KK", "LL");
//        System.out.println(patient.getCommunityName());
//        doctors.put(doctor.getDoctorUserName(), doctor);
//        doctors.put(doctor2.getDoctorUserName(), doctor2);
//        System.out.print(doctors.size());
//        for (String key : doctors.keySet()) {
//            if(doctors.get(key).getCommunityName()=="Jvue"){ 
//                doctors.remove(key);
//            }
//        }
        try{
            SystemAdmin admin=new SystemAdmin("admin","admin");
            createUser("admin", "admin", "SystemAdmin");
            LoginFrame loginFrame=new LoginFrame();
            loginFrame.show();
        }
        catch(Exception e){
            
        }
//        System.out.print(doctors.size());
    }
}
