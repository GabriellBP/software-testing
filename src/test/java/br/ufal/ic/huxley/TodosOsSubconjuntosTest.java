package br.ufal.ic.huxley;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static br.ufal.ic.huxley.TodosOsSubconjuntos.generateSubsets;
import static org.junit.jupiter.api.Assertions.assertEquals;


class TodosOsSubconjuntosTest {
    @Test
    void generateSubsetsTest() {
        int input = 3;
        ArrayList<String> output = generateSubsets(input);
        String[] expectedOutput = {"{ 1 2 3 }", "{ 1 2 }", "{ 1 3 }", "{ 1 }", "{ 2 3 }", "{ 2 }", "{ 3 }", "{ }"};

        for (int i = 0; i < 8; i++) {
            assertEquals(expectedOutput[i], output.get(i), "Erro no index: " + i + ", no input: " + input);

        }
    }
}
