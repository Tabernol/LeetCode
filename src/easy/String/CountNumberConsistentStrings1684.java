package easy.String;

public class CountNumberConsistentStrings1684 {
    public static int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        outer:
        for (int i = 0; i < words.length; i++) {
            inner:
            for (int j = 0; j < words[i].length(); j++) {
                if (!allowed.contains(String.valueOf(words[i].charAt(j)))) {
                    continue outer;
                }
            }
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int abc = countConsistentStrings("ab", new String[]{"ad","bd","aaab","baa","badab"});
        System.out.println(abc);
    }
}
