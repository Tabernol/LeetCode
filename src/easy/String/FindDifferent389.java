package easy.String;

public class FindDifferent389 {
    int count;
    char result;

    public char findTheDifference(String s, String t) {
        while (count < t.length()) {
            if (s.contains(String.valueOf(t.charAt(count)))) {
                count++;
            } else {
                result = t.charAt(count);
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        FindDifferent389 f = new FindDifferent389();
        System.out.println(f.findTheDifference("a", "aa"));
    }
}
