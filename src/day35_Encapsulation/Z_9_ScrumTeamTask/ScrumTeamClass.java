package day35_Encapsulation.Z_9_ScrumTeamTask;
/*
import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeamClass {

    private String PO, BA, SM;
    private ArrayList<Tester> testers;
    private ArrayList<Developer> developers;

    public String getPO() {
        return PO;
    }

    public String getBA() {
        return BA;
    }

    public String getSM() {
        return SM;
    }

    public ArrayList<Tester> getTesters() {
        return testers;
    }

    public ArrayList<Developer> getDevelopers() {
        return developers;
    }

    public void setPO(String PO) {
        this.PO = PO;
    }

    public void setBA(String BA) {
        this.BA = BA;
    }

    public void setSM(String SM) {
        this.SM = SM;
    }

    public void setTesters(ArrayList<Tester> testers) {
        this.testers = testers;
    }

    public void setDevelopers(ArrayList<Developer> developers) {
        this.developers = developers;
    }

    public void addTester(Tester tester){
        testersList.add( tester );
    }

    public void addTesters(Tester[] testers){
        testersList.addAll( Arrays.asList(testers) );
    }

    public void addDeveloper(Developer developer){
        devopsList.add( developer );
    }

    public void addDevelopers(Developer[] developers){
        devopsList.addAll( Arrays.asList(developers) );
    }

    public void removeTester(int employeeID){
        testersList.removeIf( p ->  p.employeeID == employeeID );
    }

    public void removeDeveloper(int employeeID){
        devopsList.removeIf( p -> p.employeeID == employeeID);
    }

    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", total number of testers=" + testersList.size() +
                ", total number of developers=" + devopsList.size() +
                ", daysOfSprint=" + daysOfSprint +
                '}';
    }



}

/*
9. ScrumTeamTask:*
    re-do the Scrum task by making all the fields private in each custom classes


    Encapsulate all the field
        (salary cannot be set to negative)
        (employeeId cannot be set to negative or zero)

    Avoid any duplicated code fragments in each class


 */