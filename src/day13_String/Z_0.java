package day13_String;

public class Z_0 {
    public static void main(String[] args) {

        String word = "Java Programming Language";

        String str1 = word.substring(0,word.indexOf(" "));
        System.out.println("str1 = " + str1);

        String s2 = word.substring(word.indexOf(" ")+1, word.lastIndexOf("")) ;
        String str2 = s2.substring(0, s2.indexOf(" ")) ;


       System.out.println("str2 = " + str2);

        String str3 = s2.substring(s2.indexOf(" ")+1, s2.lastIndexOf("")) ;
        System.out.println("str3 = " + str3);



    }
}
