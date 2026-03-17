import java.util.*;

public class HospitalMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ================= HARDCODED DOCTOR =================
        Doctor d1 = new Doctor(
                "Dr. Chandni", 30, "0712345678",
                "D101", 120000, "Cardiology"
        );

        try {
            // ================= PATIENT INPUT =================
            System.out.println("Enter Patient Details:");

            // NAME (letters only)
            System.out.print("Name: ");
            String pName = sc.nextLine();
            if (!pName.matches("[a-zA-Z ]+")) {
                throw new Exception("Name must contain letters only!");
            }

            // AGE (positive number)
            System.out.print("Age: ");
            int pAge = sc.nextInt();
            sc.nextLine();
            if (pAge <= 0) {
                throw new Exception("Age must be positive!");
            }

            // PHONE (numbers only, 10 digits)
            System.out.print("Phone Number: ");
            String pPhone = sc.nextLine();
            if (!pPhone.matches("\\d{10}")) {
                throw new Exception("Phone must be 10 digits!");
            }

            // PATIENT ID (not empty)
            System.out.print("Patient ID: ");
            String pId = sc.nextLine();
            if (pId.isEmpty()) {
                throw new Exception("Patient ID cannot be empty!");
            }

            // DISEASE (letters only)
            System.out.print("Disease: ");
            String disease = sc.nextLine();
            if (!disease.matches("[a-zA-Z ]+")) {
                throw new Exception("Disease must contain letters only!");
            }

            Patient p1 = new Patient(pName, pAge, pPhone, pId, disease, 10000);

            // ================= APPOINTMENT INPUT =================
            System.out.println("\nEnter Appointment Details:");

            System.out.print("Appointment ID: ");
            String appId = sc.nextLine();
            if (appId.isEmpty()) {
                throw new Exception("Appointment ID cannot be empty!");
            }

            Appointment a1 = new Appointment(appId, 2500);

            // ================= OUTPUT =================
            System.out.println("\n===== OUTPUT =====");

            // Doctor info
            d1.displayDetails();
            d1.performDuties();
            d1.scheduleAppointment("User-defined");

            System.out.println();

            // Patient info
            p1.displayDetails();
            System.out.println("Treatment Bill: " + p1.calculateBill());

            System.out.println();

            // Appointment info
            a1.showAppointment();
            System.out.println("Consultation Fee: " + a1.calculateBill());

        } catch (InputMismatchException e) {
            System.out.println("❌ Invalid input type! Please enter correct data.");
        } catch (Exception e) {
            System.out.println("❌ " + e.getMessage());
        } finally {
            sc.close();
            System.out.println("\nRegistration confirmed.");
        }
    }
}