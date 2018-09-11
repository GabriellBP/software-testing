//Huxley problem 602
package br.ufal.ic.huxley;

import java.util.Arrays;

public class AdegaDeVinhos {
    private static int maxValue(int a, int b, int year, int[] prices, int[][] memo) {
        if(memo[a][b] != -1)
            return memo[a][b];
        if(a == b)
            return prices[a]*year;
        memo[a][b] = Math.max(prices[a]*year + maxValue(a+1, b, year+1, prices, memo), prices[b]*year + maxValue(a, b-1, year+1, prices, memo));
        return memo[a][b];
    }

    public static int maxSale(int qttBottles, int[] prices) {
        int memo[][] = new int[qttBottles+1][qttBottles+1];
        for (int i = 0; i < qttBottles+1; i++) {
            Arrays.fill(memo[i], -1);
        }
        return maxValue(0, qttBottles-1, 1, prices, memo);
    }

}