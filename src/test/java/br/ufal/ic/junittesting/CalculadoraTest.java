package br.ufal.ic.junittesting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import static br.ufal.ic.junittesting.Calculadora.isPrime;

public class CalculadoraTest {

    private int[] primes = { 2, 3, 5, 11, 23, 15485863, 32452843, 49979687, 67867967, 86028121, 104395301, 122949823,
            141650939, 160481183, 217645177, 236887691, 256203161, 275604541, 295075147, 314606869, 334214459,
            353868013, 373587883, 393342739, 413158511, 433024223, 452930459, 472882027, 492876847, 512927357,
            533000389, 553105243, 573259391, 593441843, 613651349, 982451653 };

    private int[] notPrimes = { 1, 10, 25, 35, 50 };

    @Test
    void isPrimeTest() {

//		assertAll(Arrays.asList(primes).stream()
//				.map(n -> return (() -> assertTrue(isPrime(n)))));

        assertAll(
                () -> {
                    for (int p : this.primes) {
                        assertTrue(isPrime(p), "Deu ruim para " + p + ", disse que não é primo");
                    }
                },
                () -> {
                    for (int p : this.notPrimes) {
                        assertFalse(isPrime(p), "Deu ruim para " + p + ", disse que é primo");
                    }
                });
    }

}
