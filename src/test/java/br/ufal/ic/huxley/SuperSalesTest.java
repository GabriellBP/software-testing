package br.ufal.ic.huxley;

import org.junit.jupiter.api.Test;

import static br.ufal.ic.huxley.SuperSales.maxPurchase;
import static org.junit.jupiter.api.Assertions.assertEquals;


class SuperSalesTest {
    @Test
    void maxPurchaseTest() {
//        Caso de teste 1:
        int p1[] = {72, 44, 31}, w1[] = {17, 23, 24}, g1[] = {26};
        int expectedOutput1 = 72;

        assertEquals(expectedOutput1, maxPurchase(3, p1, w1, 1, g1), "Erro para o caso de teste 1");

//        Caso de teste 1:
        int p2[] = {64, 85, 52, 99, 39, 54}, w2[] = {26, 22, 4, 18, 13, 9}, g2[] = {23, 20, 20, 26};
        int expectedOutput2 = 514;

        assertEquals(expectedOutput2, maxPurchase(6, p2, w2, 1, g2), "Erro para o caso de teste 2");
    }
}
