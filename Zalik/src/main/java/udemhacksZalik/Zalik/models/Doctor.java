package udemhacksZalik.Zalik.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Doctor {
    private int doctorId;
    private String name;
    private String email;
    private String clinic;
    private String phone;
    private String clinicAddress;
    private List<Patient> listOfPatient;
    private boolean isAvailable;

    public Doctor() {
        listOfPatient = new ArrayList<>();
    }


    public Doctor(int doctorId,String name, String email, String clinic, String phone, String clinicAddress, List<Patient> listtOfPatient, boolean isAvailable) {
        this.doctorId = doctorId;
        this.name = name;
        this.email = email;
        this.clinic = clinic;
        this.phone = phone;
        this.clinicAddress = clinicAddress;
        this.listOfPatient = listOfPatient;
        this.isAvailable = isAvailable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClinic() {
        return clinic;
    }

    public void setClinic(String clinic) {
        this.clinic = clinic;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getClinicAddress() {
        return clinicAddress;
    }

    public void setClinicAddress(String clinicAddress) {
        this.clinicAddress = clinicAddress;
    }

    public List<Patient> getPatientList() {
        return Collections.unmodifiableList(listOfPatient);
    }
    public void setListtOfPatient(List<Patient> listtOfPatient) {
        this.listtOfPatient = listtOfPatient;
    }
    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
