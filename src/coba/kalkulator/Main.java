package coba.kalkulator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculating = true;
        double num = 0;

        while (continueCalculating) {
            String input;
            if (num == 0) {
      
                System.out.print("Masukkan angka beserta operatornya (cth: 2 + 3): ");
                input = scanner.nextLine();
            } else {
                System.out.print("Masukkan operator dan angkanya :" + num + " ");
                input = num + " " + scanner.nextLine();
            }

            double result = calculator.evaluateExpression(input);

            System.out.println("Hasil: " + result);
            System.out.print("Apakah ingin melanjutkan perhitungan(y/n)? ");
            String answer = scanner.nextLine();

            if (answer.equalsIgnoreCase("y")) {
                num = result;
            } else {
                continueCalculating = false;
            }
        }
        System.out.println("Program berakhir.");
    }
}