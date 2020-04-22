package lecture;

import java.util.Scanner;

//n개 정수 입력받은 후 오름차순으로 정렬하라
public class Code14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] data = new int [n];
		
		for (int i = 0; i < n; i++)
			data[i] = sc.nextInt();
		sc.close();
		
		for (int i = n-1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (data[j] > data[j+1]) {
					int tmp = data[j];
					data[j] = data[j+1];
					data[j+1] = tmp;
				}
			}
		}
		for (int i = 0; i < n; i++)
			System.out.println(data[i]);
	}
}
