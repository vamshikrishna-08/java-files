import java.util.*;
class Patient {  //Hospital Management System
    private final String name;
    public Patient(String name) { this.name = name; }
    public String getName() { return name; }
}
class Doctor {
    private final String name, specialization;
    private final List<Patient> patients = new ArrayList<>();
    public Doctor(String name, String spec) { this.name = name; this.specialization = spec; }
    public String getName() { return name; }
    public String getSpecialization() { return specialization; }
    public void addPatient(Patient p) { patients.add(p); }
    public void dischargePatient(Patient p) { patients.remove(p); }
    public List<Patient> getPatients() { return patients; }
}
class Hospital {
    private final List<Doctor> doctors = new ArrayList<>();
    public void addDoctor(Doctor d) { doctors.add(d); }
    public List<Doctor> getDoctors() { return doctors; }
    public List<Doctor> findBySpecialization(String spec) {
        return doctors.stream().filter(d -> d.getSpecialization().equalsIgnoreCase(spec)).toList();
    }
}
public class task6 {
    public static void main(String[] args) {
        Hospital h = new Hospital();
        Doctor d1 = new Doctor("Dr. Smith", "Cardiology");
        Doctor d2 = new Doctor("Dr. Lee", "Neurology");
        h.addDoctor(d1); h.addDoctor(d2);
        Patient p1 = new Patient("Alice");
        Patient p2 = new Patient("Bob");
        d1.addPatient(p1); d2.addPatient(p2);
        System.out.println("Appointments:");
        h.getDoctors().forEach(d -> 
            System.out.println(d.getName()+"("+d.getSpecialization()+"): "+d.getPatients().stream().map(Patient::getName).toList())
        );
        d1.dischargePatient(p1);
        System.out.println("\nAfter discharge:");
        h.getDoctors().forEach(d -> 
            System.out.println(d.getName()+": "+d.getPatients().stream().map(Patient::getName).toList())
        );
        System.out.println("\nNeurology Doctors:");
        h.findBySpecialization("Neurology").forEach(d -> System.out.println(d.getName()));
    }
}
