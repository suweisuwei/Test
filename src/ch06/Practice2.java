package ch06;

public class Practice2 {
	public static void main(String[]args) {
		int[] arr = {3,2,1,4};
		int min = arr[0];
		for(int i = 1;i< arr.length;i++){
			if(arr[i]<min){
				min = arr[i];
			}
			
		}
		System.out.println(min);
	}
}
