package br.ufal.ic.junittesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HelloTest {
    Hello hello = new Hello();

    @Test
    void helloTest() {
        assertDoesNotThrow(() -> hello.sayHello());
    }
}
