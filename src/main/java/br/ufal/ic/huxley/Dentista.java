//Huxley problem 200
package br.ufal.ic.huxley;

public class Dentista {
    public static int getQttQuery(int n, int queries[][]) {
        int aux1, aux2, qtt = 1;
        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (queries[j][1] > queries[j+1][1]) {
                    aux1 = queries[j][1];
                    aux2 = queries[j][0];
                    queries[j][1] = queries[j+1][1];
                    queries[j][0] = queries[j+1][0];
                    queries[j+1][0] = aux2;
                    queries[j+1][1] = aux1;
                }
            }
        }
        int bigger = queries[0][1];
        for (int i = 0; i < n; i++) {
            if (queries[i][0] >= bigger) {
                bigger = queries[i][1];
                qtt++;
            }
        }
        return qtt;
    }
}
