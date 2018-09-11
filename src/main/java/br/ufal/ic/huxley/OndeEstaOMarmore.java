//Huxley problem 241
package br.ufal.ic.huxley;

public class OndeEstaOMarmore {
    public static String[] findMarble(int n, int q, int[] marbles, int[] queries) {
        int aux;
        for(int i = n-1; i >= 1; i--){
            for(int j = 0; j<i; j++){
                if(marbles[j] > marbles[j+1]){
                    aux = marbles[j];
                    marbles[j] = marbles[j+1];
                    marbles[j+1] = aux;
                }
            }
        }
        String[] result = new String[q];
        for(int i = 0; i < q; i++) {
            if(queries[i] > marbles[n-1] || queries[i] < marbles[0]) result[i] = queries[i] + " not found";
            else{
                int j;
                for(j = 0; j < n; j++){
                    if(queries[i] == marbles[j]){
                        result[i] = queries[i] + " found at " + (j+1);
                        break;
                    }
                }
                if(j == n) result[i] = queries[i] + " not found";
            }
        }

        return result;
    }
}
