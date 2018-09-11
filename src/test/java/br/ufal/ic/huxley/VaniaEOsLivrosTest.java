package br.ufal.ic.huxley;

import org.junit.jupiter.api.Test;

import static br.ufal.ic.huxley.VaniaEOsLivros.digitsNumber;
import static org.junit.jupiter.api.Assertions.assertEquals;


class VaniaEOsLivrosTest {
    @Test
    void digitsNumberTest() {
        int input = 13;
        long expectedOutput = 17;
        long output = digitsNumber(input);

        assertEquals(expectedOutput, output, "Erro para o caso de teste 1, com input: " + input);
    }
}
