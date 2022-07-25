package easy;

public class SubString1876 {
    public int countGoodSubstrings(String s) {
        int amount =0;
        for (int i = 0; i < s.length()-2; i++) {
                if ((s.charAt(i) != s.charAt(i + 1))
                        && (s.charAt(i) != s.charAt(i + 2))
                        && (s.charAt(i + 1) != s.charAt(i + 2))){
                    amount++;
                }
        }
        return amount;
    }

    public static void main(String[] args) {
        SubString1876 s = new SubString1876();
        System.out.println(s.countGoodSubstrings("aababcabc"));
    }
}
