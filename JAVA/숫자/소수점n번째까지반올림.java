package practice.숫자;

public class 소수점n번째까지반올림 {

	public static void main(String[] args) {
		//반올림 : Math.round()
		//올림 : Math.ceil()
		//버림 : Math.floor();
		
		double pie = 3.14159265358979;
		System.out.println(Math.round(pie));
		System.out.println(Math.round(pie*100)/100.0); //소수점 둘째 자리
		System.out.println(Math.round(pie*1000)/1000.0); //소수점 셋째 자리
	
		
		//String.format()
		double pie1 = 3.14159265358979;
		double money = 4424.243423;
		
		System.out.println(String.format("%.2f", pie1));
		System.out.println(String.format("%.3f", pie1));
		System.out.println(String.format("%.3f", money));
		
		//차이 : Math.round()는 소수점 아래가 0일 경우 절삭,
		//String.format()은 그대로 리턴
		
		double money1 = 5000.000;
		System.out.println(Math.round(money1*1000)/1000);
		System.out.println(String.format("%.3f", money1));
	}
}
