package practice.문자;

public class 문자열치환 {

	public static void main(String[] args) {
		//replace
		String a = "무궁화 삼천리 화려강산";
		a = a.replace("무궁화", "변경된 글자");
		
		System.out.println(a);
		
		//replaceAll
		String b = "무궁화 삼천리 무궁화";
		b = b.replaceAll("무궁화","변경된 글자들");
		
		System.out.println(b);
		
		//replace는 특수문자로 치환 가능하나 replaceAll은 X

		
		//replaceFirst
		String c = "무궁화 삼천리 무궁화";
		c = c.replaceFirst("무궁화", "처음만변경");
		
		System.out.println(c);
		
		
	}

}
