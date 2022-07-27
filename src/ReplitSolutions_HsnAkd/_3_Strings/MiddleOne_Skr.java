package ReplitSolutions_HsnAkd._3_Strings;
import java.util.*;

public class MiddleOne_Skr {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String word = scan.next();
            scan.close();
            String result="";
            //YOUR CODE HERE
            if(word.length()%2 !=0 && word.length()>2){
                result=""+word.charAt(word.length()/2);
            }else if(word.length()%2 !=0 && word.length()==1){
                result=word.repeat(3);
            }else if(word.length()%2==0 && word.length()>3){
                result=word.substring(word.length()/2-1,word.length()/2+1);
            }else if(word.length()%2==0 && word.length()==2){
                result=word+word;
            }
            System.out.println(result);



    }
}

