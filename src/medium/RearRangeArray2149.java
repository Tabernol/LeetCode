package medium;

import java.util.ArrayList;
import java.util.Arrays;

public class RearRangeArray2149 {
    public int[] rearrangeArray(int[] nums) {
        int count = 0;
        ArrayList<Integer> negativeArray = new ArrayList<>();
        ArrayList<Integer> positiveArray = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                negativeArray.add(nums[i]);
            } else {
                positiveArray.add(nums[i]);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                nums[i] = positiveArray.get(count);
            } else {
                nums[i] = negativeArray.get(count);
                count++;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        RearRangeArray2149 r = new RearRangeArray2149();
        r.rearrangeArray(new int[]{-1, 1, -9, 3, -4, -1, 7, 6, 3, -1});
    }
}
