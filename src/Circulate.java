public class Circulate {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 2; i <= 100; i += 2) {
			sum = sum + i;
		}
		System.out.println("2到100之間的所有偶數之和為：" + sum);
	}
}
