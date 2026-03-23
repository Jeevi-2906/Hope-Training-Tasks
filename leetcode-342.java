class Solution {
    public boolean isPowerOfFour(int n) {
        if((n&(n-1)) == 0 && (n&0x55555555)!=0) return true;
        else return false;
    }
}
