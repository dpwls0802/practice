package lecture;

import java.util.Scanner;

public class Code3 {
	public static void main(String[] args) {
		String str = "Hello";
		String input = null;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("please type a string : ");
		
		input = keyboard.next();
		
		//String은 primitive 타입이 아니므로 == 불가능하다!
		/*
		 * if (str == input) { System.out.println("Strings match!"); } else {
		 * System.out.println("Strings do not match!"); }
		 */
		if (str.equals(input)) {
			System.out.println("Strings match!");
		} else {
			System.out.println("Strings do not match!");
		}
		keyboard.close();
	}
}
