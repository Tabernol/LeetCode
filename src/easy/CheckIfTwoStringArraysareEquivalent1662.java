package easy;

public class CheckIfTwoStringArraysareEquivalent1662 {
    String str1 = "";
    String str2 = "";

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        for (int i = 0; i < word1.length; i++) {
            str1 = str1.concat(word1[i]);
        }
        for (int i = 0; i < word2.length; i++) {
            str2 = str2.concat(word2[i]);
        }
        System.out.println(str1.equals(str2));
        return str1.equals(str2);
    }

    public static void main(String[] args) {
        CheckIfTwoStringArraysareEquivalent1662 check = new CheckIfTwoStringArraysareEquivalent1662();
        check.arrayStringsAreEqual(new String[]{"abc", "d", "defg"}, new String[]{"abcddefg"});
    }
}
