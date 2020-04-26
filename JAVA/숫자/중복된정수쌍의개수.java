package practice.숫자;

import java.util.Scanner;

public class 중복된정수쌍의개수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int data[] = new int [n];
		
		for (int i = 0; i < n; i++)
			data[i] = sc.nextInt();
		sc.close();
		
		int count = 0;
		for (int i = 0; i < n-1; i++) {
			for (int j = i+1; j < n; j++) {
				if (data[i] == data[j])
					count++;
			}
		}
		System.out.println(count);
	}

}
