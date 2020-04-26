package practice.숫자;

import java.util.Scanner;

public class 합과최댓값 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int data[] = new int [n];
		
		for (int i = 0; i < n; i++)
			data[i] = sc.nextInt();
		sc.close();
		
		int sum = 0;
		int max = data[0];
		
		for (int i = 0; i < n; i++) {
			//data[i] += sum;
			sum += data[i];
			
			if (data[i] > max)
				max = data[i];
		}
		System.out.println("sum is " + sum);
		System.out.println("max is " + max);
			
	}

}
