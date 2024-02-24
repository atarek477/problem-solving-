package string;

public class ExcelSheetColumnTitle {
    public static String convertToTitle(int columnNumber) {
        StringBuilder stringBuilder= new StringBuilder();

        if(columnNumber<=26){

            return stringBuilder.insert(0,(char) (columnNumber+64)).toString();

        }
        else{

            while (columnNumber>26) {
                int mod =(columnNumber % 26);
                if(mod==0)
                {
                    columnNumber=columnNumber-1;
                }

                stringBuilder.insert(0, (char)((mod==0?26:mod) + 64));
                columnNumber=columnNumber/26;

            }
            stringBuilder.insert(0,(char) (columnNumber+64));

        }

        return stringBuilder.toString();
    }

}
