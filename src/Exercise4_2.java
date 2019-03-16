public class Exercise4_2 {
	public static void main(String[] args) {
		int size = 4;
		int length = 2 * size - 1;
		int start = length / 2; 
		int i;
		int j;
		for (i = start; i >= 0; i--) {
			for (j = 0; j <= length; j++) {
				if (j >= i && j <= length - i - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for (i = 1; i <= start; i++) {
			for (j = 0; j <= length; j++) {
				if (j >= i && j <= length - i - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}
}
