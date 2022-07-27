package day17_While_DoWhile;

public class RemoveDuplicates_hsnakd {

    public static void main(String[] args) {

        String word = "AABBCC";
        String word2 = "";
        String result = "";

        for (int i = 0; i < word.length(); i++) {
            word2 = "" + word.charAt(i);
            if (result.contains(word2)) {
                continue;
            }
            result +=word2;
        }
        System.out.println("result = " + result);
    }

}
