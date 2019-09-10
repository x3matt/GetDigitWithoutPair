import java.util.Arrays;

public class GetDigitWithoutPairClass {

    public static void main(String[] args) {
        GetDigitWithoutPairClass clazz = new GetDigitWithoutPairClass();
        System.out.println(clazz.getDigitWithoutPair(new int[]{1,6,7,1,7,9,6}));
    }
    public int getDigitWithoutPair(int[] ints){
        int res = 0;
        Arrays.sort(ints);
        for(int i = 0; i < ints.length-1;i+=2){
            if(ints[i] != ints[i+1]) res = ints[i];
            if(res == 0 && i == (ints.length+1)/2) res = ints[ints.length-1];
        }
        return res;
    }

}
