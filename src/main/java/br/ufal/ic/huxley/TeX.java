//Huxley problem 90
package br.ufal.ic.huxley;

public class TeX {
    public static String tex(String text) {
        boolean signal = false;
        StringBuilder newText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '+' && !signal) {
                newText.append('*');
                signal = true;
            } else if (text.charAt(i) == '+' && signal) {
                newText.append('#');
                signal = false;
            } else {
                newText.append(text.charAt(i));
            }
        }
        return newText.toString();
    }
}
