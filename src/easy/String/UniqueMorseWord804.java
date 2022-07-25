package easy.String;

import java.util.*;

public class UniqueMorseWord804 {
    String[] alphabetMorse = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.",
            "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-",
            ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
    Map<Character, String> morseMap = new HashMap<>();
    Set<String> uniqueWords = new HashSet<>();
    public int uniqueMorseRepresentations(String[] words) {
        char symbol = 'a';
        for (int i = 0; i<alphabetMorse.length; i++){
            morseMap.put(symbol, alphabetMorse[i]);
            symbol++;
        }
        for (int i = 0; i < words.length; i++) {
            String wordMorse = "";
            for (int j = 0; j < words[i].length(); j++) {
                char letter = words[i].charAt(j);
                String letterMorse = morseMap.get(letter);
                wordMorse = wordMorse.concat(letterMorse);
            }
            uniqueWords.add(wordMorse);
        }
        return uniqueWords.size();
    }

    public static void main(String[] args) {
        UniqueMorseWord804 b = new UniqueMorseWord804();
        System.out.println(b.uniqueMorseRepresentations(new String[]{"gin", "zen", "gig", "msg","gin", "zen", "gig", "msg"}));
    }
}
