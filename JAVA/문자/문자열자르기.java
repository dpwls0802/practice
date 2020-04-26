package practice.문자;

public class 문자열자르기 {
	public static void main(String[] args) {
		//문자열 자르기 (substring)
		//String.substring(start); start위치부터 끝까지 자르기
		//String.substing(start, end); start위치부터 end까지 자르기
		
		//기본
		String str = "가나다라마바사";
		String result = str.substring(3);
		System.out.println(result);
		
		//마지막 3글자 자르기
		String last3 = "가나다라마바사";
		String result2 = last3.substring(last3.length()-3, last3.length());
		System.out.println(result2);
		
		//특정 문자 이후의 문자열 제거
		String a = "가나다라/마바사";
		String result3 = a.substring(a.lastIndexOf("/")+1);
		System.out.println(result3);
		
		//특정 단어 부분만 자르기
		String b = "바나나 : 1000원, 사과 : 2000원, 배 : 3000원";
		String target = "사과";
		int target_num = b.lastIndexOf(target);
		String result4 = b.substring(target_num,(b.substring(target_num).indexOf("원") + target_num));
		System.out.println(result4 + "원");
		
		
		
		//문자열 잘라서 배열에 넣기 (split)
		//문자열 배열 = 대상 문자열.split("기준 문자");
		
		String c = "";
		
		for (int i=0; i<5; i++) {
			c += i + "#";
		}
		
		String[] array = c.split("#");
		
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		
		//1. 쉼표로 문자열 잘라서 배열에 넣기
		String d = "A,B,C,D";
		String[] array2 = d.split(",");
		
		for (int i=0; i<array2.length; i++) {
			System.out.println(array2[i]);
		}
		
		//2. 공백으로 문자열 잘라서 배열에 넣기
		String e = "동해물과 백두산이 마르고 닳도록 하나님이";
		String array3[] = e.split(" ");
		
		for(int i=0; i<array3.length; i++) {
			System.out.println(array3[i]);
		}
		
		// \n 개행 단위로 문자열 자르기 (\\n)
		String f = "동해물과 백두산이 \n마르고 닳도록 \n하느님이 ";
		String [] array4 = f.split("\\n");
		
		for(int i=0; i<array4.length; i++) {
			System.out.println(array4[i]);
		}
	}
}
