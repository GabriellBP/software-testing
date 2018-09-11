package br.ufal.ic.huxley;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static br.ufal.ic.huxley.FocoNasFotografias.numberOfPhotos;
import static org.junit.jupiter.api.Assertions.assertEquals;


class FocoNasFotografiasTest {
    @Test
    void numberOfPhotosTest() {
        int inputN = 3;
        int input[][] = {{1, 3}, {2, 5}, {4, 6}};
        int expectedOutput = 2;

        assertEquals(expectedOutput, numberOfPhotos(inputN, input), "Erro para o caso de teste 1, com input: " + Arrays.deepToString(input));
    }

}
