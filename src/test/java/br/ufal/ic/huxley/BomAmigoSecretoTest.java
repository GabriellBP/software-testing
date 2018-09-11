package br.ufal.ic.huxley;

import org.junit.jupiter.api.Test;

import static br.ufal.ic.huxley.BomAmigoSecreto.numberOfConfigurations;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class BomAmigoSecretoTest {
    @Test
    void numberOfConfigurationsTest() {
        int[] input = {3, 1000};
        long[] expectedOutput = {1L, 878320716L};

        for (int i = 0; i < 2; i++) {
            assertEquals(expectedOutput[i], numberOfConfigurations(input[i]), "Erro para o caso de teste 1, com input: " + input[i]);
        }
    }
}
