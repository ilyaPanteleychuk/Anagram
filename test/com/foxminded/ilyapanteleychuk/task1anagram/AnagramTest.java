package com.foxminded.ilyapanteleychuk.task1anagram;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AnagramTest {


    @Test
    void givenString_whenReverse_thenReturnReversedString() {
        Anagram reversed = new Anagram();
        assertEquals("edcba", reversed.reverse("abcde"));
    }
    
    @Test
    void givenSingleLetter_whenReverse_thenReturnLetter() {
        Anagram reversed = new Anagram();
        assertEquals("a", reversed.reverse("a"));
    }
    
    @Test
    void givenStringWithDiffCases_whenReverse_thenReturnReversedString() {
        Anagram reversed = new Anagram();
        assertEquals("ASJfjkkSKJHSFA", reversed.reverse("AFSHJKSkkjfJSA"));
    }
    
    @Test
    void givenStringSameLetter_whenReverse_thenReturnReversedString() {
        Anagram reversed = new Anagram();
        assertEquals("ffffff", reversed.reverse("ffffff"));
    }

    @Test
    void givenNonLetterSymbols_whenReverse_thenReturnNotReversedNonLetterSymbols() {
        Anagram reversed = new Anagram();
        assertEquals("#dc#b@a#", reversed.reverse("#ab#c@d#"));
    }
    
    @Test
    void givenOneSpace_whenReverse_thenReturnReversedWithSpace() {
        Anagram reversed = new Anagram();
        assertEquals("fe#d cb#a", reversed.reverse("ab#c de#f"));
    }
    
    @Test
    void givenSeveralSpace_whenReverse_thenReturnReversedWithSpaces() {
        Anagram reversed = new Anagram();
        assertEquals("ji#h gf#e dc@ba", reversed.reverse("ab#c de#f gh@ij"));
    }
        
    @Test
    void givenEmptyString_whenReverse_thenReturnNullPointerException() {
        Anagram reversed = new Anagram();
        assertThrows(NullPointerException.class, () -> {
            reversed.reverse("");
        });
    }

    @Test
    void givenWhiteSpaces_whenReverse_thenReturnNullPointerException() {
        Anagram reversed = new Anagram();
        assertThrows(NullPointerException.class, () -> {
            reversed.reverse("  ");
        });
    }

    @Test
    void givenNull_whenReverse_thenReturnNullPointerException() {
        Anagram reversed = new Anagram();
        assertThrows(NullPointerException.class, () -> {
            reversed.reverse(null);
        });
    }

    @Test
    void givenStringOfNumbers_whenReverse_thenReturnSameString() {
        Anagram reversed = new Anagram();
        assertEquals("12345", reversed.reverse("12345"));
    }

    @Test
    void givenStringOfSymbols_whenReverse_thenReturnSameString() {
        Anagram reversed = new Anagram();
        assertEquals("#%#%#!$#", reversed.reverse("#%#%#!$#"));
    }

}


