package Array;

import java.util.Arrays;

public class ArrPract {
    public static void main(String[] args) {
        String[] strArr=new String[]{"Mer000", "Ven0", "Ear00000000"};
        System.out.println(strArr);
        System.out.println(Arrays.toString(strArr));
        Arrays.sort(strArr);
        System.out.println(Arrays.toString(strArr));
        Arrays.sort(strArr, (a,b)-> a.length()-b.length());
        System.out.println(Arrays.toString(strArr));

    }
}
