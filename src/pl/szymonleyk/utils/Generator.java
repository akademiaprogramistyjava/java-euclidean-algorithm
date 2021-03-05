package pl.szymonleyk.utils;

import pl.szymonleyk.Fraction;

import java.util.Random;

public class Generator {
    private static final int MIN = 1;
    private static final int MAX = 9;

    public static Fraction generateFration(){
        int numerator = randomInt();
        int denumerator = randomInt();

        return new Fraction(numerator, denumerator);
    }

    private static int randomInt() {
        Random random = new Random();
        return random.nextInt(MAX)+MIN;
    }

}
