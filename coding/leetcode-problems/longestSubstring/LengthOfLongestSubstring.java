import java.util.*;
class Solution 
{

    public int lengthOfLongestSubstring(String s) 
    {
        if(s.length()>50000)
        {
            return -1;
        }
        String longs="";
        String helper="";
        for(int i=0;i<s.length();i++)
        {
            if(helper.length()==0)
            {
                helper=helper+s.charAt(i);
            }
            else
            {
                int j;
                for(j=0;j<helper.length();j++)
                {
                    if(s.charAt(i)!=helper.charAt(j) && j==helper.length()-1)
                    {
                        helper=helper+s.charAt(i);
                        break;
                    }
                    else if(s.charAt(i)==helper.charAt(j))
                    {
                        if(helper.length()>longs.length())
                        {
                            longs=helper;
                        }
                        helper=helper.substring(j+1)+s.charAt(i);
                        break;
                    }
                }
            }
        }
        if(helper.length()>longs.length())
        {
            longs=helper;
        }
        return longs.length();
    }
}
class LengthOfLongestSubstring
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str=sc.nextLine();
        Solution obj=new Solution();
        System.out.println("Length of longest substring without duplicate characters: "+obj.lengthOfLongestSubstring(str));
        sc.close();
    }
}