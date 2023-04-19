package org.csystem.util.array.test;

import org.csystem.util.array.ArrayUtil;

import static org.csystem.util.array.ArrayUtil.bubbleSort;
import static org.csystem.util.array.ArrayUtil.getRandomArray;
import static org.csystem.util.array.ArrayUtil.print;

import java.util.Random;
import java.util.Scanner;

public class SelectionSortTest {
	
	public static void run()
	{
		Scanner kb = new Scanner(System.in);
		Random r = new Random();
		
		for (;;) {
			System.out.print("Dizinin eleman sayısını giriniz:");
			int cnt = Integer.parseInt(kb.nextLine());
			
			if (cnt <= 0)
				break;
			
			int [] a = ArrayUtil.getRandomArray(r, cnt, 0, 100);
			ArrayUtil.print(2, a);
			boolean desc = r.nextBoolean();
			
			ArrayUtil.selectionSort(a, desc);
			
			System.out.printf("%s sıralanmış dizi:%n", desc ? "Büyükten küçüğe" : "Küçükten büyüğe");
			
			
			ArrayUtil.print(2, a);
			
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
		
	}
	
	public static void main(String [] args)
	{
		run();
	}


}
