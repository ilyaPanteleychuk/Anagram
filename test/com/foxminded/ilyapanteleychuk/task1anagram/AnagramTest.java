package com.foxminded.ilyapanteleychuk.task1anagram;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AnagramTest {

    Anagram reversed;
    @BeforeEach
    public void instanceInitialize() {
        reversed = new Anagram();
    }

    @Test
    void givenString_whenReverse_thenReturnReversedString() {
        assertEquals("edcba", reversed.reverse("abcde"));
    }

    @Test
    void givenSingleLetter_whenReverse_thenReturnLetter() {
        assertEquals("a", reversed.reverse("a"));
    }

    @Test
    void givenStringWithDiffCases_whenReverse_thenReturnReversedString() {
        assertEquals("ASJfjkkSKJHSFA", reversed.reverse("AFSHJKSkkjfJSA"));
    }

    @Test
    void givenStringSameLetter_whenReverse_thenReturnReversedString() {
        assertEquals("ffffff", reversed.reverse("ffffff"));
    }

    @Test
    void givenNonLetterSymbols_whenReverse_thenReturnNotReversedNonLetterSymbols() {
        assertEquals("#dc#b@a#", reversed.reverse("#ab#c@d#"));
    }

    @Test
    void givenOneSpace_whenReverse_thenReturnReversedWithSpace() {
        assertEquals("fe#d cb#a", reversed.reverse("ab#c de#f"));
    }

    @Test
    void givenSeveralSpace_whenReverse_thenReturnReversedWithSpaces() {
        assertEquals("ji#h gf#e dc@ba", reversed.reverse("ab#c de#f gh@ij"));
    }

    @Test
    void givenEmptyString_whenReverse_thenReturnNullPointerException() {
        assertThrows(NullPointerException.class, () -> {
            reversed.reverse("");
        });
    }

    @Test
    void givenWhiteSpaces_whenReverse_thenReturnNullPointerException() {
        assertThrows(NullPointerException.class, () -> {
            reversed.reverse("  ");
        });
    }

    @Test
    void givenNull_whenReverse_thenReturnNullPointerException() {
        assertThrows(NullPointerException.class, () -> {
            reversed.reverse(null);
        });
    }

    @Test
    void givenStringOfNumbers_whenReverse_thenReturnSameString() {
        assertEquals("12345", reversed.reverse("12345"));
    }

    @Test
    void givenStringOfSymbols_whenReverse_thenReturnSameString() {
        assertEquals("#%#%#!$#", reversed.reverse("#%#%#!$#"));
    }
}
