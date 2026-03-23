class Solution {
    
    public int trailingZeroes(int n) {
        int count=0;
        
        while(n>0)//10
        {
            n/=5;//2
            count+=n;//2
        }
        return count;
    }
}
