class Solution {
    public int averageValue(int[] nums) {
        int num = 0;
        int sum = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2 == 0 && nums[i]%3==0)
            {
                sum+=nums[i];
                num++;
            }
        }
        return num==0?0:sum/num;
    }
}