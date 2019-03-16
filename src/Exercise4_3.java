public class Exercise4_3 {
	public static void main(String[] args) {
		int x = 1;
		double z = 1;
		double sum = 0;
		while (x <= 20) {
			z = z / x;
			x++;
			sum = sum + z;
		}
		System.out.println(sum);
	}
}
