package practice.문자;

public class 문자열붙이기 {

	public static void main(String[] args) {
		//그냥
		String x = "aa";
		String y = "bb";
		
		System.out.println(x+y);
		
		//문자열 붙이기(concat)
		String a = "첫번째";
		String b = "두번째";
		
		System.out.println(a.concat(b));
		
		//+연산자가 문자열 합치는 방법과 같음(append)
		StringBuilder sb = new StringBuilder("첫번째 텍스트. ");
		sb.append("두번째 텍스트. ");
		sb.append("세번째 텍스트.");
		
		System.out.println(sb);
		
		//결론 : 두 개 문자열 더할 때는 concat, 여러 개 더할 때는 그냥 + 사용.
	}

}
