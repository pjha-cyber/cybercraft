import java.util.*;
class Solution
{
    public int[] twoSum(int[] nums, int target) 
    {
        int ans[]={0,0};
        if(nums.length<2 || nums.length>104)
        {
            return ans;
        }
        if(target<-109 || target>109)
        {
            return ans;
        }
        for(int i=0;i<=nums.length;i++)
        {
            if(i==0)
            {
                if(nums[i]<-109 || nums[i]>109)
                return ans;
            }
            for(int j=i+1;j<nums.length;j++)
            {
                if(i==0)
                {
                    if(nums[j]<-109 || nums[j]>109)
                    return ans;
                }
                if(nums[i]+nums[j]==target)
                {
                    ans[0]=i;
                    ans[1]=j;
                    return ans;
                }
            }
        }
        return ans;
    }
}
class TwoSum
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length of the array: ");
        int n=sc.nextInt();
        System.out.println("Enter "+n+" values for the array: ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the target number: ");
        int x=sc.nextInt();
        Solution obj=new Solution();
        int answer[]=obj.twoSum(arr, x);
        if(answer[0]!=answer[1])
        {
            System.out.println("Output: ["+answer[0]+","+answer[1]+"]");
        }
        sc.close();
    }
}