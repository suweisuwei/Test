package LCProblem136;

public class Single {
    public int singleNumber(int[] nums) {
        int single = 0;
        for (int i = 0; i < nums.length; i++) {
            single = single^nums[i];
        }
        return single;
    }
    public int sum(int[] nums){
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum = sum+nums[i];
        }
        return sum;
    }
}




