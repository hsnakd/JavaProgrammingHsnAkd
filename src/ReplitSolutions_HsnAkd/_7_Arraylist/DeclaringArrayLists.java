package ReplitSolutions_HsnAkd._7_Arraylist;

import java.util.ArrayList;

public class DeclaringArrayLists {
    public static void main(String[] args) {
        System.out.println(test());
    }
    public static ArrayList<Integer> test(){
        //write code here
        ArrayList<Integer> result = new ArrayList<>();

        return result;
    }

}
/*
Write code in the test method that will declare and initialize an ArrayList of Integers,
then return it as is - empty.

An ArrayList is a collection of objects, similar to an array.
However, a few notable differences in how they work:

The size of an ArrayList can be changed
You can add, insert, and delete elements easily with ArrayLists
You can only have ArrayLists of objects! (int/double/boolean are primitive dataTypes)
IMPORTANT: Please note that we will be working with new objects that represent primitive dataTypes:

Integer is an object that represent an int
Double is an object that represents a double
Boolean is an object that represents a boolean
(Note the capital letters for the objects!)

However, unlike arrays, ArrayLists need to be imported before they can be used.
The line that we use to do this is the following (written outside the class header on line 3):

import cube.util.ArrayList;
This allows us to create the ArrayList object.

To declare and initialize an ArrayList, we use the same code as we did to declare objects,
except this time, our datatype is ArrayList:

create an Arraylist of Strings

ArrayList<String> names = new ArrayList<>();
|<------------------->|   |<-------------------->|
     declaration                 initialization
create an Arraylist of Integers

ArrayList<Integer> nums = new ArrayList<>();
 */
