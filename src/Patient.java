class Patient extends Person implements Billable {
    private String patientId;
    private String disease;
    private double treatmentCost;

    public Patient(String name, int age, String phone,
                   String patientId, String disease,
                   double treatmentCost) {
        super(name, age, phone);
        this.patientId = patientId;
        this.disease = disease;
        this.treatmentCost = treatmentCost;
    }

    public String getPatientId() { return patientId; }

    @Override
    public double calculateBill() {
        return treatmentCost;
    }

    @Override
    public void displayDetails() {
        System.out.println("Patient: " + getName() +
                ", Disease: " + disease);
    }
}