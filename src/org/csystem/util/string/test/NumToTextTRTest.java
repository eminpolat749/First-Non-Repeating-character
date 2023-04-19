package org.csystem.util.string.test;

import java.util.Random;
import java.util.Scanner;

import static org.csystem.util.numeric.NumberUtil.numToTextTR;

public class NumToTextTRTest {

    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        Random r = new Random();

        System.out.print("Bir sayı giriniz:");
        long n = kb.nextLong();

        while(n-- > 0) {
            int val = r.nextInt(-100, 1000);

            System.out.printf("%d -> %s%n", val, numToTextTR(val));
        }
        System.out.println("Program sonu...");
    }

    public static void main(String [] args)
    {
        run();
    }

}
