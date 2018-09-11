//Huxley problem 874
package br.ufal.ic.huxley;

import java.util.Arrays;

public class CorteDeHastes {
    private static int dp(int n, int[] values, int[] memo) {
        int value, maximum;
        for (int i = 1; i < n+1; i++) {
            maximum = -1;
            for (int j = 0; j < i; j++) {
                value = values[j] + memo[i - j - 1];
                if (value > maximum)
                    maximum = value;
            }
            memo[i] = maximum;
        }
        return memo[n];
    }

    public static int bestSale(int n, int[] values) {
        int memo[] = new int[n+1];
        Arrays.fill(memo, -1);
        memo[0] = 0;

        return dp(n, values, memo);
    }
}
