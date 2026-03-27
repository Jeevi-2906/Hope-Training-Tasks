import java.util.*;

class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    int[] freq = new int[256];
    for(int i = 0 ;i < s.length();i++)
    {
      char ch = s.charAt(i);
      freq[ch]++;
    }
    for(int i = 0;i < 256;i++)
    {
      if(freq[i] != 0)
      {
        System.out.println((char) i + ":" + freq[i]);
      }
    }


    String s = sc.nextLine();
    int count = 0;
    for(int i = 0;i < s.length();i++)
    {
      char ch = s.charAt(i);
      boolean flag = false;
      for(int j = 0 ;j < i;j++)
      {
        if(ch == s.charAt(j))
        {
          flag = true;
          break;
        }
      }

      if(flag){
        continue;
      }
      count = 1;
      for(int k = i+1;k < s.length();k++)
      {
        if(s.charAt(k) == ch){
          count++;
        }
      }

      System.out.println(ch+":"+count);
      if (ch == ' ') System.out.println("_ :"+count);
    }
  }
}