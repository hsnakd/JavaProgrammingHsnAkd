package day39_Recap.cydeoTask;

public class SDET_HsnAkd_J extends SDET_HsnAkd{

    private  int workingYear;

    public int getWorkingYear() {
        return workingYear;
    }

    public void setWorkingYear(int workingYear) {
        if (workingYear <= 0) {
            System.out.println("Invalid Value : " + workingYear);
            System.exit(1);
        }
        this.workingYear = workingYear;
    }

    public SDET_HsnAkd_J(String name, int age, char gender, int employeeID, int testerID, String department, double extraPay, int workingYear) {
        super(name, age, gender, employeeID, testerID, department, extraPay);
        setWorkingYear(workingYear);
    }

    @Override
    public String toString() {
        return "SDET_HsnAkd_J{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", employeeID=" + getEmployeeID() +
                ", jobTitle='" + getJobTitle() + '\'' +
                ", salary=" + getSalary() +
                ", testerID=" + getTesterID() +
                ", department='" + getDepartment() + '\'' +
                ", extraPay=" + getExtraPay() +
                ", workingYear=" + getWorkingYear() +
                ", workingYear=" + workingYear +
                '}';
    }
}
