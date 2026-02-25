public class HospitalMain {
    public static void main(String[] args) {

        // Creating Doctor object
        Doctor d1 = new Doctor(
                "Dr. Chandni", 30, "0712345678",
                "D101", 120000, "Cardiology");

        // Creating Nurse object
        Nurse n1 = new Nurse(
                "Mary", 29, "0723456789",
                "N201", 60000, "Night");

        // Creating Patient object
        Patient p1 = new Patient(
                "Mir", 19, "0734567890",
                "P301", "Malaria", 10000);

        // Creating Appointment
        Appointment a1 = new Appointment("A401", 2500);

        // Demonstrating Inheritance & Method Overriding
        d1.displayDetails();
        d1.performDuties();
        d1.scheduleAppointment("25/02/2026");

        System.out.println();

        n1.displayDetails();
        n1.performDuties();

        System.out.println();

        p1.displayDetails();
        System.out.println("Treatment Bill: " + p1.calculateBill());

        System.out.println();

        a1.showAppointment();
        System.out.println("Consultation Fee: " + a1.calculateBill());
    }
}