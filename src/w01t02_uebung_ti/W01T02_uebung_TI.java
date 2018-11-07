package w01t02_uebung_ti;

import java.util.Scanner;

public class W01T02_uebung_TI {

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

        if (min < 0) {
            min = 0;
        }
        if (max < 0) {
            max = 0;
        }

        System.out.println("All prime numbers between " + min + " and " + max + ":");
        int counter = 0;
        //1 ist per Definition keine Primzahl
        if (min > 1) {
            //iterate through hole number range
            for (int i = min; i <= max; i++) {

//                //do nothing for zero, continue in main for loop
//                if (i == 0) {
//                    continue;
//                }
//                //for one and two, print prime numbers and continue with main loop
//                if (i == 1 || i == 2) {
//                    counter++;
//                    System.out.println(counter + "." + " prime number: " + i);
//                    continue;
//                }

                //divide i by all numbers 2 ... i-1 and check for divisibility
                //without rest
                boolean isPrime = true;
                for (int j = 2; j < i; j++) {
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
        } else {
            System.out.println("Falsche Eingabe");
        }
    }
}
