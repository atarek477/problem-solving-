package string;

public class ExcelSheetColumnNumber {
    public static int titleToNumber(String columnTitle) {
        StringBuilder stringBuilder= new StringBuilder(columnTitle);
        StringBuilder reverse = stringBuilder.reverse();
        int count = (reverse.toString().charAt(0)-64);
        System.out.println(reverse);


        for (int i = 1; i < columnTitle.length(); i++) {

            count= count+(int)(Math.pow(26,i)*(reverse.toString().charAt(i)-64));
        }

        return count;
    }
}
