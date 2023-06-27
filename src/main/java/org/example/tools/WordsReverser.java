package org.example.tools;

public class WordsReverser {
    public static String reverseWords(final String original) {
        String result = "";
        String[] words = original.split(" ");
        for(String word : words) {
            result += reverseWord(word) + " ";
        }
        return result.substring(0, result.length() - 1); // Remain the last character - " "
    }

    private static String reverseWord(final String word) {
        String reversedWord = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord += word.charAt(i);
        }

        return reversedWord;
    }
}
