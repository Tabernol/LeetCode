package easy;

import java.util.ArrayList;
import java.util.Arrays;

public class SquareOfSortArray977 {
    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] *= nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }

    public static void main(String[] args) {
        SquareOfSortArray977 s = new SquareOfSortArray977();
        s.sortedSquares(new int[]{-7, -3, 2, 3, 11});
    }
}
