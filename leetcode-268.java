class Solution {
    public int missingNumber(int[] nums) {
        int xor=0;
        int len=nums.length;
        for(int i=0;i<=len;i++){
            xor=xor^i;
        }        

        for(int n:nums){
            xor=xor^n;
        }
        
        return xor;
        

    }
}
