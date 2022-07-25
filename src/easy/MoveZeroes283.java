package easy;

import java.util.Arrays;

public class MoveZeroes283 {
    public void moveZeroes(int[] nums) {
        for(int i = 0; i< nums.length; i++){
            if(nums[i] == 0){
                for(int j = i; j< nums.length-1; j++){
                    int change = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = change;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        MoveZeroes283 m = new MoveZeroes283();
        m.moveZeroes(new int[]{0,0,0,0,1});

    }
}
