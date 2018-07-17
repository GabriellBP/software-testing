package br.ufal.ic.junittesting;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void testApp() {
        assertTrue( true );
    }

    @Test
    void arrayEquals() {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};

        assertArrayEquals(array1, array2);
    }

    @Test
    void objectNotEquals() {
        Object obj1 = new Object();
        Object obj2 = new Object();

        assertNotEquals(obj1, obj2);
    }

    @Test
    void objectEquals() {
        Object obj1 = new Object();
        Object obj2 = obj1;

        assertEquals(obj1, obj2);
    }

    @Test
    void stringContains() {
        String myString = "computação";

        assertTrue(myString.contains("o"), "string não contém a letra 'o'");
        assertTrue(myString.contains("ta"), "string não contém a silaba 'ta'");
    }

    @Test
    void listContains() {
        List<String> myList = new ArrayList<String>();
        myList.add("um");
        myList.add("dois");
        myList.add("três");
        myList.add("quatro");
        assertAll("A lista não possui um dos valores: 'dois' e 'quatro'",
                () -> assertTrue(myList.contains("dois"), "Lista não contém o valor 'dois'"),
                () -> assertTrue(myList.contains("quatro"), "Lista não contém o valor 'quatro'")
                );
    }

    @Test
    void stringComputacao() {
        String computacao = "computacão";

        assertAll(
                () -> assertEquals("computacão", computacao, "string não é igual a 'computação'"),
                () -> assertTrue(computacao.startsWith("comput"), "string não começa com 'comput'")
        );
    }

    @Test
    void stringInstitutoDif() {
        String instituto = "instituto";

        assertAll(
                () -> assertNotEquals("matemática", instituto, "string é igual a 'matemática'"),
                () -> assertNotEquals("física", instituto, "string é igaul a 'física'")
        );
    }

    @Test
    void stringInstitutoEq() {
        String instituto = "física";

        assertTrue(instituto.equals("matemática") || instituto.equals("física"),
                "string não é igual nem a 'matemática' nem a 'física'");
    }

    @Test
    void sevenTest() {
        int seven = 7;

        assertAll(
                () -> assertNotEquals(3, seven, "inteiro igual a 3"),
                () -> assertNotEquals(4, seven, "inteiro igual a 4")
        );
    }

    @Test
    void instanceTest() {
        Object obj1 = new Object();
        Object obj2 = new Object();

        assertNotSame(obj1, obj2, "As instâncias são iguais");
    }

    @Test
    void elementList() {
        List<String> myList = new ArrayList<String>();
        myList.add("abacate");
        myList.add("abacaxi");
        myList.add("abobora");
//        myList.add("jorge");

        assertTrue(myList.stream().allMatch(element -> {
            return element.contains("a");
        }), "Nem todos os elementos possuem a letra 'a'");
    }

}
