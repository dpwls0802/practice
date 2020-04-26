package practice.숫자;

import java.util.Arrays;

public class 배열최대값최소값 {

	public static void main(String[] args) {
		int array[] = {4,3,2,1,10,8,7,6,5,9};
		
		int max = array[0];
		int min = array[0];
		
		//for문 이용
		for(int i=0; i<array.length; i++) {
			if(max<array[i])
				max = array[i];
			
			if (min>array[i]) 
				min = array[i];
		}
		
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);
		
		//정렬 이용
		Arrays.sort(array);
		
		System.out.println("최소값은 : " + array[0]);
		System.out.println("최대값은 : " + array[array.length-1]);
	}

}
