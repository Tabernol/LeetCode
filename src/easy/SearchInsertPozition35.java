package easy;

public class SearchInsertPozition35 {
    int index;
    boolean b = true;

    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                index = i;
                b = false;
            }
        }
        while (b) {
            for (int i = 0; i < nums.length; i++) {
                if(target<nums[0]){
                    index = 0;
                    b = false;
                }
                if (target > nums[i]) {
                    index = i + 1;
                    b = false;
                }
            }
        }
        return index;
    }

    public static void main(String[] args) {
        SearchInsertPozition35 x = new SearchInsertPozition35();
        System.out.println(x.searchInsert(new int[]{1, 2, 17, 23, 34}, 12));
    }


}
