package easy;

public class MaximumSubarray53 {
    int max;
    public int maxSubArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {

            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }


    public static void main(String[] args) {
        MaximumSubarray53 c = new MaximumSubarray53();
        System.out.println(c.maxSubArray(new int[]{-2,-3,-2,-5}));
    }
}
