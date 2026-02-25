public class Nurse extends Staff {
    private String shift;

    public Nurse(String name, int age, String phone,
                 String staffId, double salary,
                 String shift) {
        super(name, age, phone, staffId, salary);
        this.shift = shift;
    }

    @Override
    public void performDuties() {
        System.out.println("Nurse assists doctor during treatment.");
    }

    @Override
    public void displayDetails() {
        System.out.println("Nurse: " + getName() +
                ", Shift: " + shift);
    }
}