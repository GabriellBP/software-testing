package br.ufal.ic.junittesting;

import java.io.ByteArrayOutputStream;
import java.io.File;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Hello2Test {

    @Test
    void testHello() throws Exception {
//    	ByteArrayOutputStream out = new ByteArrayOutputStream();
        File f = new File("test.txt");
        f.createNewFile();

        FileOutputStream out = new FileOutputStream(f);

        Hello2 h = new Hello2(new PrintStream(out));

        assertNotNull(h, "Hello is null");

        assertAll(
                () -> assertNull(get("text1", h)),
                () -> assertNull(get("text2", h)));

        h.sayHello();
//        assertEquals("Hello World!" + System.lineSeparator(), out.toString(), "Strings arent equal");

        assertAll(
                () -> assertEquals("Hello", get("text1", h)),
                () -> assertEquals("World!", get("text2", h)));
    }

    private String get(String name, Hello2 obj) {
        try {
            Field f = Hello2.class.getDeclaredField(name);
            f.setAccessible(true);

            return (String) f.get(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
