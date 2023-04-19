package org.csystem.util.array.test;

import org.csystem.util.array.ArrayUtil;

import static org.csystem.util.array.ArrayUtil.getRandomArray;
import static org.csystem.util.array.ArrayUtil.print;

import java.util.Random;
import java.util.Scanner;

public class JoinArraysTest {
	
	public static void run()
	{
		Scanner kb = new Scanner(System.in);
		Random r = new Random();
		
		
		for (;;) {
			System.out.print("Dizilerin eleman sayılarını giriniz:");
			int cnt1 = kb.nextInt();
			int cnt2 = kb.nextInt();
			
			if (cnt1 <= 0 && cnt2 <= 0)
				break;
			
			int [] a = ArrayUtil.getRandomArray(r, cnt1, 0, 100);
			int [] b = ArrayUtil.getRandomArray(r, cnt2, 0, 100);
			
			ArrayUtil.print(2, a);
			ArrayUtil.print(2, b);
			
			ArrayUtil.print(2, ArrayUtil.join(a, b));
			
		}
		System.out.println("Tekrar yapıyor musunuz?");
		
	}
	
	public static void main(String [] args)
	{
		run();
	}

}
