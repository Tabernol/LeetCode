package medium;

public class IntegerToRoman12 {
    public String intToRoman(int num) {
      int countTouthend = num/1000;
      int count = num%1000;
        System.out.println(countTouthend);
        System.out.println(count);



//        for (int i = 0; i < array.length; i++) {
//            switch (s.charAt(i)) {
//                case 'I':
//                    array[i] = 1;
//                    break;
//                case 'V':
//                    array[i] = 5;
//                    break;
//                case 'X':
//                    array[i] = 10;
//                    break;
//                case 'L':
//                    array[i] = 50;
//                    break;
//                case 'C':
//                    array[i] = 100;
//                    break;
//                case 'D':
//                    array[i] = 500;
//                    break;
//                case 'M':
//                    array[i] = 1000;
//                    break;
//            }
//        }


        String result ="";
        return result;
    }

    public static void main(String[] args) {
        IntegerToRoman12 d = new IntegerToRoman12();
        d.intToRoman(1994);
    }
}
