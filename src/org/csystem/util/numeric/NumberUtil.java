/*----------------------------------------------------------------
	FILE		: NumberUtil.java
	AUTHOR		: Java-Aug-2022 Group
	LAST UPDATE	: 26.02.2023

	Utility class for numeric operations

	Copyleft (c) 1993 C and System Programmers Association
	All Rights Free
----------------------------------------------------------------*/
package org.csystem.util.numeric;

import static java.lang.Math.abs;
import static java.lang.Math.log10;
import static java.lang.Math.pow;

public class NumberUtil {

	private static String [] onesTR = {"", "bir", "iki", "üç", "dört", "beş", "altı", "yedi", "sekiz", "dokuz"};
	private static String [] tensTR = {"", "on", "yirmi", "otuz", "kırk", "elli", "altmış", "yetmiş", "seksen", "doksan"};

	private static int [] getDigits(long val, int n)
	{
		int [] digits = new int[val == 0 ? 1 : (int)(log10((val = abs(val))) / n) + 1];
		int powOfTen = (int)pow(10, n);

		for (int i = digits.length - 1; i >= 0; digits[i] = (int)(val % powOfTen), val /= powOfTen, --i)
			;

		return digits;
	}

	
	
	public static int countDigits(long val)
	{			
		return (val != 0) ? ((int)log10(abs(val)) + 1) : 1;				
	}
	
	public static long factorial(int n)
	{
		long result = 1;
		
		for (int i = 2; i <= n; ++i)
			result *= i;		
		
		return result;
	}

	public static int getDigitsPowSum(int val)
	{
		int n = countDigits(val);
		int total = 0;

		while (val != 0) {
			total += pow(val % 10, n);
			val /= 10;
		}

		return total;
	}
	
	public static int [] getDigits(long val)
	{
		return getDigits(val, 1);
	}

	public static int [] getDigitsInTwos(long val)
	{
		return getDigits(val, 2);
	}

	public static int [] getDigitsInThrees(long val)
	{
		return getDigits(val, 3);
	}
	
	public static int getFibonacciNumber(int n)
	{
		if (n <= 2)
			return n - 1;
		
		int prev1 = 1, prev2 = 0, val = prev1 + prev2;
		
		for (int i = 3; i < n; ++i) {
			prev2 = prev1;
			prev1 = val;
			val = prev1 + prev2;
		}
		
		return val;		
	}
	
	public static int getNextFibonacciNumber(int val)
	{
		if (val < 0)
			return 0;
		
		int prev1 = 1, prev2 = 0, next;		
		
		for (;;) {
			next = prev1 + prev2;			
			
			if (next > val)
				return next;
			
			prev2 = prev1;
			prev1 = next;
		}
	}
	
	public static long getPrime(int n)
	{
		long val = 2;
		int count = 0;
		
		for (;;) {
			if (isPrime(val))
				++count;
			
			if (count == n)
				return val;
			
			++val;				
		}
	}
	
	public static boolean isArmstrong(int val)
	{
		return val >= 0 && getDigitsPowSum(val) == val;
	}
	
	public static boolean isEven(int val)
	{
		return val % 2 == 0;
	}
	
	public static boolean isOdd(int val)
	{
		return !isEven(val);
	}
	
	public static boolean isPrime(long val)
	{
		if (val <= 1)
			return false;
		
		if (val % 2 == 0)
			return val == 2;
		
		if (val % 3 == 0)
			return val == 3;
		
		if (val % 5 == 0)
			return val == 5;		

		if (val % 7 == 0)
			return val == 7;
		
		for (long i = 11; i * i <= val; i += 2)
			if (val % i == 0)
				return false;
		
		return true;
	}
	
	public static double max(double a, double b, double c)
	{
		return Math.max(Math.max(a, b), c);
	}
	
	public static int mid(int a, int b, int c)
	{
		if (a <= b && b <= c || c <= b && b <= a)
			return b;
		
		if (b <= a && a <= c || c <= a && a <= b)
			return a;
		
		return c;
	}
	
	public static double min(double a, double b, double c)
	{
		return Math.min(Math.min(a, b), c);
	}	
		
	public static int reverse(int val)
	{
		int result = 0;
		
		while (val != 0) {
			result = result * 10 + val % 10;
			val /= 10;
		}
		
		return result;
	}

	public static String numToTextTR(long val)
	{
		if (val == 0)
			return "sıfır";

		String text = val < 0 ? "eksi" : "";

		val = Math.abs(val);

		int a = (int)(val / 100);
		int b = (int)(val / 10 % 10);
		int c = (int)(val % 10);

		if (a != 0) {
			if (a != 1)
				text += onesTR[a];
			text += "yüz";
		}

		if (b != 0)
			text += tensTR[b];

		if (c != 0)
			text += onesTR[c];

		return text;
	}
		
	public static int sumDigits(int val)
	{
		int sum = 0;
		
		while (val != 0) {
			sum += val % 10;
			val /= 10;
		}
		
		return abs(sum);
	}
}