package br.ufal.ic.huxley;

import org.junit.jupiter.api.Test;

import static br.ufal.ic.huxley.NomesQueProduzemCores.strToRGB;
import static org.junit.jupiter.api.Assertions.assertEquals;


class NomesQueProduzemCoresTest {
    @Test
    void strToRGBTest() {
        String input = "CHUCKNORRIS";
        String expectedOutput = "(192,0,0)";

        assertEquals(expectedOutput, strToRGB(input), "Erro para o caso de teste 1, com input: '" + input + "'");
    }
}
