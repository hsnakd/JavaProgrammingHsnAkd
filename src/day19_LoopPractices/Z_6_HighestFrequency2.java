package day19_LoopPractices;

public class Z_6_HighestFrequency2 {
    public static void main(String[] args) {

        String str = "aaaaabbbbbccd";

        int highestFrequency = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if(ch == str.charAt(j)){
                    count++;
                }
            }

            if(count > highestFrequency){
                highestFrequency = count;
            }

        }


        String result = "";
        String result2 = "";


        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if(ch == str.charAt(j)){
                    count++;
                }
            }

            if(count == highestFrequency && !result.contains(ch+"")){
                result += ch;
                result2 = "" + count;
            }

        }
        System.out.println( result + " : " + result2);
    }
}
/*
	6.  Write a program that can find the character that has the highest frequency from a string
 */
