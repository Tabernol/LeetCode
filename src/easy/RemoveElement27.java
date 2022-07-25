package easy;

public class RemoveElement27 {
    public int removeElement(int[] nums, int val) {
        int cout = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                cout++;
            }
        }
        for (int i : nums) {
            System.out.println(i);
        }
        return cout;

    }

    public static void main(String[] args) {
        RemoveElement27 c = new RemoveElement27();
        System.out.println(c.removeElement(new int[]{1, 2, 3, 4, 2}, 2));
    }
}
