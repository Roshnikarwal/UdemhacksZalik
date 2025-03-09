package udemhacksZalik.Zalik.models;

public class Patient {
    private String name;
    private String email;
    private String phone;
    private boolean hasADoctor;
    private String postalCode;
    private Doctor doctor;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String password;

    public Patient() {
    }
    public Patient(String name, String email, String phone, boolean hasADoctor, String postalCode, Doctor doctor, String password) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.hasADoctor = hasADoctor;
        this.postalCode = postalCode;
        this.doctor = doctor;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isHasADoctor() {
        return hasADoctor;
    }

    public void setHasADoctor(boolean hasADoctor) {
        this.hasADoctor = hasADoctor;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
}
