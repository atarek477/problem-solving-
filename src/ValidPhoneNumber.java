import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidPhoneNumber {
    public static void ValidPhone() throws FileNotFoundException {
        Pattern pattern = Pattern.compile("\\(?" +
                "\\d{3}" +
                "\\)?[\\s-]?" +
                "\\d{3}[-]?" +
                "\\d{4}");
        File file = new File("file.txt");
        Scanner scanner= new Scanner(file);
        while (scanner.hasNext()){
            String s=   scanner.nextLine();
            Matcher matcher = pattern.matcher(s);
            boolean matchFound = matcher.find();
            if(matchFound) {
                System.out.println(s);
            }
        }



    }

}
