package com.foxminded.ilyapanteleychuk.task1anagram;

public class Main {

    public static void main(String[] args) {
        Anagram anagram = new Anagram();
        String outPut = anagram.reverse("abc4de4fg!%ij");
        System.out.println(outPut);
    }       
}
