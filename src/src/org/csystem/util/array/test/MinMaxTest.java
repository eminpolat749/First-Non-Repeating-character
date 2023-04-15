package src.org.csystem.util.array.test;

import static src.org.csystem.util.array.ArrayUtil.getRandomArray;
import static src.org.csystem.util.array.ArrayUtil.print;
import static src.org.csystem.util.array.ArrayUtil.*;

import java.util.Random;
import java.util.Scanner;

public class MinMaxTest {
	
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
			
			int [] a = getRandomArray(r, cnt, min, bound);
			
			print(a);
			System.out.printf("Min : %d%n", min(a));
			System.out.printf("Max : %d%n", max(a));
			
		}
		System.out.println("Tekrar yapıyor musunuz?");
		
	}
	
	public static void main(String [] args)
	{
		run();
	}

}
