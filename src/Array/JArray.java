package Array;

import java.util.Arrays;

public class JArray {
    public static void main(String[] args) {
        System.out.println("This is Final DS");

        int[] intArray=new int[3];
        intArray[0]=0;
        intArray[1]=10;
        intArray[2]=3;
        System.out.println(intArray.hashCode());

        printArray(intArray);
        Arrays.sort(intArray);
        System.out.println("After Sorting:");

        printArray(intArray);

        int[] copyArray=Arrays.copyOf(intArray,1);

        System.out.println("Printing copy=");

        printArray(copyArray);

        Arrays.fill(copyArray,100);
        printArray(copyArray);

    }

    private static void printArray(int[] intArray) {
        for(int i=0;i<intArray.length;i++)
        {
            System.out.print(intArray[i]+" ");
        }
    }
}
