package src.org.csystem.util.array.test;

import static src.org.csystem.util.array.ArrayUtil.bubbleSort;
import static src.org.csystem.util.array.ArrayUtil.getRandomArray;
import static src.org.csystem.util.array.ArrayUtil.print;
import static src.org.csystem.util.array.ArrayUtil.*;

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
			
			int [] a = getRandomArray(r, cnt, 0, 100);
			print(2, a);
			boolean desc = r.nextBoolean();
			
			selectionSort(a, desc);
			
			System.out.printf("%s sıralanmış dizi:%n", desc ? "Büyükten küçüğe" : "Küçükten büyüğe");
			
			
			print(2, a);
			
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
		
	}
	
	public static void main(String [] args)
	{
		run();
	}


}
