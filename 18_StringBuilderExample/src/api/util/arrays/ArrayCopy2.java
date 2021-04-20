package api.util.arrays;

import java.util.Arrays;
import java.util.Random;

public class ArrayCopy2 {

	public static void main(String[] args) {
		
		char [] arr1 = {'쥬','시','쿨'};
		//char [] arr2 = new char[3];
		
		//배열 복사방법
		char[] arr2 = Arrays.copyOf(arr1, arr1.length);
		arr2[1] ='세';
		arr2[2] ='요';
		char[] arr3 = Arrays.copyOf(arr1, 2);
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		
		char [] arr4 = Arrays.copyOfRange(arr1, 1,3);
		
		System.out.println("프로그래밍을 할가요?");
		Random ra = new Random();
		boolean b = ra.nextBoolean();
		System.out.println("결과값: " + b);
		
		
		
		}
	}

