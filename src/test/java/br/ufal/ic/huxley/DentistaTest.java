package br.ufal.ic.huxley;

import org.junit.jupiter.api.Test;

import static br.ufal.ic.huxley.Dentista.getQttQuery;
import static org.junit.jupiter.api.Assertions.assertEquals;


class DentistaTest {
    @Test
    void getQttQueryTest() {
        int input[][] = {{10, 100}, {40, 130}, {120, 200}};
        int expectedOutput = 2;

        assertEquals(expectedOutput, getQttQuery(3, input), "Erro para o caso de teste 1, com input: n=5");

    }
}
