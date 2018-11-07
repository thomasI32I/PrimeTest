package w01t02_uebung_ti;

import java.util.Scanner;

public class W01T02_uebung2_TI {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bitte geben sie eine ganze Zahl ein: ");
        int firstNumber = sc.nextInt();

        System.out.println("Bitte geben sie eine weitere ganze Zahl ein: ");
        int secondNumber = sc.nextInt();

        int min;
        int max;

        if (firstNumber < secondNumber) {
            min = firstNumber;
            max = secondNumber;
        } else {
            min = secondNumber;
            max = firstNumber;
        }
//
//        if (min < 0) {
//            min = 0;
//        }
//        if (max < 0) {
//            max = 0;
//        }

        System.out.println("All prime numbers between " + min + " and " + max + ":");
        int counter = 0;
        //iterate through hole number range
        for (int i = min; i <= max; i++) {

//            if (i == 0) {
//                continue;
//            }
//
//            if (i == 1 || i == 2) {
//                counter++;
//                System.out.println(counter + "." + " prime number: " + i);
//                continue;
//            }

            //divide i by all numbers 2 ... i-1
            boolean isPrime = true;
            for (int j = min+1; j < i; j++) {

                if (i == 0) {
                    continue;
                }

                if (i == 1 || i == 2) {
                    counter++;
                    System.out.println(counter + "." + " prime number: " + i);
                    continue;
                }

                if (j != 1 || j!= -1)
                //if this is hit, i is no prime number
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            } // for

            if (isPrime) {
                //print detected prime number and break loop
                counter++;
                System.out.println(counter + "." + " prime number: " + i);
            }
        } //for
    }
}
