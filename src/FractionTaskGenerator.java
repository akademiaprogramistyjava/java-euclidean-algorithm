import java.util.Scanner;

public class FractionTaskGenerator {
    public static void main(String[] args) {
        Fraction first = new Fraction(1, 2);
        Fraction second = new Fraction(5, 9);

        System.out.print(first +" + "+second+" = ");

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        String[] result = text.split("/");
        int actualNumerator = Integer.parseInt(result[0]);
        int actualDenumerator = Integer.parseInt(result[1]);

        int expectedDenumerator = first.getDenumerator()* second.getDenumerator();
        int expectedFirstNumerator = expectedDenumerator/first.getDenumerator()*first.getNumerator();
        int expectedSecondNumerator = expectedDenumerator/second.getDenumerator()*second.getNumerator();
        int expectedNumerator = expectedFirstNumerator+expectedSecondNumerator;

        if(actualNumerator == expectedNumerator && actualDenumerator == expectedDenumerator){
            System.out.println("OK.");
        } else {
            System.out.println("Źle.");
        }
    }
}
