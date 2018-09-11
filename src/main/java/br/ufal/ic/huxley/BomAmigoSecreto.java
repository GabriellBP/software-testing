//Huxley problem 671
package br.ufal.ic.huxley;

public class BomAmigoSecreto {
    public static long numberOfConfigurations(int peopleQtt) {
        long total = 1;
        peopleQtt--;
        for (; peopleQtt >= 3; peopleQtt--) {
            total *= peopleQtt;
            total %= 1000000007;
        }
        return total;
    }
}
