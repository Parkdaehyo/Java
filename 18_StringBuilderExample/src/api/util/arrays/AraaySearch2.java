package api.util.arrays;

import java.util.Arrays;

public class AraaySearch2 {

	public static void main(String[] args) {
		
		
		int [] shoot = {10,2,5,7,9,3};
		int [] shoot2 = Arrays.copyOf(shoot, shoot.length);
		
		//sort: 분류하다.오름차순으로 정렬된다.
		Arrays.sort(shoot2);
		System.out.println(Arrays.toString(shoot));
		System.out.println(Arrays.toString(shoot2));
	
		int indexNum = Arrays.binarySearch(shoot2, 2);
		System.out.println("shoot2의 2번 내용의 인덱스 번호:" + indexNum);
		
		//배열의 비교
		int[] array1 = {1,2,3,4,5};
		int[] array2 = {1,2,3,4,5};
		
		//이 둘은 다르다가 출력이 된다. 왜냐면, 내용물을 비교하는게 아니라, 주소값을 비교하기 때문이다.
		if(array1 == array2) {
			System.out.println("array1과 arr2는 같습니다.");
		} else {
			System.out.println("arr1과 arr2는 다릅니다. 왜냐면 if비교는 주소값을 비교하기 때문입니다.");
		}
		
		
		if(Arrays.equals(array1, array2)) {
			System.out.println("equals는 내용물을 비교하는 메서드이므로, 이 둘은 같다가 출력됩니다.");
		} else {
			System.out.println("내용물이 다르면 이것이 출력 됩니다.");
		}
		
		
		
	}
}
