package src.org.csystem.util.numeric.test;

import java.util.Random;
import java.util.Scanner;
import static src.org.csystem.util.array.ArrayUtil.*;

import src.org.csystem.util.numeric.NumberUtil;

public class GetDigitsTest {
	
	public static void run()
	{
		Scanner kb = new Scanner(System.in);
		Random r = new Random();
		
		System.out.print("Bir sayı giriniz:");
		int n = kb.nextInt();
		
		while(n-- > 0) {
			long val = r.nextLong();
			System.out.printf("%d -> ", val);
			
			
			print(NumberUtil.getDigits(val));	
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
		
	}
	
	public static void main(String [] args)
	{
		run();
	}

}
