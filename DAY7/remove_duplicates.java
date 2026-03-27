import java.util.*;

class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String str = "";
    boolean flag  = true;
    for(int i=0;i<s.length();i++)
    {
      for(int j = 0;j<i;j++)
      {
        if(s.charAt(i) == s.charAt(j))
        {
          flag = false;
          break;
        }
      }
      if (flag) {
        str += s.charAt(i);
      }
        flag = true;

    }
    System.out.println(str);
}}