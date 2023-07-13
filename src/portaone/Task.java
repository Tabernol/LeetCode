package portaone;

import java.util.stream.Stream;

public class Task {
    private static final String SOURCE = "The Tao gave birth toto machine language.  Machine language gave birth\n" +
            "to the assembler.\n" +
            "The assembler gave birth to the compiler.  Now there are ten thousand\n" +
            "languages.\n" +
            "Each language has its purpose, however humble.  Each language\n" +
            "expresses the Yin and Yang of software.  Each language has its place within\n" +
            "the Tao.\n" +
            "But do not program in COBOL if you can avoid it.\n" +
            "        -- Geoffrey James, \"The Tao of Programming\"";

    public char findFirstUniqueCharInWord(String word) {
        OUTER:
        for (int i = 0; i < word.length(); i++) {
            INNER:
            for (int j = 0; j < word.length(); j++) {
                if (i == j) {
                    continue INNER;
                }
                if (word.charAt(i) == word.charAt(j)) {
                    continue OUTER;
                }
            }
            return word.charAt(i);
        }
        return Character.MIN_VALUE;
    }


    public char findFirstUniqueCharInWordInString(String sourceString) {
        if (sourceString == null) {
            throw new IllegalArgumentException("The string for searching can't be null");
        }
        StringBuilder stringBuilder = new StringBuilder();
        String[] words = sourceString.replaceAll("\\W", " ").split("\s+");

        for (String word : words) {
            char temp = findFirstUniqueCharInWord(word);
            if (temp != Character.MIN_VALUE) {
                stringBuilder.append(temp);
            }
        }
        char result = findFirstUniqueCharInWord(stringBuilder.toString());
        if (result == Character.MIN_VALUE) {
            throw new IllegalArgumentException("Not found unique char in words in source string");
        }
        return result;
    }

    public static void main(String[] args) {
        Task task = new Task();
        char result = task.findFirstUniqueCharInWordInString(SOURCE);
        System.out.println("result = " + result);
    }
}

