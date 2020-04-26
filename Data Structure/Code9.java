package lecture;

import java.util.Scanner;

//n개 정수 입력받아 순서대로 배열에 저장 후 모든 정수들을 한 칸씩 오른쪽으로 이동,
//맨 마지막은 맨 처음으로 이동
public class Code9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] data = new int [n];
		
		for (int i=0; i<n; i++)
			data[i] = sc.nextInt();
		sc.close();
		
		int tmp = data[n-1];
		for (int i = n-2; i>=0; i--) {
			data[i+1] = data[i];
		}
		data[0] = tmp;
		
		for (int i = 0; i<n; i++)
			System.out.println(data[i]);
	}
}
