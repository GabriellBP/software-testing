//Huxley problem 1021
package br.ufal.ic.huxley;

import java.util.Arrays;

public class SuperSales {
    private static int superSale(int n, int item, int p_max, int[][] memo, int[] w, int[] p) {
        if(item == n || p_max == 0)
            return 0;
        if(memo[item][p_max] != -1)
            return memo[item][p_max];
        if(w[item] > p_max)
            return superSale(n, item+1, p_max, memo, w, p);
        memo[item][p_max] = Math.max(p[item]+superSale(n, item+1, p_max-w[item], memo, w, p), superSale(n, item+1, p_max, memo, w, p));
        return memo[item][p_max];
    }

    private static int getMaxValue(int[] array) {
        int maxValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }

    public static int maxPurchase(int nObj, int[] p, int[] w, int nP, int[] g) {
        int maximum = getMaxValue(g);
        int memo[][] = new int[nObj+1][maximum+1];
        for (int i = 0; i < nObj+1; i++) {
            Arrays.fill(memo[i], -1);
        }
        int total = 0;
        for (int i : g) {
            total += superSale(nObj, 0, i, memo, w, p);
        }
        return total;
    }

}
