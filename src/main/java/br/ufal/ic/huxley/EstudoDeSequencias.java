//Huxley problem 674
package br.ufal.ic.huxley;

public class EstudoDeSequencias {
    public static String biggestSubSequence(int qtt, int sequence[]) {
        long qttTemp = 1, dif = sequence[1] - sequence[0], beginTemp = 1, begin = 0, end = 0, biggestQtt = 0;
        for (int i = 1; i < qtt; i++) {
            if (sequence[i]-sequence[i-1] == dif) {
                qttTemp++;
                if (biggestQtt < qttTemp) {
                    biggestQtt = qttTemp;
                    begin = beginTemp;
                    end = i + 1;
                }
            } else {
                qttTemp = 2;
                dif = sequence[i] - sequence[i-1];
                beginTemp = i;
            }
        }
        return begin + " " + end;
    }
}

