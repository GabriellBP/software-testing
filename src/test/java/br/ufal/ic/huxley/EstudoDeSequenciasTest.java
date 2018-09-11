package br.ufal.ic.huxley;

import org.junit.jupiter.api.Test;

import static br.ufal.ic.huxley.EstudoDeSequencias.biggestSubSequence;
import static org.junit.jupiter.api.Assertions.assertEquals;


class EstudoDeSequenciasTest {
    @Test
    void biggestSubSequenceTest() {
        int inputN[] = {5, 6, 4};
        int input[][] = {{10, 2, 3, 4, 20}, {1, 2, 3, 10, 17, 24}, {1, 2, 10, 11}};
        String expectedOutput[] = {"2 4", "3 6", "1 2"};

        for (int i = 0; i < inputN.length; i++) {
            assertEquals(expectedOutput[i], biggestSubSequence(inputN[i], input[i]), "Erro para o caso de teste 1, com input: " + input[i]);
        }
    }

}
