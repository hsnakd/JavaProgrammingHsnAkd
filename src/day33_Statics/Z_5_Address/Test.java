package day33_Statics.Z_5_Address;

public class Test {
    public static void main(String[] args) {
        Address iPhone1 = new Address("7925 Jones Branch Dr", "McLean", "Va", 22012);


        System.out.println(iPhone1);



    }
}
/*
5. Address Task:
		1. Create a class named Address:

		    Attributes:
		        instance:  street, city, state, zipCode;
		        static: country, planet

	        Add a constructor that can set All the fields (instances)

		    Actions
		            setInfo: sets all the instances
		            toString: returns the address
		                        EX:
		                            7925 Jones Branch Dr
		                            McLean Va, 22012


 */