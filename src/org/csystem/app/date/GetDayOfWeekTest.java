package org.csystem.app.date;

class GetDayOfWeekTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			System.out.print("Gün ay ve yıl bilgilerini giriniz:");
			int day = kb.nextInt();
			int month = kb.nextInt();
			int year = kb.nextInt();
			
			if (day == 0)
				break;
			
			DateUtil.printDateTR(day, month, year);
			DateUtil.printDateEN(day, month, year);
		}
		
		System.out.println("Tekrar yapıyor munuz?");
	}
	public static void main(String [] args)
	{
		run();
	}
}