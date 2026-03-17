public class Doctor extends Staff implements Schedulable {
    private String specialization;

    public Doctor(String name, int age, String phone,
                  String staffId, double salary,
                  String specialization) {
        super(name, age, phone, staffId, salary);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    @Override
    public void performDuties() {
        System.out.println("Doctor is treating patient.");
    }

    @Override
    public void scheduleAppointment(String date) {
        System.out.println("Appointment scheduled on: " + date);
    }

    @Override
    public void displayDetails() {
        System.out.println("Doctor: " + getName() +
                ", Specialization: " + specialization);
    }
}