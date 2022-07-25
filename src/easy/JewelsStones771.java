package easy;

public class JewelsStones771 {
    public int numJewelsInStones(String jewels, String stones) {
        int amount = 0;
        for (int i = 0; i < jewels.length(); i++) {
            for (int j = 0; j < stones.length(); j++) {
                if (jewels.charAt(i) == stones.charAt(j)) {
                    amount++;
                }
            }
        }
        return amount;
    }

    public static void main(String[] args) {
        JewelsStones771 f = new JewelsStones771();
        System.out.println(f.numJewelsInStones("d", "dDDDdD"));
    }
}
