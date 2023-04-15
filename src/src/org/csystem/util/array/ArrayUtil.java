package src.org.csystem.util.array;

import java.util.Random;

public class ArrayUtil {
	
	private static void bubbleSortAscending(int [] a)
	{
		for (int i = 0; i < a.length - 1; ++i)
			for (int k = 0; k < a.length - 1 - i; ++k)
				if (a[k + 1] < a[k])
					swap(a, k + 1, k);
		
	}
	
	private static void bubbleSortDescending(int [] a)
	{
		for (int i = 0; i < a.length - 1; ++i)
			for (int k = 0; k < a.length - 1 - i; ++k)
				if (a[k] < a[k + 1])
					swap(a, k + 1, k);
		
	}
	
	private static void selectionSortAscending(int [] a)
	{
		int min, minIdx;
		
		for (int i = 0; i < a.length - 1; ++i) {
			min = a[i];
			minIdx = i;
			
			for (int k = i + 1; k < a.length; ++k)
				if (a[k] < min) {
					min = a[k];
					minIdx = k;
				}
			swap(a, minIdx, i);
		}
	}
	
	private static void selectionSortDescending(int [] a)
	{
		int max, maxIdx;
		
		for (int i = 0; i < a.length - 1; ++i) {
			max = a[i];
			maxIdx = i;
			
			for (int k = i + 1; k < a.length; ++k)
				if (a[k] > max) {
					max = a[k];
					maxIdx = k;
				}
			swap(a, maxIdx, i);
		}
		
	}
	
	public static void selectionSort(int [] a)
	{
		selectionSort(a, false);
	}
	
	public static void selectionSort(int [] a, boolean desc)
	{
		if (desc)
			selectionSortDescending(a);
		else
			selectionSortAscending(a);
		
	}
	
	public static void bubbleSort(int [] a)
	{
		bubbleSort(a, false);
	}
	
	public static void bubbleSort(int [] a, boolean descending)
	{
		if (descending)
			bubbleSortDescending(a);
		else
			bubbleSortAscending(a);
	}
	
	public static void fillRandomArray(Random r, int [] a, int min, int bound)
	{
		for (int i = 0; i < a.length; ++i)
			a[i] = r.nextInt(min, bound);
	}
	
	public static void fillRandomArray(Random r, double [] a, double min, double bound)
	{
		for (int i = 0; i < a.length; ++i)
			a[i] = r.nextDouble(min, bound);
	}
	
	public static int [] getRandomArray(Random r, int cnt, int min, int bound)
	{
		int [] a = new int[cnt];
		
		fillRandomArray(r, a, min, bound);
		
		return a;
	}
	
	public static double [] getRandomArray(Random r, int cnt, double min, double bound)
	{
		double [] a = new double[cnt];
		
		fillRandomArray(r, a, min, bound);
		
		return a;
	}
	
	public static int [] join(int [] a, int [] b)
	{
		int [] arr = new int[a.length + b.length];
		int idx = 0;
		
		for (int i = 0; i < a.length; ++i)
			arr[idx++] = a[i];
		
		for (int i = 0; i < b.length; ++i)
			arr[idx++] = b[i];
		
		
		return arr;
	}
	
	public static int max(int [] a)
	{
		int result = a[0];
		
		for (int i = 1; i < a.length; ++i)
			if (a[i] > result)
				result = a[i];
		
		
		return result;
	}
	
	public static int min(int [] a)
	{
		int result = a[0];
		
		for (int i = 1; i < a.length; ++i)
			if (a[i] < result)
				result = a[i];
		
		
		return result;
	}
	
	public static void print(int [] a)
	{
		print(1, a);
	}
	
	public static void print(int n, int [] a)
	{
		String fmt = String.format("%%0%dd ", n);
		
		for (int i = 0; i < a.length; ++i)
			System.out.printf(fmt, a[i]);
		
		System.out.println();
		
	}
	
	public static void print(double [] a)
	{
		for (int i = 0; i < a.length; ++i)
			System.out.printf("%f ", a[i]);
		
		System.out.println();
		
	}
	
	public static void reverse(int [] a)
	{
		for (int i = 0; i < a.length / 2; ++i)
			swap(a, i, a.length - 1 - i);
		
	}
	
	public static void swap(int [] a, int i, int k)
	{
		int temp = a[i];
		a[i] = a[k];
		a[k] = temp;
		
	}
	
	public static void swap(double [] a, int i, int k)
	{
		double temp = a[i];
		a[i] = a[k];
		a[k] = temp;
		
	}
	
	public static int sum(int [] a)
	{
		int result = 0;
		for (int i = 0; i < a.length; ++i)
			result += a[i];
		
		return result;
	}
	

}
