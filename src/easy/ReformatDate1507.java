package easy;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;

public class ReformatDate1507 {
    public String reformatDate(String date) {
        String result = "";
        String[] array = date.split(" ");
        String first = "20th";
        Pattern patern1 = Pattern.compile("\\d+");
        Matcher matcher = patern1.matcher(first);


        while (matcher.find()){
            System.out.println(" " + matcher.group());
        }
//        LocalDate ld1= LocalDate.of(Integer.parseInt(array[2]), Month.valueOf(array[1]), Integer.parseInt(first));
        DateTimeFormatter dt = DateTimeFormatter.ofPattern("yyyy");
        LocalDate ld = LocalDate.parse(array[2]);
        System.out.println(ld);


        return result;
    }

    public static void main(String[] args) {
        ReformatDate1507 r = new ReformatDate1507();
        r.reformatDate("20th Oct 2052");
    }
}
