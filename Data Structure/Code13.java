package lecture;

import java.util.Scanner;

//n개의 음이 아닌 한 자리 정수 입력받아 배열에 저장, 1개 이상의  연속된 정수들을 합해 얻을 수 있는 소수들 중에서 최대값 구하라
public class Code13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] data = new int [n];
		
		for (int i = 0; i < n; i++)
			data[i] = sc.nextInt();
		sc.close();
		
		int maxPrime = 0;
		for (int i = 0; i <n; i++) {
			for (int j = i; j < n; j++) {
				//하나의 정수로 환산
				int val = 0;
				for (int k = i; k<= j; k++)
					val = val * 10 + data[k]; 
				
				//소수인지 아닌지 판단
				boolean isPrime = true; 
				for (int p = 2; p < val/2 && isPrime; p++) {
					if (val % p == 0)
						isPrime = false;
				}
				//소수라면 최대값인지 비교
				if (isPrime && val > 1 && val > maxPrime) 
					maxPrime = val;
			}
		}
		if (maxPrime > 0)
			System.out.println("The max prime number is : " + maxPrime);
		else
			System.out.println("No prime number exists");
	}
}
