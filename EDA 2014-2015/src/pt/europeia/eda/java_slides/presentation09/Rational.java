package pt.europeia.eda.java_slides.presentation09;

// A value class:
public class Rational {

    private final int numerator;
    private final int denominator;

    public Rational(final int numerator, final int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    private int getDenominator() {
        return denominator;
    }

    private int getNumerator() {
        return numerator;
    }

    public Rational multipliedBy(final Rational rational) {
        return new Rational(getNumerator() * rational.getNumerator(), getDenominator()
                * rational.getDenominator());
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    // …

}