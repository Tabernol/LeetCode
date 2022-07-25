package easy;


import java.util.ArrayList;
import java.util.List;

public class KidsWithCandies1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            boolean elem = true;
            int possible = candies[i] + extraCandies;
            for (int element : candies) {
                if (possible < element) {
                    elem = false;
                }
            }
            result.add(elem);
        }
        return result;
    }

    public static void main(String[] args) {
        KidsWithCandies1431 c = new KidsWithCandies1431();
        System.out.println(c.kidsWithCandies(new int[]{4,2,1,1,2}, 1 ));
    }
}
