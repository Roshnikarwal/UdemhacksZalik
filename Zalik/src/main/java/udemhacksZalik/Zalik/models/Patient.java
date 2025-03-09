package udemhacksZalik.Zalik.models;

public class Patient {
    private int patientId;
    private String name;
    private String email;
    private String phone;
    private boolean hasDoctor;
    private String postalCode;
    private Integer doctorId;
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
        this.hasDoctor = hasADoctor;
        this.postalCode = postalCode;
        this.doctor = doctor;
        this.password = password;
    }

    public Patient(int patientId, String name, String email, String phone, boolean hasDoctor, String postalCode, Integer doctorId) {
        this.patientId = patientId;
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
        this.hasDoctor = hasDoctor;
        this.postalCode = postalCode;
        this.doctorId = doctorId;
    }

    // Getters and Setters
    public int getPatientId() { return patientId; }
    public void setPatientId(int patientId) { this.patientId = patientId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public boolean hasDoctor() { return hasDoctor; }
    public void setHasDoctor(boolean hasDoctor) { this.hasDoctor = hasDoctor; }

    public String getPostalCode() { return postalCode; }
    public void setPostalCode(String postalCode) { this.postalCode = postalCode; }

    public Integer getDoctorId() { return doctorId; }
    public void setDoctorId(Integer doctorId) { this.doctorId = doctorId; }
}
