//Huxley problem 315
package br.ufal.ic.huxley;

public class NomesQueProduzemCores {
    public static String strToRGB(String str) {
        int size = str.length();

        if (size <= 3) {
            size = 3;
        } else if (size <= 6) {
            size = 6;
        } else if (size <= 9) {
            size = 9;
        } else if (size <= 12) {
            size = 12;
        }

        char strVector[] = str.toCharArray();
        char v[] = new char[16];
        String sv[] = new String[3];

        for (int i = 0; i < size; i++) {
            if (i >= str.length() || strVector[i] > 70)
                v[i] = '0';
            else
                v[i] = strVector[i];
        }

        for (int i = 0, aux = 0; i < size; i += (size/3), aux++) {
            sv[aux] = "" + v[i];
            if (size != 3)
                sv[aux] += v[i+1];
        }

        int r = Integer.parseInt(sv[0], 16);
        int g = Integer.parseInt(sv[1], 16);
        int b = Integer.parseInt(sv[2], 16);

        return "(" + r + "," + g + "," + b + ")";
    }
}
