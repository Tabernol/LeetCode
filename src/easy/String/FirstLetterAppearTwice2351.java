package easy.String;

import java.util.HashSet;
import java.util.Set;

public class FirstLetterAppearTwice2351 {
    public char repeatedCharacter(String s) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (!set.contains(s.charAt(i))) {
                set.add(s.charAt(i));
            }
            else {
                return s.charAt(i);
            }
        }
        return ' ';
    }

    public static void main(String[] args) {
        FirstLetterAppearTwice2351 firstLetterAppearTwice2351 = new FirstLetterAppearTwice2351();
        System.out.println(firstLetterAppearTwice2351.repeatedCharacter("abccbaacz"));
    }
}
