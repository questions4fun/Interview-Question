package com.company;

public class FunClass {
    public int longestWord(String sentence) {
        if (sentence == null) {
            return 0;
        }

        String[] words = sentence.split(" ");
        int longestWord = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > longestWord) {
                longestWord = words[i].length();
            }
        }
        return longestWord;
    }
}
