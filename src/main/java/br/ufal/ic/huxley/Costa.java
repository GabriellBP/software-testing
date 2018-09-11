//Huxley problem 213
package br.ufal.ic.huxley;

public class Costa {
    public static int nlogoniaCoast(int m, int n, char noglonia[][]) {
        int qtt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(noglonia[i][j] == '#'){
                    if(j+1 == m || i+1 == n || j-1 < 0 || i-1 <0)
                        qtt++;
                    else if(noglonia[i][j+1] == '.' || noglonia[i+1][j] == '.' || noglonia[i][j-1] == '.' || noglonia[i-1][j] == '.')
                        qtt++;
                }
            }
        }
        return qtt;
    }
}
