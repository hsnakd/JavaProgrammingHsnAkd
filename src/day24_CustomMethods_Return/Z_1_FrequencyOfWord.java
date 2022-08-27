package day24_CustomMethods_Return;

public class Z_1_FrequencyOfWord {
    public static void main(String[] args) {

        String sentence = "Java cube cube python python";
        String word = "java";
        System.out.println(frequencyOfWord(sentence,word));
    }


    public static int frequencyOfWord (String sentence, String word){

        int result = 0;
        sentence = sentence.toLowerCase();
        word = word.toLowerCase();

        while (sentence.contains(word) )  {
            sentence = sentence.replaceFirst(word, "");
            result++;
        }

        return result;

    }


}

/*
1.  create a method named frequencyOfWord that passes two parameters:
    string sentence and String word, then returns the frequency of word from the sentence
        Ex:
        sentence = "Java cube cube python python";
        word = "cube";
        frequencyOfWord(sentence, word) ==>  3

 */