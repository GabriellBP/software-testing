//Huxley problem 419
package br.ufal.ic.huxley;

import java.util.ArrayList;

public class TodosOsSubconjuntos {
    private static String print(int a[], int max) {
        StringBuilder str = new StringBuilder("{");
        for (int i = 0; i < max; i++) {
            if (a[i] == 1)
                str.append(" ").append(i);
        }
        str.append("}");
        return str.toString();
    }

    private static boolean isSolution(int a[], int max, int idx) {
        return max == idx;
    }

    private static void backtrack(int a[], int max, int idx, ArrayList subsets) {
        idx++;
        if (isSolution(a, max, idx)) {
            subsets.add(print(a, max));
        } else {
            a[idx] = 1;
            backtrack(a, max, idx, subsets);
            a[idx] = 0;
            backtrack(a, max, idx, subsets);
        }
    }

    private static void generateCandidates(int n, ArrayList subsets) {
        int[] a = new int[n];

        backtrack(a, n, 0, subsets);
    }

    public static ArrayList generateSubsets(int n) {
        ArrayList<String> subsets = new ArrayList();
        generateCandidates(n+1, subsets);
        return subsets;
    }
}
