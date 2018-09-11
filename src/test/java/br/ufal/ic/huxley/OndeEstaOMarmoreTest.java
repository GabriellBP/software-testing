package br.ufal.ic.huxley;

import org.junit.jupiter.api.Test;

import static br.ufal.ic.huxley.OndeEstaOMarmore.findMarble;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class OndeEstaOMarmoreTest {
    @Test
    void findMarbleTest() {
        int n1 = 4, q1 = 1;
        int[] marbles1 = {2, 3, 5, 1};
        int[] queries1 = {5};
        String[] expectedOutput1 = {"5 found at 4"};


        int n2 = 5, q2 = 2;
        int[] marbles2 = {1, 3, 3, 3, 1};
        int[] queries2 = {2, 3};
        String[] expectedOutput2 = {"2 not found", "3 found at 3"};

        assertAll(() -> {
            assertArrayEquals(expectedOutput1, findMarble(n1, q1, marbles1, queries1), "Erro para a entrada 1'");
            assertArrayEquals(expectedOutput2, findMarble(n2, q2, marbles2, queries2), "Erro para a entrada 2");
        });


    }

}
