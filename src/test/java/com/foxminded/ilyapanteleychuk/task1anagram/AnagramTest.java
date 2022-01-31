package com.foxminded.ilyapanteleychuk.task1anagram;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AnagramTest {

    Anagram reversed;

    @BeforeEach
    public void instanceInitialize() {
        reversed = new Anagram();
    }

    @Test
    void reverse_shouldReverseString_whenInputIsString() {
        assertEquals("edcba", reversed.reverse("abcde"));
    }

    @Test
    void reverse_shouldReturnOneLetter_whenInputIsSingleLetter() {
        assertEquals("a", reversed.reverse("a"));
    }

    @Test
    void reverse_shouldReturnReversedString_whenLettersHaveDifferentCases() {
        assertEquals("ASJfjkkSKJHSFA", reversed.reverse("AFSHJKSkkjfJSA"));
    }

    @Test
    void reverse_shouldReturnSameString_whenInputIsSameLetter() {
        assertEquals("ffffff", reversed.reverse("ffffff"));
    }

    @Test
    void reverse_shouldNotReverseAnySymbol_whenInputHasSymbols() {
        assertEquals("#dc#b@a#", reversed.reverse("#ab#c@d#"));
    }

    @Test
    void reverse_shouldReverseWithSpace_whenInputHasSpace() {
        assertEquals("fe#d cb#a", reversed.reverse("ab#c de#f"));
    }

    @Test
    void reverse_shouldReverseWithAllSpaces_whenInputHasSeveralSpaces() {
        assertEquals("ji#h gf#e dc@ba", reversed.reverse("ab#c de#f gh@ij"));
    }

    @Test
    void reverse_shouldThrowNullPointerException_whenInputIsEmpty() {
        assertThrows(NullPointerException.class, () -> {
            reversed.reverse("");
        });
    }

    @Test
    void reverse_shouldThrowNullPointerException_whenInputHasOnlySpaces() {
        assertThrows(NullPointerException.class, () -> {
            reversed.reverse("  ");
        });
    }

    @Test
    void reverse_shouldThrowNullPointerException_whenInputIsNull() {
        assertThrows(NullPointerException.class, () -> {
            reversed.reverse(null);
        });
    }

    @Test
    void reverse_shouldNotReverseAnyNumber_whenInputHasOnlyNumbers() {
        assertEquals("12345", reversed.reverse("12345"));
    }

    @Test
    void reverse_shouldNotReverseAnySymbols_whenInputHasOnlySymbols() {
        assertEquals("#%#%#!$#", reversed.reverse("#%#%#!$#"));
    }
}
