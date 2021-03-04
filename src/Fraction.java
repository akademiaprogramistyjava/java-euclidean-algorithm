public class Fraction {
    private int numerator;
    private int denumerator;

    public Fraction(int numerator, int denumerator) {
        this.numerator = numerator;
        this.denumerator = denumerator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenumerator() {
        return denumerator;
    }

    @Override
    public String toString() {
        return numerator+"/"+denumerator;
    }
}
