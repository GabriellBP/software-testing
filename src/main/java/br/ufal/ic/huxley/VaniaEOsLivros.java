//Huxley problem 561
package br.ufal.ic.huxley;

public class VaniaEOsLivros {
    public static long digitsNumber(long n) {
        long aux;
        long value = 0;
        while(n > 0){
            if(n<=9){
                value += n;
                n-=9;
            }
            else if(n<100){
                aux=n-9;
                n-=aux;
                value+=((aux)*2);
            }
            else if(n<1000){
                aux=n-99;
                n-=aux;
                value+=((aux)*3);
            }else if(n<10000){
                aux=n-999;
                n-=aux;
                value+=((aux)*4);
            }else if(n<100000L){
                aux=n-9999L;
                n-=aux;
                value+=((aux)*5);
            }else if(n<1000000L){
                aux=n-99999L;
                n-=aux;
                value+=((aux)*6);
            }else if(n<10000000L){
                aux=n-999999L;
                n-=aux;
                value+=((aux)*7);
            }else if(n<100000000L){
                aux=n-9999999L;
                n-=aux;
                value+=((aux)*8);
            }else if(n<1000000000L){
                aux=n-99999999L;
                n-=aux;
                value+=((aux)*9);
            }else if(n<10000000000L){
                aux=n-999999999L;
                n-=aux;
                value+=((aux)*10);
            }
        }
        return value;
    }
}
