package br.ufal.ic.huxley;

import org.junit.jupiter.api.Test;

import static br.ufal.ic.huxley.TeX.tex;
import static br.ufal.ic.huxley.VaiPraOnde.bestCity;
import static org.junit.jupiter.api.Assertions.assertEquals;


class TeXTest {
    @Test
    void texTest() {
        String input = "+To be or not to be,+ quoth the Bard, +that\n" +
                "is the question+.\n" +
                "The programming contestant replied: +I must disagree.\n" +
                "To #C# or not to #C#, that is The Question!+";
        String expectedOutput = "*To be or not to be,# quoth the Bard, *that\n" +
                "is the question#.\n" +
                "The programming contestant replied: *I must disagree.\n" +
                "To #C# or not to #C#, that is The Question!#";

        assertEquals(expectedOutput, tex(input), "Erro para o caso de teste 1");
    }
}
