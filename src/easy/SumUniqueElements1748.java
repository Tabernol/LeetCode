package easy;

public class SumUniqueElements1748 {
    public int sumOfUnique(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            boolean unique = true;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j] && i != j) {
                    unique = false;
                }
            }
            if (unique) {
                result += nums[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        SumUniqueElements1748 x = new SumUniqueElements1748();
        System.out.println(x.sumOfUnique(new int[]{1, 2, 3, 4, 5}));
    }
}
