public class Main
{
    public static void main(String[] args)
    {
        String str="hello@123#";
        System.out.println(palindrome(str));
    }

    public static boolean palindrome(String s)
    {
        int l=0;
        int r=s.length()-1;
        while(l<r)
        {
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;

    }
}
