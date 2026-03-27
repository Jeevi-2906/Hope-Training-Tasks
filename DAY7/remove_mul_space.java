import java.util.*;

class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String str = "";
    for(int i = 0;i < s.length();i++){
      if(s.charAt(i) != ' ') {
        str += s.charAt(i);
      }
      else{
        if(s.charAt(i) == ' ' && s.charAt(i+1) != ' ')
        {
          str += " ";
        }
      }
    }
    System.out.println(str);
}}