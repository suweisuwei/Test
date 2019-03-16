package math.utils;

public class Tools {
	/**
	 * 这是一个判断int类型的数组是否已经排序好，（从小到大）
	 * 
	 * @param in 输入的 int 数组
	 * @return true表示从小到大，false反之。
	 * @throws {@link java.lang.ArrayIndexOutOfBoundsException} 数组越界
	 */
	public static boolean isSorted(int[] in) {
		for (int i = 1; i <= in.length - 1; i++) {
			if (in[i - 1] > in[i]) {
				return false;
			}
		}
		return true;
	}
	
	public static void print(int[] arr) {
		String result = "[";
		for(int i = 0;i<arr.length; i++) {
			result += arr[i]+",";
		}
		System.out.println(result.substring(0, result.length() - 1) + "]");
	}
	public static void print(String[] arr) {
		String result = "[";
		for(int i = 0;i<arr.length; i++) {
			result += arr[i]+",";
		}
		System.out.println(result.substring(0, result.length() - 1) + "]");
	}
	
}
