package br.ufal.ic.huxley;

import org.junit.jupiter.api.Test;

import static br.ufal.ic.huxley.CorteDeHastes.bestSale;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CorteDeHastesTest {
    @Test
    void bestSaleTest() {
        int[] inputTest1 = {1, 5, 8, 9, 10, 17, 17};
        int expectedOutput1 = 18;
        int n1 = inputTest1.length;

        assertEquals(expectedOutput1, bestSale(n1, inputTest1), "Erro para a entrada 1: '" + inputTest1 + "'");

    }
}
