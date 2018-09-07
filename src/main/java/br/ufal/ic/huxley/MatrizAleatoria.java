//Huxley problem 781
package br.ufal.ic.huxley;

public class MatrizAleatoria {
    public static String generateMatrix(int l, int c) {
        int matrix[][] = new int[l][c];
        for (int count = 1, signal = 1, i = 0, j = 0, limS = 0, limI = l-1, limE = 0, limD = c-1; count <= l*c; count++) {
            if (signal == 1) {
                matrix[i][j] = count;
                i++;
                if (i > limI) {
                    signal = 2;
                    i = limI;
                    limE++;
                    j = limD;
                }
            } else if (signal == 2) {
                matrix[i][j] = count;
                i--;
                if(i<limS){
                    signal = 3;
                    i = limI;
                    limD--;
                    j = limE;
                }
            } else if (signal == 3) {
                matrix[i][j] = count;
                j++;
                if(j>limD){
                    signal = 4;
                    i = limS;
                    limI--;
                    j = limE;
                }
            } else if (signal == 4) {
                matrix[i][j] = count;
                j++;
                if(j>limD){
                    signal = 1;
                    i = limS+1;
                    limS++;
                    j = limE;
                }
            }
        }
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                out.append(String.format("%03d", matrix[i][j]));
                if (j < c-1) out.append(" ");
                else if (j == c-1) out.append("\n");
            }
        }
        return out.toString();
    }
}
