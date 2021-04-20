package api.util.arrays;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		
		char[] arr1= {'J','A','V','A'};
//		char[] arr2=new char[4];
		
		//번거로운 방식
//		arr2[0]=arr1[0];
//		arr2[1]=arr1[1];
//		arr2[2]=arr1[2];
//		arr2[3]=arr1[3];
//		char[] arr2=arr1; //복사하겠다.
		
		char[] arr2=Arrays.copyOf(arr1, arr1.length); //arr1을 arr1의 갯수만큼 카피하겠다.
								//(arr1,3) //3개 복사
		arr2[2]='Z';
		arr1[0]='B'; // B로변경
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		//중간에 특정한 부분만 복사하고 싶을 경우
		char[] arr3=Arrays.copyOfRange(arr1,1,3); //1번이상 3번미만만 카피 (1~2)
		System.out.println(Arrays.toString(arr3));
	
	    int[] arr4= {10,20,30,40,50,60,70,80};
		int[] arr5= Arrays.copyOfRange(arr4,1,6);
		System.out.println(Arrays.toString(arr5));
		
		
	

	}
}
