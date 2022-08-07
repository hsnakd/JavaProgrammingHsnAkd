package day36_Inheritance.Z_7_ScrumTeamTask;


public class AmazonInc {
    public static void main(String[] args) {

        BusinessAnalyst businessAnalyst = new BusinessAnalyst("Nadide",35,'F', 12345, "BA",2000);
        Developer developer = new Developer("Lebibe",35,'F', 54321, "Dev",2000,"Java");
        Developer developer2 = new Developer("Lebibe",35,'F', 54321, "Dev",2000,"Java");
        ProductOwner productOwner= new ProductOwner("Melike",35,'F', 123456, "PO",2000);
        Tester tester = new Tester("Hsn",38,'M', 67890, "SDET",3000,"Automation");
        Tester tester2 = new Tester("Hsn",38,'M', 67890, "QA",3000,"Automation");
        ScrumMaster scrumMaster = new ScrumMaster("Akd",38,'M', 567894, "SM",5000);

        System.out.println(businessAnalyst);
        System.out.println(developer);
        System.out.println(productOwner);
        System.out.println(tester);
        System.out.println(scrumMaster);

        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");

        Tester[] testers = {tester,tester2};
        Developer[] developers = {developer,developer2};


        ScrumTeam scrumTeam = new ScrumTeam("H" , "S", "N");
        scrumTeam.addDevelopers(developers);
        scrumTeam.addTesters(testers);

        System.out.println(scrumTeam);

        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");



    }




}

/*
9. Create a class named AmazonInc:

			create the objects of ProductOwner, ScrumMaster, and BusinessAnalyst
			Create 4 objects of Testers
			Create 5 Objects of Developers

			Create an object of ScrumTeam

			Add the ProductOwner, ScrumMaster, and BusinessAnalyst, Testers and Developers object into the scrum team

 */