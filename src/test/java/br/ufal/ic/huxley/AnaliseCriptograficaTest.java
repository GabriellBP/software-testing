package br.ufal.ic.huxley;

import org.junit.jupiter.api.Test;

import static br.ufal.ic.huxley.AnaliseCriptografica.getQttLetters;
import static org.junit.jupiter.api.Assertions.assertEquals;


class AnaliseCriptograficaTest {
    @Test
    void getQttLettersTest() {
        String[] input = {"Testando 1 2 3...", "Poderia incluir alguns acentos, assim como a cedilha...", "Concorda ou discorda?"};
        AnaliseCriptografica.Letter[] output = getQttLetters(3, input);

        char[] expectedOutputChar = {'A', 'O', 'C', 'D', 'I', 'S', 'N', 'E', 'R', 'L', 'T', 'U', 'M', 'G', 'H', 'P'};
        int[] expectedOutputInt = {9, 9, 7, 6, 6, 6, 5, 4, 4, 3, 3, 3, 2, 1, 1, 1};

        for (int i = 0; i < 16; i++) {
            if (output[i].qtt != 0) {
                assertEquals(expectedOutputChar[i], output[i].nLetter, "Erro no nLetter para o character: " + expectedOutputChar[i]);
                assertEquals(expectedOutputInt[i], output[i].qtt, "Erro no qtt para o character: " + expectedOutputChar[i]);
            }
        }
    }
}
