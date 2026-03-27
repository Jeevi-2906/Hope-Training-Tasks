import java.util.*;

class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String str = "1";
    for(int i = 0;i < N-1; i++)
    {
      int freq = 1;
      String s = "";

        char val = str.charAt(i);
        if (val == str.charAt(i+1)) {
          freq++;
        } else {
          freq = 1;
        }
        s = s + freq + val;
      str = s;
    }
    System.out.println(str);
  }
}


  
