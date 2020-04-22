package lecture;

import java.util.Scanner;

//n개 정수 입력받은 후, 정수가 하나씩 입력될 때 마다 현재까지 입력된 정수들을 오름차군으로 정렬하라
public class Code15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] data = new int [n];
		
		for (int i = 0; i < n; i++) {
			int tmp = sc.nextInt();
			
			int j = i - 1;
			while (j>=0 && data[j] > tmp) {
				data[j+1] = data[j];
				j--;
			}
			data[j+1] = tmp;
			
			for (int k = 0; k <= i; k++) {
				System.out.print(data[k] + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
