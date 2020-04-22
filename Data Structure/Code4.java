package lecture;

import java.util.Scanner;

public class Code4 {
	public static void main(String[] args) {
		String name = null;
		int age;
		String gender;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("please type your name, age, gender : ");
		
		name = keyboard.next();
		age = keyboard.nextInt();
		gender = keyboard.next();
		
		//String은 primitive 타입이 아니므로 == 불가능하다!
		/*
		 * if (str == input) { System.out.println("Strings match!"); } else {
		 * System.out.println("Strings do not match!"); }
		 */
		if (gender.equals("male")) {
			System.out.println(name + ", you're " + age + " years old man");
		} else if (gender.equals("female")){
			System.out.println(name + ", you're " + age + " years old woman");
		} else {
			System.out.println("hmm...interesting");
		}
		keyboard.close();
	}
}
