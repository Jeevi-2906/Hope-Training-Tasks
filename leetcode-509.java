class Solution {
    public int fib(int n) {
        if(n<=1) return n;
        int a = 0;
        int b = 1;
        int c = a+b;
        n-=2;
        while(n > 0)
        {
            a = b;
            b = c;
            c = a+b;
            n--;
        }

        return c;
    }
}
