package org.csystem.util.string.test;

import org.csystem.util.array.ArrayUtil;
import org.csystem.util.string.StringUtil;

import java.util.Random;
import java.util.Scanner;

public class GetRandomTextsTestEN {

    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        Random r = new Random();

        System.out.print("Min:");
        int min = Integer.parseInt(kb.nextLine());
        System.out.print("Bound:");
        int bound = Integer.parseInt(kb.nextLine());

        for (;;) {
            System.out.print("Count:");
            int count = Integer.parseInt(kb.nextLine());

            if (count < 1)
                break;

            ArrayUtil.print(StringUtil.getRandomTextsEN(r, count, min, bound));

            int n = r.nextInt(min, bound);
            System.out.printf("n = %d%n", n);

            ArrayUtil.print(StringUtil.getRandomTextsEN(r, count, n));
        }

        System.out.println("Tekrar yapıyor musunuz?");
    }

    public static void main(String [] args)
    {
        run();
    }

}
