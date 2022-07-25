package easy;

import java.util.Arrays;

public class Twosum1 {
    int[] array;

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return array = new int[]{i, j};
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        Twosum1 x = new Twosum1();
        x.twoSum(new int[]{1, 1, 1, 1, 6, 7, 8}, 2);
        System.out.println(Arrays.toString(x.array));
    }
}
