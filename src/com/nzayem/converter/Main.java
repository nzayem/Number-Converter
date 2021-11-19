package com.nzayem.converter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter number in decimal system: ");

        Scanner scanner = new Scanner(System.in);

        int decimalNumber = scanner.nextInt();

        System.out.println("Enter target base: ");

        int base = scanner.nextInt();

        scanner.close();

        System.out.printf("Conversion result: %s", convertNumber(decimalNumber, base));

    }

    // Solution not using any built-in methods

    public static StringBuilder convertNumber(int number, int base) {

        StringBuilder converted = new StringBuilder();

        int divRem;

        if (base == 16) {

            String[] arrHex = "0123456789ABCDEF".split("");

            while (number > 0) {

                divRem = number % base;

                number = number / base;

                converted.append(arrHex[divRem]);

            }

        } else {

            while (number > 0) {

                divRem = number % base;

                number = number / base;

                converted.append(divRem);

            }
        }
        return converted.reverse();
    }

}
