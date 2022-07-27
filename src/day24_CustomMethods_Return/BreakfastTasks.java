package day24_CustomMethods_Return;

public class BreakfastTasks {

    public static void main(String[] args) {
//1
        initials("cydeo", "school"); //

        System.out.println("----------------------------");
//2
        domain("Cydeo.School@amazon.com");

        System.out.println("-----------------------------");

        String[] emails = {"josh@gmail.com", "Jim@yahoo.com", "Elminur@cydeo.com", "Gulsen@gmail.com" };

        for (String email : emails) {
            domain(email);
        }

        System.out.println("-----------------------------");
//3
        nameOfMonth(11);

        System.out.println("-----------------------------");
//4
        nameOfDay(5);


        System.out.println("-----------------------------");
//5
        daysInMonth(5);


        System.out.println("-----------------------------");
//6
        nameOfGroup(38);
    }

    //1. Create a method that can display the initials of the person.    initials(String firstName, String lastName)
    public static void initials(String firstName, String lastName) {

        String initial = firstName.charAt(0) + "." + lastName.charAt(0);
        initial = initial.toUpperCase();
        System.out.println("initial = " + initial);


    }


    //2. Create a method that can display the domain of the email.  domain(String email)
    public static void domain(String email) { // Cydeo.School@gmail.com

        String domain = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));
        System.out.println("domain = " + domain);

    }


    //3. Create a method that can display the name of the month based on the given number to the method
    public static void nameOfMonth(int number){  // 95

        String name = "";

        if(number >= 1 && number <= 12){

            name = (number==1)?"Jan" :(number==2)?"Feb" :(number==3)?"Mar" :(number==4)?"Apr" :(number==5)?"May"
                    :(number==6)?"Jun" :(number==7)?"Jul" :(number==8)?"Aug" :(number==9)?"Sep" :(number==10)?"Oct"
                    :(number==11)?"Nov" : "Dec";

        }else{
            name = "Invalid";
        }

        System.out.println("Month name = " + name);

    }


    //4. Create a method that can print the name of the day based on the given number to the method
    public static void nameOfDay(int number){


        String day = "";

        if(number >= 1 && number <= 7){

            day = (number==1)?"Mon" :(number==2)?"Tue" :(number==3)?"Wed" :(number==4)?"Thu" :(number==5)?"Fri"
                    :(number==6)?"Sat" : "Sun";

        }else{
            day = "Invalid";
        }

        System.out.println("Day name = " + day);
    }

    //5. Create a method that can print how many days a month has
    public static void daysInMonth(int number){
        String name = "";
        int dayNum = 0;
        if(number >= 1 && number <= 12){

            name = (number==1)?"Jan" :(number==2)?"Feb" :(number==3)?"Mar" :(number==4)?"Apr" :(number==5)?"May"
                    :(number==6)?"Jun" :(number==7)?"Jul" :(number==8)?"Aug" :(number==9)?"Sep" :(number==10)?"Oct"
                    :(number==11)?"Nov" : "Dec";
            }else{
                name = "Invalid";
            }

            switch (number){
                case 1 :
                case 3 :
                case 5 :
                case 7 :
                case 8 :
                case 10 :
                case 12 :
                    dayNum = 31;
                    break;
                case 2 :
                    dayNum = 28;
                    break;
                case 4 :
                case 6 :
                case 9 :
                case 11 :
                    dayNum = 30;
                    break;
                default:
            name = "Invalid";
            }

        System.out.println(name + " has " + dayNum + " days");



    }


    // ageGroups(int age)


    public static void nameOfGroup(int number){


        String group = "";

        if(number >=1){

            group = (number>=1 && number<=2)?"infant" :(number>=3 && number<=5)?"Toddler" :(number>=6 && number<=9)?"Kid" :(number>=10 && number<=12)?" Pre-Teen" :(number>=13 && number<=17)?"Teenager"
                    :(number>=18 && number<=20)?"Young Adult" :(number>=21 && number<=39)?"Adult" :(number>=40 && number<=49)?"Young Middle-Aged Adult" :(number>=50 && number<=54)?"Middle-Aged Adult" :(number>=55 && number<=64)?"Very Young Senior Citizen" :(number>=65 && number<=74)?"Young Senior Citizen"
                    :(number>=75 && number<=84)?"Senior" : "Old Senior Citizen";

        }else{
            group = "Invalid";
        }

        System.out.println("Group name = " + group);
    }
}
/*
Warmup tasks:
	1. Create a method that can display the initials of the person

	2. Create a method that can display the domain of the email

	3. Create a method that can display the name of the month based on the given number to the method

	4. Create a method that can print the name of the day based on the given number to the method

	5. Create a method that can print how many days a month has

    6. ageGroups
                age groups are:
                        infant (1 - 2), Toddler (3 - 5),Kid (6 - 9), Pre-Teen (10 - 12),
                        Teenager (13 - 17),Young Adult (18 - 20),Adult (21 - 39),
                        Young Middle-Aged Adult (40 - 49),Middle-Aged Adult (50 - 54),
                        Very Young Senior Citizen (55 - 64),Young Senior Citizen (65 - 74),
                        Senior Citizen (75 - 84),
                        Old Senior Citizen (85+)


                        */
