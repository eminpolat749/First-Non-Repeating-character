package src.org.csystem.app;


import src.org.csystem.util.string.StringUtil;

import java.util.Scanner;
import java.util.Random;

class App {
	public static void main(String [] args)
	{
		FirstNonRepeatingCharacterTest.run();
	}
}

class FirstNonRepeatingCharacterTest {
	public static void run()
	{
		Scanner kb = new Scanner(System.in);
		FirstNonRepeatingCharacterRandomTest.run(kb);
		FirstNonRepeatingCharacterInputTest.run(kb);
		System.out.println("Program Sonu...");
	}

}

class FirstNonRepeatingCharacterRandomTest {
	public static void run(Scanner kb)
	{
		Random r = new Random();

		System.out.print("Input a number:");
		int count = Integer.parseInt(kb.nextLine());

		while (count-- > 0) {
			System.out.println("-----------------------------");
			String s = StringUtil.getRandomTextEN(r, r.nextInt(10, 20)).toLowerCase();
			System.out.println(s);
			char ch = Util.firstNonRepeatingCharacter(s);
			System.out.printf("%s%n", ch == '_' ? "No \"non-repeating\" character" : "First non-repeating character is:" + ch);

			System.out.println("-----------------------------");
		}
	}
}

class FirstNonRepeatingCharacterInputTest {
	public static void run(Scanner kb)
	{
		for (;;) {
			System.out.print("Input a text:");
			String s = kb.nextLine();

			if ("quit".equals(s))
				break;

			char ch = Util.firstNonRepeatingCharacter(s);
			System.out.printf("%s%n", ch == '_' ? "No \"non-repeating\" character" : "First non-repeating character is:" + ch);

		}

	}
}

class Util {

	public static char firstNonRepeatingCharacter(String s)
	{
		int [] counts = new int[26];
		int len = s.length();

		for (int i = 0; i < len; ++i)
			++counts[s.charAt(i) - 'a'];

		for (int i = 0; i < len; ++i) {
			char ch = s.charAt(i);

			if (counts[ch - 'a'] == 1)
				return ch;
		}

		return '_';
	}
}



