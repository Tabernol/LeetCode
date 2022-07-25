package easy;

public class CapitalizeTitle2129 {
    public String capitalizeTitle(String title) {
        String[] array = title.split(" ");
        String result = "";
        StringBuilder word;
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() < 3) {
                word = new StringBuilder(array[i].toLowerCase());
            } else {
                word = new StringBuilder(array[i].substring(0, 1).toUpperCase())
                        .append(array[i].substring(1, array[i].length()).toLowerCase());
            }
            result += word + " ";
        }
        return result.trim();
    }

    public static void main(String[] args) {
        CapitalizeTitle2129 s = new CapitalizeTitle2129();
        System.out.println(s.capitalizeTitle("First leTTeR of EACH Word"));
    }
}
