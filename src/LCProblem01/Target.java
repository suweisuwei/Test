package LCProblem01;

public class Target {

    public int[] twoSum(int nums[], int target ) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;
        Target target1 = new Target();
        int []result = target1.twoSum(nums,target);
        System.out.println("["+result[0]+"]");
        System.out.println("["+result[1]+"]");

    }

}
