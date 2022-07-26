package easy.String;

import java.util.HashMap;
import java.util.Map;

public class SortingTheSentence1859 {
    public String sortSentence(String s) {
        String[] arrayString = s.split(" ");
        Map<String, String> map = new HashMap<>(arrayString.length);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < arrayString.length; i++) {
            String num = String.valueOf(arrayString[i].charAt(arrayString[i].length() - 1));
            String substring = arrayString[i].substring(0, arrayString[i].length() - 1);
            map.put(num, substring);
        }
        for (int i = 1; i <= map.size(); i++) {
            stringBuilder.append(map.get(String.valueOf(i)) + " ");
        }

        return stringBuilder.toString().trim();
    }

    public static void main(String[] args) {
        SortingTheSentence1859 sortingTheSentence1859 = new SortingTheSentence1859();
        System.out.println(sortingTheSentence1859.sortSentence("is2 sentence4 This1 a3"));
    }
}
