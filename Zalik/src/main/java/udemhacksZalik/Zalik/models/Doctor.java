package udemhacksZalik.Zalik.models;

import java.util.List;

public class Doctor {
    private String name;
    private String email;
    private String clinic;
    private String phone;
    private String clinicAddress;
    private List<Patient> listtOfPatient;
    private boolean isAvailable;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String password;

    public Doctor() {
    }


    public Doctor(String name, String email, String clinic, String phone, String clinicAddress, List<Patient> listtOfPatient, boolean isAvailable, String password) {
        this.name = name;
        this.email = email;
        this.clinic = clinic;
        this.phone = phone;
        this.clinicAddress = clinicAddress;
        this.listtOfPatient = listtOfPatient;
        this.isAvailable = isAvailable;
        this.password = password;
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

    public List<Patient> getListtOfPatient() {
        return listtOfPatient;
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
