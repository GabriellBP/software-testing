//Huxley problem 466
package br.ufal.ic.huxley;

public class VaiPraOnde {
    public static String bestCity(String[] destiny, int[] km, float[] value) {
        int kmF = 0;
        String city = "SEM DESTINO";
        for (int i = 0; i < km.length; i++) {
            if (kmF == 0 && (value[i]*2) <= 300) {
                city = destiny[i];
                kmF = km[i];
            }
            if (km[i] > kmF && (value[i] * 2) <= 300) {
                kmF = km[i];
                city = destiny[i];
            }
        }

        return city.toUpperCase();
    }
}
