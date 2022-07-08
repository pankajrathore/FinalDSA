package Array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {

        int[] nums=new int[]{1,2,3,4};
        //printArray(nums);
        //if(nums==null) return null;
        int len=nums.length;

        int[] leftArr=new int[len];
        int[] rightArr=new int[len];

        int[] finalArr=new int[len];
        int leftProdyet=1;
        leftArr[0]=leftProdyet;
        leftArr[1]=nums[0];
        for(int i=2;i<len;i++)
        {
            leftArr[i]=nums[i-1]*leftArr[i-1];
        }

        rightArr[len-1]=1;
        //rightArr[len-2]=nums[len-1];
        for(int i=len-2;i>=0;i--)
        {
            rightArr[i]=nums[i+1]*rightArr[i+1];
        }

        printArray(leftArr);
        printArray(rightArr);

    }

    private static void printArray(int[] retArray) {
        for(int i=0;i<retArray.length;i++)
        {
            System.out.print(retArray[i]+" ");
        }
    }


}
