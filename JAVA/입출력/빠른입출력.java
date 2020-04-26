package practice.입출력;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 빠른입출력 {
 
	public static void main(String[] args) throws IOException {
		//BufferedReader(입력)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine(); //입력(리턴값이 string으로 고정되므로 다른 타입 입력 받으려면 형변환 필수)
		int i = Integer.parseInt(br.readLine());
		
		//읽은 데이터 가공
		//1. nextToken()함수 사용해 입력받은 값을 공백 단위로 구분해 순서대로 호출
		StringTokenizer st = new StringTokenizer(s);
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		//2. split()함수 사용해 배열에 공백 단위로 끊어서 데이터 넣고 사용
		String array[] = s.split(" ");
		
		
		//BufferedWriter(출력)
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String ss = "abcdefg";
		bw.write(ss+"\n"); //출력(자동개행 기능 없으므로 \n으로 따로 처리)
		bw.flush(); //남아있는 데이터를 모두 출력
		bw.close(); //스트림 닫음
	}
}
