package FactorPrinter;

public class FactorPrinter {
    public static void printFactors ( int number ) {
        if (number < 1) System.out.println("Invalid Value");

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                if (i < number) {
                    System.out.print(i + " ");
                } else {
                    System.out.print(i);
                }
            }
        }
    }

    public static void main(String[] args) {
        printFactors(6);
        printFactors(32);
        printFactors(10);
        printFactors(-1);
    }
}
