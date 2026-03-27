import java.util.*;

class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    int count = 0;
    s=s.trim();
    if(s.isEmpty()){
      System.out.println("0");
    }
    else{
      String[] res=s.split("\\s+");
      System.out.println(res.length);
    }


    boolean flag = true;
    for(int i = 0;i<s.length();i++)
    {
      char ch = s.charAt(i);
      if(ch != ' '){
        if(flag){
          count++;
          flag = false;
        }
      }
      else{
        flag = true;
      }
    }

    System.out.println(count);
  }
}