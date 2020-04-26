package practice.숫자;

public class 별찍기 {

	public static void main(String[] args) {
		/* 네모 별
		 for(int i=0; i<=3; i++) {
			for (int j=0; j<=3; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		*/
		
		/* 삼각형
		for(int i=0; i<=3; i++) {
			for (int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		*/
		
		/* 역삼각형
		for (int i=3; i>=0; i--) {
			for (int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		*/
		
		/*
		for(int i=0; i<=3; i++) {
			for (int j=3; j>=0; j--) {
				if (i < j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
		*/
		
		for (int i=0; i<=4; i++) {
			for (int j=0; j<=4-i; j++) {
				System.out.print(" ");
			}
			for (int k=0; k< i*2+1; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
