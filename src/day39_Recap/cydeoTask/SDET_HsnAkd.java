package day39_Recap.cydeoTask;

public class SDET_HsnAkd extends Tester{
    private int testerID;
    private  String department;
    private  double extraPay;

    public int getTesterID() {
        return testerID;
    }

    public String getDepartment() {
        return department;
    }

    public double getExtraPay() {
        return extraPay;
    }

    public void setTesterID(int testerID) {
        this.testerID = testerID;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setExtraPay(double extraPay) {
        this.extraPay = extraPay;
    }

    public SDET_HsnAkd(String name, int age, char gender, int employeeID, int testerID, String department, double extraPay) {
        super(name, age, gender, employeeID, "SDET", 2000);
        setTesterID(testerID);
        setDepartment(department);
        setExtraPay(extraPay);
    }

    @Override
    public String toString() {
        return "SDET_HsnAkd{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", employeeID=" + getEmployeeID() +
                ", jobTitle='" + getJobTitle() + '\'' +
                ", salary=" + getSalary() +
                ", testerID=" + testerID +
                ", department='" + department + '\'' +
                ", extraPay=" + extraPay +
                '}';
    }
}
