package org.csystem.util.array.test;

import org.csystem.util.array.ArrayUtil;

import java.util.Random;
import java.util.Scanner;

public class SumTest {
	public static void run()
	{
		Scanner kb = new Scanner(System.in);
		Random r = new Random();
		
		System.out.print("Sınır değerleri giriniz:");
		int min = kb.nextInt();
		int bound = kb.nextInt();
		
		for (;;) {
			System.out.print("Dizinin eleman sayısını giriniz:");
			int cnt = kb.nextInt();
			
			if (cnt <= 0)
				break;
			
			int [] a = ArrayUtil.getRandomArray(r, cnt, min, bound);
			
			ArrayUtil.print(a);
			System.out.printf("Toplam : %d%n", ArrayUtil.sum(a));
			
			
		}
		System.out.println("Tekrar yapıyor musunuz?");
		
	}
	
	public static void main(String [] args)
	{
		run();
	}

}
