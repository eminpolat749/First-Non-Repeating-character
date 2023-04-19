package org.csystem.util.numeric.test;

import org.csystem.util.array.ArrayUtil;
import org.csystem.util.numeric.NumberUtil;

import java.util.Random;
import java.util.Scanner;

import static org.csystem.util.array.ArrayUtil.print;

public class GetDigitsInThreesTest {

    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        Random r = new Random();

        System.out.print("Bir sayı giriniz:");
        long n = kb.nextLong();

        while(n-- > 0) {
            long val = r.nextLong();
            System.out.printf("%d -> ", val);


            ArrayUtil.print(NumberUtil.getDigitsInThrees(val));
        }

        System.out.println("Tekrar yapıyor musunuz?");

    }

    public static void main(String [] args)
    {
        run();
    }

}
