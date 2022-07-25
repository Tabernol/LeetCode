package easy;

import java.util.Arrays;

public class RunningSum1480 {
    public int[] runningSum(int[] nums) {
        int[] arrayResult = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int element = 0;
            for (int j = 0; j <= i; j++) {
                element += nums[j];
                arrayResult[i] = element;
            }
        }
        return arrayResult;
    }


    public static void main(String[] args) {
        RunningSum1480 x = new RunningSum1480();
        System.out.println(Arrays.toString(x.runningSum(new int[]{3,1,2,10,1})));
    }
}
