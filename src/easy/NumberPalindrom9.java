package easy;

import java.util.ArrayList;
import java.util.Arrays;

public class NumberPalindrom9 {
    int size;

    public boolean isPalindrome(int x) {
        boolean rezult;
        if (x == 0) {
            rezult = true;
        } else rezult = false;
        ArrayList<Integer> list = new ArrayList<>();
        while (x > 0) {
            int elements = x % 10;
            list.add(elements);
            x = x / 10;
            size++;
            rezult = true;
        }

        for (int i = 0; i < size / 2; i++) {
            if (list.get(i) == list.get(size - 1 - i)) {
            } else {
                rezult = false;
            }
        }
        return rezult;
    }

    public static void main(String[] args) {
        NumberPalindrom9 n = new NumberPalindrom9();
        System.out.println(n.isPalindrome(0));
    }
}
