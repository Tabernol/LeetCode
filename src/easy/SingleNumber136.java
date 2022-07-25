package easy;

public class SingleNumber136 {
    int single;

    public int singleNumber(int[] nums) {
        OUTER:
        for (int i = 0; i < nums.length; i++) {
            boolean existence = true;
            INNER:
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j] & (i != j)) {
                    existence = false;
                    continue OUTER;
                }
            }
            if (existence) {
                single = nums[i];
                break OUTER;
            }
        }
        return single;
    }

    public static void main(String[] args) {
        SingleNumber136 s = new SingleNumber136();
        System.out.println(s.singleNumber(new int[]{4, 4, 1}));
    }
}
