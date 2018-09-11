package br.ufal.ic.huxley;

import org.junit.jupiter.api.Test;

import static br.ufal.ic.huxley.VaiPraOnde.bestCity;
import static org.junit.jupiter.api.Assertions.assertEquals;


class VaiPraOndeTest {
    @Test
    void bestCityTest() {
        String[] destiny = {"Natal", "Recife"};
        int[] km = {154, 104};
        float[] value = {135, 110};
        String expected = "NATAL";

        assertEquals(expected, bestCity(destiny, km, value), "Erro para o caso de teste 1 com destiny: " + destiny);
    }
}
