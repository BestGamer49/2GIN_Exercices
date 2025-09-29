
/**
 *
 * @author SchYv136
 */
public class Fraction {

    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;

    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    //shortcut: alt+Insert
    public void setNumerator(int pNumerator) {
        numerator = pNumerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public String toString() {
        String text = "";
        if (numerator % denominator == 0) {
            text = numerator / denominator + "";
        } else {
            text = numerator + "/" + denominator;
        }
        return text;
    }

    public double getDecimal() {
        return (double) numerator / denominator;
    }

    public boolean isNegative() {
        boolean result = false;
        if (numerator > 0 && denominator > 0) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public int gcd() {
        int a = numerator;
        int b = denominator;
        int result = 1;

        a = Math.abs(a);
        b = Math.abs(b);

        for (int d = 1; d <= a; d++) {
            if ((a % d == 0) && (b % d == 0)) {
                result = d;
            }
        }
        return result;
    }

    public int lcm() {
        int a = numerator;
        int b = denominator;
        int ppcm;
        ppcm = Math.abs(a * b) / gcd();
        return ppcm;
    }

    public String reduce() {
        int a = numerator / gcd();
        int b = denominator / gcd();
        return a + "/" + b;
    }

    public String reciprocal() {
        int a = numerator;
        int b = denominator;
        int temp;
        temp = a;
        a = b;
        b = temp;
        return a + "/" + b;
    }

    public String add(Fraction pFraction) {
        int a;
        int b;
        String text = "";
        int multiplier;
        if (pFraction.denominator > denominator) {
            multiplier = pFraction.denominator / denominator;
            denominator *= multiplier;
            numerator *= multiplier;

        } else {
            multiplier = denominator / pFraction.denominator;
            pFraction.denominator *= multiplier;
            pFraction.numerator *= multiplier;

        }

        a = numerator + pFraction.numerator;
        b = denominator;

        text = a + "/" + b;
        return text;
    }

    public String subtract(Fraction pFraction) {
        int a;
        int b;
        String text = "";
        int multiplier;
        if (pFraction.denominator > denominator) {
            multiplier = pFraction.denominator / denominator;
            denominator *= multiplier;
            numerator *= multiplier;

        } else {
            multiplier = denominator / pFraction.denominator;
            pFraction.denominator *= multiplier;
            pFraction.numerator *= multiplier;

        }

        /*   if (pFraction.numerator > numerator){
              a=pFraction.numerator-numerator;
        }else {
          a=numerator-pFraction.numerator;
          }*/
        a = numerator - pFraction.numerator;
        b = denominator;
        text = a + "/" + b;
        return text;
    }

    public String multiply(Fraction pFraction) {
        int a = numerator * pFraction.numerator;
        int b = denominator * pFraction.denominator;
        String text = "";
        text = a + "/" + b;
        return text;

    }

    public String divide(Fraction pFraction) {
        int a = numerator / pFraction.numerator;
        int b = denominator / pFraction.denominator;
        String text = "";
        text = a + "/" + b;
        return text;

    }

    public Fraction(double pDecimal) {
        String minus = "";
        if (pDecimal <= 0) {
            minus = "-";
        pDecimal = Math.abs(pDecimal);
        }
        
        double a = pDecimal;
        int newA;
        int b = 1;

        while (a != Math.floor(a)) {
            a = a * 10;
            b = b * 10;
        }
        newA = (int) a;

        newA = Math.abs(newA);
        b = Math.abs(b);
        int result = 1;
        for (int d = 1; d <= a; d++) {
            if ((newA % d == 0) && (b % d == 0)) {
                result = d;
            }
        }
        newA /= result;
        b /= result;
        System.out.println( minus + newA + "/" + b);
    }

}
