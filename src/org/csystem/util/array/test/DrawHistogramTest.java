package org.csystem.util.array.test;

import org.csystem.util.array.ArrayUtil;

import java.util.Random;
import java.util.Scanner;

public class DrawHistogramTest {

    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        Random r = new Random();

        for (;;) {
            System.out.print("Dizinin eleman sayısını giriniz:");
            int cnt = Integer.parseInt(kb.nextLine());

            if (cnt <= 0)
                break;

            int [] a = ArrayUtil.getRandomArray(r, cnt, 0, 101);
            System.out.println("-------------------------------------------------");
            ArrayUtil.print(a);
            int [] data = ArrayUtil.getHistogramData(a, 100);
            ArrayUtil.print(data);
            System.out.println("Histogram:");
            ArrayUtil.drawHistogram(data, 10, 'X');

            System.out.println("-------------------------------------------------");
        }

        System.out.println("Tekrar yapıyor musunuz?");

    }

    public static void main(String [] args)
    {
        run();
    }

}
