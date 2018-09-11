package br.ufal.ic.huxley;

import org.junit.jupiter.api.Test;

import static br.ufal.ic.huxley.CadeirasDoAuditorio.numberChanges;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CadeirasDoAuditorioTest {
    @Test
    void numberChangesTest() {
        int[][] input = {{4, 3}, {2, 1}};
        int expectedOutput = 2;
        assertEquals(expectedOutput, numberChanges(2, 2, input), "Erro para o caso de teste 1, com input: " + input);
    }
}
