class Solution {
    public int mySqrt(int x) {
        if(x<=0) return 0;
        long i=1;
        long count=0;
        while(i*i <= x)
        {
            count++;
            i++;
        }
        return (int) count;
    }
}
