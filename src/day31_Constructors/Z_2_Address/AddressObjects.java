package day31_Constructors.Z_2_Address;

public class AddressObjects {
    public static void main(String[] args) {

        Address address1 =  new Address(7925, "Jones Branch Dr", "McLean", "Va", 22012);
        System.out.println(address1);
    }
}

/*
2. Car Task:
	2.1 Create a class named Car
		    Attributes:
		         buildingNumber, street, city, state, zipCode;

		   	Add a constructor to set all the fields

		    Actions
		            toString: returns the address
		                        EX:
		                            7925 Jones Branch Dr
		                            McLean Va, 22012

 */