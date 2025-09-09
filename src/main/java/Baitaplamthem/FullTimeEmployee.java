package Baitaplamthem;

public class FullTimeEmployee extends Employee{
    private double monthlySalary;

    public FullTimeEmployee(String name, int age, int employeeId, double monthlySalary) {
        super(name, age, employeeId);
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }
    public double calculateSalary(){
        return monthlySalary;
    }
    public void displayInfo() {
        super.displayInfo();
        System.out.println("nhân viên chính thức");
        System.out.println("monthlysalary:"+this.monthlySalary);

    }


}
