class Solution {
    public int pivotIndex(int[] nums) {
        int left;
        int right;
        int pivot = -1;
        for(int i=0;i<nums.length;i++)
            {
                left=0;
                right=0;
                //if(i==0) left=0;
                //if(i==nums.length-1) right=0;
                for(int j=0;j<i;j++) left += nums[j];
                for(int j=i+1;j<nums.length;j++) right += nums[j];

                if(left==right) return i;
            }
        return pivot;
    }
}