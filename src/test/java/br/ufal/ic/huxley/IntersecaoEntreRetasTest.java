package br.ufal.ic.huxley;

import org.junit.jupiter.api.Test;

import static br.ufal.ic.huxley.IntersecaoEntreRetas.calculatingIntersection;
import static org.junit.jupiter.api.Assertions.assertEquals;

class IntersecaoEntreRetasTest {
    @Test
    void calculatingIntersectionTest() {
        int x1[] = {10, -1, -1};
        int y1[] = {-16, 2, 3};
        int x2[] = {-5, -21, -4};
        int y2[] = {14, 7, 5};
        int x3[] = {30, 0, 0};
        int y3[] = {31, -1, 3};
        int x4[] = {0, 5, 3};
        int y4[] = {1, -16, 1};

        String expectedOutput[] = {"1,00 2,00", "-1,00 2,00", "NUNCA\n"};

        for (int i = 0; i < 3; i++) {
            assertEquals(expectedOutput[i], calculatingIntersection(x1[i], y1[i], x2[i], y2[i], x3[i], y3[i], x4[i], y4[i]), "Erro para o caso de teste 1, com input: " + x1[i] + ", " + y1[i] + ", " + x2[i] + ", " + y2[i] + ", " +  x3[i] + ", " + y3[i] + ", " + x4[i] + ", " + y4[i]);
        }
    }
}
