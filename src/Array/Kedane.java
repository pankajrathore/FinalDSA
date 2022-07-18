package Array;

import java.util.Map;

public class Kedane {
    public static void main(String[] args) {
        int[] arr=new int[]{-2,1,-3,4,-1,2,1,-5,4};
        int sol=maxSubArray(arr);
        System.out.println(sol);
    }

    static int maxSubArray(int nums[])
    {
        if(nums==null) return -1;
        int currSum=nums[0];
        int maxSum=nums[0];

        for(int i=1;i<nums.length;i++)
        {
            currSum=Math.max(nums[i],currSum+nums[i]);
            maxSum= Math.max(currSum,maxSum);

            System.out.println("for i="+i+" num="+nums[i]+" currSum="+currSum+" maxSum="+maxSum);
        }

        return maxSum;
    }
}
