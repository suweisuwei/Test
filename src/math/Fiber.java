package math;

public class Fiber {

	public static long getNthFiber(long x) {
		if (x == 1) {
			return 1;
		}
		if (x == 2) {
			return 2;
		}
		return getNthFiber(x - 1) + getNthFiber(x - 2);
	}

	public static void main(String[] args) {
//		long result = Fiber.getNthFiber(40L);
//		System.out.println(result);

		int[] nums = { 2, 1, 3, 4, 5, 6, 7, 8, 9, 10 };
		int center = nums.length / 2;
		int sum = nums.length - 1;
		for (int i = center - 1; i >= 0; i--) {
//			swap(nums[i], nums[sum-i]);
			int temp = nums[i];
			nums[i] = nums[sum - i];
			nums[sum - i] = temp;
		}
		System.out.println();

		for (int i = 0; i < nums.length / 2; i++) {
			int temp = nums[i];
			nums[i] = nums[sum - i];
			nums[sum - i] = temp;
		}
		System.out.println();

		for (int i = 0; i <= nums.length - 1; i++) {
			System.out.println(nums[i]);
		}
		boolean isSorted = math.utils.Tools.isSorted(nums);
		System.out.println(isSorted);

	}

	public static void getArgs(String name, int age, int... scores) {

	}
}
