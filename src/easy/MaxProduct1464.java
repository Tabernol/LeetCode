package easy;

import java.util.Arrays;

public class MaxProduct1464 {
    public void quickSort(int[] array, int low, int high) {
        if (array.length == 0) {
            return;
        }
        if (low >= high) {
            return;
        }
        int middle = low + (high - low) / 2;
        int opora = array[middle];

        int i = low;
        int j = high;
        while (i <= j) {
            while (array[i] < opora) {
                i++;
            }
            while (array[j] > opora) {
                j--;
            }
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }

    public int maxProduct(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        int firstMax = nums[nums.length - 1];
        int secondMax = nums[nums.length - 2];
        return (firstMax - 1) * (secondMax - 1);
    }

    public static void main(String[] args) {
        MaxProduct1464 m = new MaxProduct1464();
        System.out.println(m.maxProduct(new int[]{1, 22, 34, 0, -7, 2, 12, 5, 4, 5}));
    }
}
