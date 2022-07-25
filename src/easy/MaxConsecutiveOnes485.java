package easy;

public class MaxConsecutiveOnes485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxConsecutive = 0;
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            if (nums[i] == 1) {
                while (nums[i] != 0) {
                    count++;
                    if(i<nums.length-1) i++;
                    else break;
                }
            }
            if (maxConsecutive < count) {
                maxConsecutive = count;
            }
        }
        return maxConsecutive;
    }

    public static void main(String[] args) {
        MaxConsecutiveOnes485 m = new MaxConsecutiveOnes485();
        System.out.println(m.findMaxConsecutiveOnes(new int[]{1, 1, 0, 1, 1, 1}));
    }
}
