package string;

public class DefangingIPAddress {
    public static String defangIPaddr(String address) {
    String[] spliter= address.split("\\.");
    StringBuilder result= new StringBuilder(spliter[0]);
        System.out.println(spliter[0]);
        for(int i=1 ;i<spliter.length ;i=i+1){

        result.append("[.]").append(spliter[i]);

    }
       return result.toString();
}

}
