package easy.array;

import java.util.Arrays;

public class ConcatenationArray1929 {
    public static int[] getConcatenation(int[] nums) {
        int[] result = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[i];
            result[i + nums.length] = nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        getConcatenation(new int[]{1,3,2,1});
    }
}
