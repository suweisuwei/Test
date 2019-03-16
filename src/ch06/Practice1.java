package ch06;

public class Practice1 {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4 };
		int[] arr2 = { 5, 6, 7, 8 };

		for (int i = 0; i < arr1.length; i++) {

			arr2[i] = arr1[i];

		}
		
		math.utils.Tools.print (arr1);
		math.utils.Tools.print(arr2);
		
	}
}
