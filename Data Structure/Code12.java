package lecture;

import java.util.Scanner;

//n개 정수 입력받아 배열에 저장, 이들 중 0개 이상의 연속된 정수들을 더하여 얻을 수 있는 최대값 구하라
public class Code12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] data = new int [n];
		
		for (int i = 0; i < n; i++)
			data[i] = sc.nextInt();
		sc.close();
		
		int max = 0;
		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int j = i; j < n; j++) {
				sum += data[j];
				if (sum > max)
					max = sum;
			}
		}
		System.out.println("The maxsum is : " + max);
	}
}
