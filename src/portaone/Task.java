package portaone;

public class Task {

    private static String source = "The Tao gave birth to machine language.  Machine language gave birth\n" +
            "to the assembler.\n" +
            "The assembler gave birth to the compiler.  Now there are ten thousand\n" +
            "languages.\n" +
            "Each language has its purpose, however humble.  Each language\n" +
            "expresses the Yin and Yang of software.  Each language has its place within\n" +
            "the Tao.\n" +
            "But do not program in COBOL if you can avoid it.\n" +
            "        -- Geoffrey James, \"The Tao of Programming\"";

    public static char firstUniqueCharInWord(String word) {
        char result = ' ';
        OUTER:
        for (int i = 0; i < word.length(); i++) {
            INNER:
            for (int j = i + 1; j < word.length(); j++) {
                if (word.charAt(i) == word.charAt(j)) {
                    continue OUTER;
                }
            }
            result = word.charAt(i);
            return word.charAt(i);
        }
        return result;
    }


    public static char firstUniqueChar(String sourceString) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] s = sourceString.split("\\W");
        System.out.println(s.length);
        for (int i = 0; i < s.length; i++) {
            stringBuilder.append(firstUniqueCharInWord(s[i]));
        }
        char c = firstUniqueCharInWord(stringBuilder.toString());
        return c;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqueChar(source));
    }

}

