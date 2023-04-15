package src.org.csystem.util.array.test;

import static src.org.csystem.util.array.ArrayUtil.getRandomArray;
import static src.org.csystem.util.array.ArrayUtil.print;
import static src.org.csystem.util.array.ArrayUtil.sum;
import static src.org.csystem.util.array.ArrayUtil.join;

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
			
			int [] a = getRandomArray(r, cnt1, 0, 100);
			int [] b = getRandomArray(r, cnt2, 0, 100);
			
			print(2, a);
			print(2, b);
			
			print(2, join(a, b));
			
		}
		System.out.println("Tekrar yapıyor musunuz?");
		
	}
	
	public static void main(String [] args)
	{
		run();
	}

}
