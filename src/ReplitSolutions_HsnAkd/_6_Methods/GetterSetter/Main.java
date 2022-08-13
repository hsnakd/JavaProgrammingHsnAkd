package ReplitSolutions_HsnAkd._6_Methods.GetterSetter;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Db db = new Db(in.next(),in.nextInt());

        System.out.println(db.getData());
        System.out.println(db.getYint());

        db.setData(in.next());
        db.setYint(in.nextInt());

        System.out.println(db.getData());
        System.out.println(db.getYint());

    }
}

/*
The Db class will have two private instance variables. Create those variables and provide public getters and setters for them. Note: A constructor is provided.

Instance variables:

data (String)
name: yint (int)
Methods:

- getData()
- getYint()
- setData()
- setYint()
Example:

Db db = new Db("aaa",123);

 System.out.println(db.getData());//aaa
 System.out.println(db.getYint());//123

 db.setData("zzz");
 db.setYint(200);

 System.out.println(db.getData());//zzz
 System.out.println(db.getYint());//200
 */