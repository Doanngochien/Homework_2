package Baitaplamthem;

public class PartTimeEmployee extends Employee{
    private double hourlyRate;
    private int hourWorked;

    public PartTimeEmployee(String name, int age, int employeeId, double hourlyRate, int hourWorked) {
        super(name, age, employeeId);
        this.hourlyRate = hourlyRate;
        this.hourWorked = hourWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getHourWorked() {
        return hourWorked;
    }

    public void setHourWorked(int hourWorked) {
        this.hourWorked = hourWorked;
    }
    public double calculateSalary(){
        return hourlyRate*this.hourWorked;
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("nhân viên thời vụ");
        System.out.println("số giờ làm:"+this.hourWorked);
        System.out.println("lương tính thdeo giờ:"+hourlyRate*this.hourWorked);
    }
}
