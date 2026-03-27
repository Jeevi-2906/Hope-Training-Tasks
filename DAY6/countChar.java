public class Main
{
    public static void main(String[] args)
    {
        String str="hello@123#";
        int alpha=0;
        int digit= 0;
        int spl =0;
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
            {
                alpha++;
            }
            else if(ch>='0' && ch<='9')
            {
                digit++;
            }
            else{
                spl++;
            }
        }
        System.out.println(alpha+" "+digit+" "+spl);
        //System.out.println(palindrome(str));
    }
}