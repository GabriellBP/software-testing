//Huxley problem 319
package br.ufal.ic.huxley;

public class FocoNasFotografias {
    public static int numberOfPhotos(int objQtt, int intervals[][]) {
//        intervals is a matrix intervals[objQtt][2]
        int aux, aux2, photos = 1;
        for (int i = objQtt - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (intervals[j][1] > intervals[j+1][1]) {
                    aux = intervals[j][1];
                    aux2 = intervals[j][0];
                    intervals[j][1] = intervals[j+1][1];
                    intervals[j][0] = intervals[j+1][0];
                    intervals[j+1][1] = aux;
                    intervals[j+1][0] = aux2;
                }
            }
        }
        int bigger = intervals[0][1];
        for (int i = 0; i < objQtt; i++) {
            if (intervals[i][0] > bigger) {
                bigger = intervals[i][1];
                photos++;
            }
        }
        return photos;
    }
}
