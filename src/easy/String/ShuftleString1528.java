package easy.String;

public class ShuftleString1528 {
    public static String restoreString(String s, int[] indices) {
        char[] result = new char [s.length()];
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if(indices[j]==i){
                    result[i]= s.charAt(j);
                    continue;
                }
            }
        }
        return new String(result);
    }

    public static void main(String[] args) {
        String codeleet = restoreString("codeleet", new int[]{4, 5, 6, 7, 0, 2, 1, 3});
        System.out.println(codeleet);
    }
}
