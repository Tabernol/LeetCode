package easy;

import java.util.Arrays;

public class ShuffleArray1470 {
    public int[] shuffle(int[] nums, int n) {
        int[] array = new int[nums.length];
        int index =0;
        for (int i = 0; i< nums.length/2; i++) {
            array[index]=nums[i];
            index++;
            array[index]=nums[i+n];
            index++;
        }
        return  array;
    }


    public static void main(String[] args) {
        ShuffleArray1470 c = new ShuffleArray1470();
        System.out.println(Arrays.toString(c.shuffle(new int[]{2,5,1,3,4,7},3)));
    }
}
