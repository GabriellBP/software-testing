package br.ufal.ic.huxley;

import org.junit.jupiter.api.Test;

import static br.ufal.ic.huxley.MatrizAleatoria.generateMatrix;
import static org.junit.jupiter.api.Assertions.assertEquals;


class MatrizAleatoriaTest {
    @Test
    void generateMatrixTest() {
        int l1 = 4, c1 = 4;
        String expectedOutput1 =
                "001 011 012 008\n" +
                "002 013 016 007\n" +
                "003 014 015 006\n" +
                "004 009 010 005\n";

        assertEquals(expectedOutput1, generateMatrix(l1, c1), "Erro para o caso de teste 1, com input: " + c1 + " e " + l1);
        assertEquals(expectedOutput1, generateMatrix(l1, c1), "Erro para o caso de teste 1, com input: " + c1 + " e " + l1);

        int l2 = 5, c2 = 5;
        String expectedOutput2 =
                "001 014 015 016 010\n" +
                "002 017 024 022 009\n" +
                "003 018 025 021 008\n" +
                "004 019 023 020 007\n" +
                "005 011 012 013 006\n";

        assertEquals(expectedOutput2, generateMatrix(l2, c2), "Erro para o caso de teste 2, com input: " + c2 + " e " + l2);


    }
}
