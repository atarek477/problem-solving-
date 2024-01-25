package bits;

public class AddBinary {

    // bad way using normal concat 21ms runtime
    public static String addBinary1(String a, String b) {
        int i=a.length()-1 ;
        StringBuilder bBuilder = new StringBuilder(b);
        StringBuilder aBuilder = new StringBuilder(a);
        StringBuilder c = new StringBuilder();
        char carry = '0';

        int n = a.length() - b.length();
        n = Math.abs(n);
        if (a.length() > b.length()) {
            i = a.length() - 1;

            while (n != 0) {
                bBuilder.insert(0, "0");
                n--;
            }
            b = bBuilder.toString();
        } else if (a.length() < b.length()) {
            i = b.length() - 1;

            while (n != 0) {
                aBuilder.insert(0, "0");
                n--;

            }
            a = aBuilder.toString();

        }
        while (i >= 0) {
            if (a.charAt(i) == '0' && b.charAt(i) == '0') {
                if (carry == '0') {
                    c.insert(0, "0");
                } else {
                    c.insert(0, "1");
                    carry = '0';
                }
            }
            if (a.charAt(i) == '1' && b.charAt(i) == '0' || a.charAt(i) == '0' && b.charAt(i) == '1') {
                if (carry == '0') {
                    c.insert(0, "1");
                } else {
                    c.insert(0, "0");
                }
            }
            if (a.charAt(i) == '1' && b.charAt(i) == '1') {
                if (carry == '0') {
                    c.insert(0, "0");
                    carry = '1';
                } else {
                    c.insert(0, "1");
                }
            }
            i--;

        }
        if (carry == '1') {
            c.insert(0, "1");
        }
        return c.toString();
    }


    //better way concat using string builder 3ms runtime no the better all  over the way
    public static String addBinary(String a, String b) {
        int i=a.length()-1 ;
        StringBuilder bBuilder = new StringBuilder(b);
        StringBuilder aBuilder = new StringBuilder(a);
        StringBuilder c = new StringBuilder();
        char carry = '0';

        int n = a.length() - b.length();
        n = Math.abs(n);
        if (a.length() > b.length()) {
            i = a.length() - 1;

            while (n != 0) {
                bBuilder.insert(0, "0");
                n--;
            }
            b = bBuilder.toString();
        } else if (a.length() < b.length()) {
            i = b.length() - 1;

            while (n != 0) {
                aBuilder.insert(0, "0");
                n--;

            }
            a = aBuilder.toString();

        }
        while (i >= 0) {
            if (a.charAt(i) == '0' && b.charAt(i) == '0') {
                if (carry == '0') {
                    c.insert(0, "0");
                } else {
                    c.insert(0, "1");
                    carry = '0';
                }
            }
            if (a.charAt(i) == '1' && b.charAt(i) == '0' || a.charAt(i) == '0' && b.charAt(i) == '1') {
                if (carry == '0') {
                    c.insert(0, "1");
                } else {
                    c.insert(0, "0");
                }
            }
            if (a.charAt(i) == '1' && b.charAt(i) == '1') {
                if (carry == '0') {
                    c.insert(0, "0");
                    carry = '1';
                } else {
                    c.insert(0, "1");
                }
            }
            i--;

        }
        if (carry == '1') {
            c.insert(0, "1");
        }
        return c.toString();
    }
    }

