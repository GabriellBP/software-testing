//Huxley problem 94
package br.ufal.ic.huxley;

import java.util.*;

import static java.lang.Character.toUpperCase;

public class AnaliseCriptografica {
    private static class Letter {
        private char nLetter;
        private int qtt;

        Letter() {
            this.qtt = 0;
        }
    }

    private static class MyComparator implements Comparator<Letter> {
        @Override
        public int compare(Letter l1, Letter l2) {
            if (Integer.compare(l1.qtt, l2.qtt) == 0)
                return Character.compare(l1.nLetter, l2.nLetter);
            return -(Integer.compare(l1.qtt, l2.qtt));
        }
    }

    public static Letter[] getQttLetters(int linesQtt, String lines[]) {
        Letter[] letters = new Letter[128];
        for (int i = 0; i < 128; i++) {
            letters[i] = new Letter();
        }
        for (String line : lines) {
            char ls[] = line.toCharArray();
            for (char l : ls) {
                l = toUpperCase(l);
                int nl = (int) l;
                if (nl >= 65 && nl <= 90) {
                    letters[nl].nLetter = l;
                    letters[nl].qtt++;
                }
            }
        }

        Arrays.sort(letters, new MyComparator());

        return letters;
    }
}
