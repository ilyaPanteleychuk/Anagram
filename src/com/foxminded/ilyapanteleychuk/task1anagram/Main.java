package com.foxminded.ilyapanteleychuk.task1anagram;

public class Main {

    public static void main(String[] args) {
        Anagram anagram = new Anagram();
        String outPut = anagram.reverse("ab2cd3e%f4jh");
        System.out.println(outPut);
    }       
}
