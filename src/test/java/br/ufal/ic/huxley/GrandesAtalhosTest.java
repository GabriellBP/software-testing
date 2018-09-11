package br.ufal.ic.huxley;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static br.ufal.ic.huxley.GrandesAtalhos.replaceShortcut;
import static br.ufal.ic.huxley.GrandesAtalhos.replaceShortcut2;
import static org.junit.jupiter.api.Assertions.assertEquals;

class GrandesAtalhosTest {
    @Test
    void replaceShortcutTest() {
        String input;
        Map<Character, String> inputReplaces ;
        String expectedOutput;

        input = "*A*ABA*C";
        inputReplaces = new HashMap<>();
        inputReplaces.put('A', "BB");
        inputReplaces.put('C', "MARATONA");
        expectedOutput = "BBBBBAMARATONA";
        assertEquals(expectedOutput, replaceShortcut(input, inputReplaces), "Erro para o caso de teste 1, com input: *A*ABA*C");

        input = "**AB";
        inputReplaces = new HashMap<>();
        inputReplaces.put('A', "C");
        expectedOutput = "*CB";
        assertEquals(expectedOutput, replaceShortcut(input, inputReplaces), "Erro para o caso de teste 2, com input: **AB");

        input = "*A";
        inputReplaces = new HashMap<>();
        expectedOutput = "*A";
        assertEquals(expectedOutput, replaceShortcut(input, inputReplaces), "Erro para o caso de teste 2, com input: *A");
    }

    @Test
    void replaceShortcut2Test() {
        String input;
        Map<Character, String> inputReplaces ;
        String expectedOutput;

        input = "*A*ABA*C";
        inputReplaces = new HashMap<>();
        inputReplaces.put('A', "BB");
        inputReplaces.put('C', "MARATONA");
        expectedOutput = "BBBBBAMARATONA";
        assertEquals(expectedOutput, replaceShortcut2(input, inputReplaces), "Erro para o caso de teste 1, com input: *A*ABA*C");

        input = "**AB";
        inputReplaces = new HashMap<>();
        inputReplaces.put('A', "C");
        expectedOutput = "*CB";
        assertEquals(expectedOutput, replaceShortcut2(input, inputReplaces), "Erro para o caso de teste 2, com input: **AB");

        input = "*A";
        inputReplaces = new HashMap<>();
        expectedOutput = "*A";
        assertEquals(expectedOutput, replaceShortcut2(input, inputReplaces), "Erro para o caso de teste 2, com input: *A");
    }

}
