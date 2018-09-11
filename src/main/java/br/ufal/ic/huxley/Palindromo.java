//Huxley problem 1022
package br.ufal.ic.huxley;

import java.util.Arrays;

public class Palindromo {
    private static int palindrome(char[] word, int begin, int end, int[][] memo) {
        if(begin == end)
            return 1;
        if(begin > end)
            return 0;
        if(memo[begin][end] != -1)
            return memo[begin][end];
        int a = -1;
        int b;
        int c;
        if(word[begin] == word[end])
            a = palindrome(word, begin+1, end-1, memo) + 2;
        b = palindrome(word, begin, end-1, memo);
        c = palindrome(word, begin+1, end, memo);
        int aux = Math.max(a, b);
        memo[begin][end] = Math.max(aux, c);
        return memo[begin][end];
    }

    public static int greaterPalindrome(String word) {
        int wordSize = word.length();
        int memo[][] = new int[wordSize+1][wordSize+1];
        for (int i = 0; i < wordSize+1; i++) {
            Arrays.fill(memo[i], -1);
        }

        return palindrome(word.toCharArray(), 0, wordSize - 1, memo);
    }
}
