package easy;

import java.util.Arrays;

public class MaximumProductDifferent1913 {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int result = (nums[nums.length - 1] * nums[nums.length - 2]) - (nums[1] * nums[0]);
        return result;
    }

    public static void main(String[] args) {
        MaximumProductDifferent1913 d = new MaximumProductDifferent1913();
        System.out.println(d.maxProductDifference(new int[]{2, 4, 6, 8, 9, 4, 10, 3, 6}));
    }
}
