package easy;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HappyNumber202 {
    Set<Integer> number = new HashSet<>();

    public boolean isHappy(int n) {
        while (n != 1 && !number.contains(n)) {
            number.add(n);
            n = powAndSumN(n);
        }
        return n == 1;
    }

    int powAndSumN(int n) {
        List<Integer> list = new ArrayList<>();
        while (n > 0) {
            list.add(n % 10);
            n /= 10;
        }
        int newN = list.stream()
                .map(element -> element * element)
                .reduce((accumulator, element) -> element + accumulator)
                .get();
        return newN;
    }

    public static void main(String[] args) {
        HappyNumber202 h = new HappyNumber202();
        System.out.println(h.isHappy(0));
    }
}
