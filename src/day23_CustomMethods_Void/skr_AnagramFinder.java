package day23_CustomMethods_Void;
import java.util.Arrays;
public class skr_AnagramFinder {

    public static void main(String[] args) {
        anagramFind("silent","listen");
    }
    public static void anagramFind(String word1,String word2){
        char[] arr1=word1.toCharArray();
        char[] arr2=word2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1,arr2)){
            System.out.println(word1+" and "+word2+" are anagram");
        }else System.out.println(word1+" and "+word2+" are NOT anagram");
    }

}
