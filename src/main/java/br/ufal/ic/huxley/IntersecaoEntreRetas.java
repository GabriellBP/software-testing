//Huxley problem 623
package br.ufal.ic.huxley;

public class IntersecaoEntreRetas {
    public static String calculatingIntersection(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        if (x2 == x1 && x3 == x4) {
            return "NUNCA";
        }
        double m1, k1, m2, k2, x = 0, y = 0;
        if(x2 == x1 || x3 == x4){
            if(x2 == x1){
                x = x1;
                m2 = (y4-y3)/(x4-x3);
                k2 = y3-(m2*x3);
                y = m2*x + k2;
            }else if(x3 == x4){
                x = x3;
                m1 = (y2-y1)/(x2-x1);
                k1 = y1-(m1*x1);
                y = y = (m1*x) + k1;
            }
            return String.format("%.2f %.2f", x, y);
        } else {
            m1 = (y2-y1)/(x2-x1);
            k1 = y1-(m1*x1);
            m2 = (y4-y3)/(x4-x3);
            k2 = y3-(m2*x3);

            if(m1==m2) return "NUNCA\n";
            else{
                x = (k2-k1)/(m1-m2);
                y = (m1*x) + k1;
                return String.format("%.2f %.2f", x, y);
            }
        }
    }
}
