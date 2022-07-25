package easy;

public class NumberOfGoodPairs1512 {
    int count;

    public int numIdenticalPairs(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        NumberOfGoodPairs1512 v = new NumberOfGoodPairs1512();
        System.out.println(v.numIdenticalPairs(new int[]{1,2,3,1,1,3}));
    }
}
