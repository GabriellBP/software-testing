package br.ufal.ic.huxley;

import org.junit.jupiter.api.Test;

import static br.ufal.ic.huxley.Costa.nlogoniaCoast;
import static org.junit.jupiter.api.Assertions.assertEquals;


class CostaTest {
    @Test
    void nlogoniaCoastTest(){
        char input[][] = {
                {'#', '#', '#', '#', '#'},
                {'#', '.', '.', '.', '#'},
                {'.', '.', '.', '.', '.'},
                {'#', '.', '.', '.', '.'},
                {'#', '#', '.', '.', '#'}
        };
        int expectedOutput = 11;
        assertEquals(expectedOutput, nlogoniaCoast(5, 5, input), "Erro para o caso de teste 1, com input: 5x5\n");
    }
}