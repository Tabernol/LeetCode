package easy;

import java.util.ArrayList;
import java.util.Arrays;

public class LemonadeChange860 {
    public boolean lemonadeChange(int[] bills) {
        ArrayList<Integer> ar = new ArrayList<>();
        boolean result = false;
        boolean b = true;
        int i = 0;
        while (b) {
            result = false;
            switch (bills[i]) {
                case 5:
                    result = ar.add(bills[i]);
                    break;
                case 10:
                    if (ar.contains((Integer) 5)) {
                        result = ar.remove((Integer) 5);
                        ar.add(bills[i]);
                    } else {
                        b = false;
                        result = false;
                    }
                    break;
                case 20:
                    if (ar.contains((Integer) 5) & ar.contains((Integer) 10)) {
                        result = ar.remove((Integer) 10);
                        result = ar.remove((Integer) 5);
                        ar.add(bills[i]);
                    } else if (result = ar.remove((Integer) 5)) {
                        if (result = ar.remove((Integer) 5)) {
                            if (result = ar.remove((Integer) 5)) {
                            }
                        }
                    } else if (!result) {
                        b = false;
                    }
                    break;
            }
            if (i == bills.length - 1) {
                b = false;
            }
            i++;
            System.out.println(ar);
        }
        return result;
    }

    public static void main(String[] args) {
        LemonadeChange860 b = new LemonadeChange860();
        System.out.println(b.lemonadeChange(new int[]{5,5,10,20,5,5,5,20}));
    }
}
