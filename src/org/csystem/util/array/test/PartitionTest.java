package org.csystem.util.array.test;

import org.csystem.util.array.ArrayUtil;

import java.util.Random;
import java.util.Scanner;

import static org.csystem.util.array.ArrayUtil.print;

public class PartitionTest {

    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        Random r = new Random();

        for (;;) {
            System.out.print("Dizinin eleman sayısını giriniz:");
            int cnt = Integer.parseInt(kb.nextLine());

            if (cnt <= 0)
                break;

            System.out.print("Eşik değerini giriniz:");
            int threshold = Integer.parseInt(kb.nextLine());


            int [] a = ArrayUtil.getRandomArray(r, cnt, 0, 100);
            System.out.println("-------------------------------------------------");
            ArrayUtil.print(2, a);
            int partitionPoint = ArrayUtil.partition(a, threshold);
            System.out.printf("Bölümleme noktası:%d%n", partitionPoint);
            ArrayUtil.print(2, a);
            System.out.println("-------------------------------------------------");
        }

        System.out.println("Tekrar yapıyor musunuz?");

    }

    public static void main(String [] args)
    {
        run();
    }

}
