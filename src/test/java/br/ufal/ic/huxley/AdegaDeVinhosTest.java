package br.ufal.ic.huxley;

import org.junit.jupiter.api.Test;

import static br.ufal.ic.huxley.AdegaDeVinhos.maxSale;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class AdegaDeVinhosTest {
    @Test
    void maxSaleTest() {
        int[] input = {2, 3, 5, 1, 4};
        int expectedOutput = 50;
        int output = maxSale(5, input);

        assertEquals(expectedOutput, output, "Erro para o caso de teste 1, com input: " + input);
    }

}
