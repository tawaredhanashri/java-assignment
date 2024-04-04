import java.util.*;

public class WordCount {
    
    public static int countWords(String str) {
        String[] words = str.split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        String inputString = "Hello! I am Dhanashri";
        int wordCount = countWords(inputString);
        System.out.println("Number of words in the string: " + wordCount);
    }
}
