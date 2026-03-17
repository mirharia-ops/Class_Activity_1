
abstract class Staff extends Person {
    private String staffId;
    private double salary;

    public Staff(String name, int age, String phone,
                 String staffId, double salary) {
        super(name, age, phone);   // using super
        this.staffId = staffId;
        this.salary = salary;
    }

    public String getStaffId() { return staffId; }
    public double getSalary() { return salary; }

    public abstract void performDuties();
}