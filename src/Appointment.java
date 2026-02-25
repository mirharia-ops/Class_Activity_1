class Appointment implements Billable {
    private String appointmentId;
    private double consultationFee;

    public Appointment(String appointmentId, double consultationFee) {
        this.appointmentId = appointmentId;
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }

    public void showAppointment() {
        System.out.println("Appointment ID: " + appointmentId);
    }
}