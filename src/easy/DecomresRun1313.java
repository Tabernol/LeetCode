package easy;

import java.util.Arrays;

public class DecomresRun1313 {
    public int[] decompressRLElist(int[] nums) {
        int size = 0;
        for (int i = 0; i < nums.length; i = i + 2) {
            size += nums[i];
        }
        int[] result = new int[size];
        int count = 0;
        for (int i = 0; i < nums.length; i = i + 2) {
            while (nums[i] > 0) {
                result[count] = nums[i + 1];
                count++;
                nums[i]--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        DecomresRun1313 c = new DecomresRun1313();
        System.out.println(Arrays.toString(c.decompressRLElist(new int[]{3, 2, 3, 4, 2, 5})));
    }
}
