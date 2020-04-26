package practice;

public class 형변환 {

	public static void main(String[] args) {
		// 숫자 -> 문자
		int i = 1234;
		String a = String.valueOf(i);
		String b = Integer.toString(i);
		
		System.out.println(a);
		System.out.println(b);
		
		// 문자 -> 숫자 (대체로 많이 쓰는게    형.valueOf(문자이름);)
		String str = "1234";
		int c = Integer.valueOf(str);
		int d = Integer.parseInt(str);
		
		long e = Long.parseLong(str);
		short h = Short.parseShort(str);
		
		double f = Double.valueOf(str);
		float g = Float.valueOf(str);
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		
		//Byte.parseByte(str) 바이트형 정수로 변환 
		//Short.parseShort(str) short형 정수로 변환 
		//Integer.parseInteger(str) int형 정수로 변환 
		//Long.parseLong(str) long형 정수로 변환 
		//Float.parseFloat(str) float형 부동 소수로 변환 
		//Double.parseDouble(str) double형 부동 소수로 변환
		
	}
}
