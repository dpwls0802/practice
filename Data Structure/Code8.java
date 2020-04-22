package lecture;

import java.util.Scanner;

//사용자로부터 n개의 정수를 입력받은 후 합과 최대값을 구해 출력하시오
public class Code8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] data = new int [n];
		
		for (int i=0; i<n; i++)
			data[i] = sc.nextInt();
		sc.close();
		
		int sum = 0;
		int max = data[0];
		
		for (int i=0; i<n; i++) {
			sum += data[i]; //sum = sum + data[i]
			if (data[i] > max)
				max = data[i];
		}
		System.out.println("The sum is " + sum);
		System.out.println("The max is " + max);
	}
}
