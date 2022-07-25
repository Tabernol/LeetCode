package easy;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz412 {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        int i = 0;
        while (i < n) {
            i++;
            if (i % 3 == 0 && i % 5 == 0) {
                list.add("FizzBuzz");
                continue;
            }
            if (i % 3 == 0) {
                list.add("Fizz");
                continue;
            }
            if (i % 5 == 0) {
                list.add("Buzz");
                continue;
            } else {
                list.add(String.valueOf(i));
            }
        }
        return list;
    }

    public static void main(String[] args) {
        FizzBuzz412 c = new FizzBuzz412();
        c.fizzBuzz(46);
    }

}
