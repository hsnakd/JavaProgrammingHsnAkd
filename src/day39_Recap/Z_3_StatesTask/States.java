package day39_Recap.Z_3_StatesTask;

public class States {
    private String name;
    private String abbreviation;
    private String politicalParty;
    private String governor;
    private String senator;
    private int population;
    private double stateTax;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getPoliticalParty() {
        return politicalParty;
    }

    public void setPoliticalParty(String politicalParty) {
        this.politicalParty = politicalParty;
    }

    public String getGovernor() {
        return governor;
    }

    public void setGovernor(String governor) {
        governor = governor;
    }

    public String getSenator() {
        return senator;
    }

    public void setSenator(String senator) {
        this.senator = senator;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public double getStateTax() {
        return stateTax;
    }

    public void setStateTax(double stateTax) {
        this.stateTax = stateTax;
    }

    public States(String name, String abbreviation, String politicalParty, String governor, String senator, int population, double stateTax) {
        setName(name);
        setAbbreviation(abbreviation);
        setPoliticalParty(politicalParty);
        setGovernor(governor);
        setSenator(senator);
        setPopulation(population);
        setStateTax(stateTax);
    }

    @Override
    public String toString() {
        return "States{" +
                "name='" + name + '\'' +
                ", abbreviation='" + abbreviation + '\'' +
                ", politicalParty='" + politicalParty + '\'' +
                ", governor='" + governor + '\'' +
                ", senator='" + senator + '\'' +
                ", population=" + population +
                ", stateTax=" + stateTax +
                '}';
    }
}
/*
States Task:
	1. Create a class named States:
			variables:
				name, abbreviation, politicalParty, Governor, senator, population, stateTax

			Encapsulate all the fields

			Add a constructor that can set all the fields

						Conditions:
							1. name, abbreviation, politicalParty, Governor, and senator can not be null
							2. name, abbreviation, politicalParty, Governor, and senator can not be empty
							3. taxRate can not be negative
							4. Population can not be set to zero or negative

			Methods:
				toString()


	2. Create the following subclasses of States and add any additional fields and methods if necessary:
				1. Virginia
				2. California
				3. Texas
				4. Florida


	3. Create a class named StateObjects
					Create the objects of each subclasses

					test all the functions of each objects

            		Analyze the relationships between the classes

 */