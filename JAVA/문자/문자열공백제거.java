package practice.문자;

public class 문자열공백제거 {

	public static void main(String[] args) {
		//문자열 앞뒤 공백 제거. 가운데는 X (trim)
		String str =" 문자열에 공백이 있어요. ";
		System.out.println(str);
		
		str = str.trim();
		System.out.println(str);
		
		//가운데 공백은 replace사용
		String a = "문자열 가운데 공백 없애기";
		a = a.replace(" ", "");
		System.out.println(a);
	}

}
