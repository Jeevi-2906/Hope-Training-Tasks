import java.util.*;

class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String str = "";
        for(int i=s.length()-1;i>=0;i--)
        {
        str += s.charAt(i);
        }
        System.out.println(str);

        
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb.reverse().toString());


        char[] arr = s.toCharArray();
        int l = 0;
        inr r  = arr.length-1;
        while(l<r)
        {
            char temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
        System.out.println(String.valueOf(arr));
    }
}