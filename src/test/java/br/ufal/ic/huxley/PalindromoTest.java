package br.ufal.ic.huxley;

import org.junit.jupiter.api.Test;

import static br.ufal.ic.huxley.Palindromo.greaterPalindrome;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PalindromoTest {
    @Test
    void greaterPalindromeTest() {
        String[] inputTest1 = {"ADAM", "MADAM", "OLO", "", "G", " "};
        int[] expectedOutput1 = {3, 5, 3, 0, 1, 1};

        for (int i = 0; i < inputTest1.length; i++) {
            assertEquals(expectedOutput1[i], greaterPalindrome(inputTest1[i]), "Erro para a entrada: '" + inputTest1[i] + "'");
        }
    }
}
