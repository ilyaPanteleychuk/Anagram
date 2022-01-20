package com.foxminded.ilyapanteleychuk.task1anagram;

public class Anagram {

    public String reverse(String input) {

        char[] letters = input.toCharArray();
        int i = 0;
        int j = letters.length - 1;
        while (i < j) {
            if (Character.isLetter(letters[i]) && Character.isLetter(letters[j])) {
                char temp = letters[i];
                letters[i] = letters[j];
                letters[j] = temp;
            } else if (!Character.isLetter(letters[j])) {
                letters[j] = letters[j];
                i--;
            } else {
                letters[i] = letters[i];
                j++;
            }
            i++;
            j--;
        }
        String outPutWords2 = String.valueOf(letters);
        return outPutWords2;
    }
}
