package bits;

public class BitwiseANDofNumbersRange {


public static int rangeBitwiseAnd(int left ,int right){

    StringBuilder stringBuilder= new StringBuilder();
    for (int i = 0; i <32 ; i++) {

        if ((right&1)!=(left&1)){
            stringBuilder.setLength(0);

        }else {
        stringBuilder.insert(0,(left&1));}
        right=right>>1;
        left=left>>1;

    }
    for (int i = stringBuilder.length(); i <32 ; i++) {
        stringBuilder.append('0');
    }
return Integer.parseInt(stringBuilder.toString(),2);
}


}
