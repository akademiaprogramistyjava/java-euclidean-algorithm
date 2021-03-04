package pl.szymonleyk;

import pl.szymonleyk.utils.Generator;

public class FractionGenerator {
    private Fraction first;
    private Fraction second;

    public FractionGenerator(){
        first = Generator.generateFration();
        second = Generator.generateFration();
    }

    /*

    1/2 +  4/8 =
    1/2 +   1/2


     */
    public boolean isCorrectSumOfFraction(Fraction actual){
        int expectedDenumerator = gcd(first.getDenumerator(),second.getDenumerator());
        int expectedFirstNumerator = first.getNumerator()/(first.getDenumerator()/expectedDenumerator);
        int expectedSecondNumerator = second.getNumerator()/(second.getDenumerator()/expectedDenumerator);
        int expectedNumerator = expectedFirstNumerator+expectedSecondNumerator;

        System.out.println(expectedNumerator+"/"+expectedDenumerator);

        return actual.getNumerator() == expectedNumerator && actual.getDenumerator() == expectedDenumerator;
    }

    public String getTask(){
        return first +" + "+second+" = ";
    }

    private int gcd(int a, int b){
        while(a != b){
            if(a < b){
                b-=a;
            } else {
                a-=b;
            }
        }
        return a;
    }
}
