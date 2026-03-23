import java.util.*;

public class Main
{
    static int hcf(int a,int b)
    {
        int n,max=0;
          if(a>b) n=b;
          else n=a;
          for(int i=1;i<=n;i++)
          {
            if(a%i == 0 && b%i == 0)
            {
                max = i;
            }
          }
          return max;
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		Main m =new Main();
		int res = m.hcf(num1,num2);
        System.out.println("Hcf is:"+ res);
	}
}