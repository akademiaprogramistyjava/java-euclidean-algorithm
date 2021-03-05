package pl.szymonleyk;


import java.util.Scanner;

public class FractionTaskGenerator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        FractionGenerator fractionGenerator = new FractionGenerator();

        System.out.println("--------- Fraction Task Generator -----------");
        boolean isCorrect;
        do {
            System.out.print(fractionGenerator.getTask());
            String text = scanner.nextLine();
            String[] result = text.split("/");
            int actualNumerator = Integer.parseInt(result[0]);
            int actualDenumerator = Integer.parseInt(result[1]);
            Fraction fraction = new Fraction(actualNumerator, actualDenumerator);

            isCorrect = fractionGenerator.isCorrectSumOfFraction(fraction);
        } while (!isCorrect);

        System.out.println("OK!");


        scanner.close();
    }
}
