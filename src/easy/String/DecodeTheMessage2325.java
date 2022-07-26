package easy.String;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DecodeTheMessage2325 {
    List<Character> newAlphabet = new ArrayList<>();
    Set<Character> setAlphabet = new HashSet<>();
    StringBuilder result = new StringBuilder();

    public String decodeMessage(String key, String message) {
        char[] chars = key.replace(" ", "").toCharArray();
        char[] mes = message.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (!setAlphabet.contains(chars[i])) {
                setAlphabet.add(chars[i]);
                newAlphabet.add(chars[i]);
            }
        }

        for (int i = 0; i < message.length(); i++) {
            if (mes[i] == ' ') {
                result.append(" ");
            } else {
                result.append((char) (newAlphabet.indexOf(mes[i]) + 97));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        DecodeTheMessage2325 decodeTheMessage2325 = new DecodeTheMessage2325();
        decodeTheMessage2325.decodeMessage("eljuxhpwnyrdgtqkviszcfmabo", "zwx hnfx lqantp mnoeius ycgk vcnjrdb");
    }
}
