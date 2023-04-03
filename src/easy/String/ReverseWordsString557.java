package easy.String;

public class ReverseWordsString557 {
    public static String reverseWords(String s) {
        String[] split = s.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < split.length; i++) {
            char[] chars = new char[split[i].length()];
            for (int j = 0; j < split[i].length(); j++) {
                chars[j] = split[i].charAt(split[i].length() - (j + 1));
            }
            stringBuilder.append(chars);
            stringBuilder.append(" ");
        }
        return stringBuilder.toString().trim();
    }
}
