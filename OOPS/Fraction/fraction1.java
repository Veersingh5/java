package OOPS.Fraction;
public class fraction1 {
    private int numerator;
    private int denominator;

    public fraction1(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }
    public void simplify() {
        int gcd = 1;
        int smaller = Math.min(numerator, denominator);
        for(int i=2; i<=smaller; i++) {
            if(numerator%i == 0 && denominator%i == 0) {
                gcd = i;
            }
        }
        numerator = numerator/gcd;
        denominator = denominator/gcd;
    }
    public void print() {
        System.out.println(numerator + "/" + denominator);
    }
    public void add(fraction1 F2) {
        this.numerator = this.numerator * F2.denominator + this.denominator * F2.numerator;
        this.denominator = this.denominator * F2.denominator;
        simplify();
    }
    public static fraction1 add(fraction1 f1, fraction1 f2) {
        return null;
    }
    
}
