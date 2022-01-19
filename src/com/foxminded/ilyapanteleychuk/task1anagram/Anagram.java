package com.foxminded.ilyapanteleychuk.task1anagram;

public class Anagram {

    public String reverse(String input) {
        StringBuilder reversedString = new StringBuilder();
        String[] splitedInput = input.split(" ");
        String[] inputWords = new String[splitedInput.length];
        for (int i = 0; i < inputWords.length; i++) {
            inputWords[i] = splitedInput[i];
        }
        for (int i = 0; i < inputWords.length; i++) {
            char[] letters = inputWords[i].toCharArray();

            for (int j = letters.length - 1; j >= 0; j--) {
                if (Character.isLetter(letters[j])) {
                    reversedString.append(letters[j]);
                }
            }
            for (int k = 0; k < letters.length; k++) {
                if (!Character.isLetter(letters[k])) {
                    reversedString.insert(k, letters[k]);
                }
            }
        }
        return reversedString.toString();
    }
}
