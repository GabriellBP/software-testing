package br.ufal.ic.junittesting;

public class Calculadora {

    public static boolean isPrime(int number) {

        if ((number <= 1) || (number != 2 && number % 2 == 0)) {
            return false;
        }

        for (int check = 3; check <= Math.sqrt(number); check++) {

            if (number % check == 0) {
                return false;
            }
        }
        return true;
    }
}
