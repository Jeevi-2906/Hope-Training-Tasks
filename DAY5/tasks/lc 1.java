class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr=new int[2];
        int ind,ctr;
        for(ind=0;ind<nums.length;ind++)
        {
            for(ctr=ind+1;ctr<nums.length;ctr++)
            {
                if(nums[ind]+nums[ctr] == target)
                {
                    arr[0]=ind;
                    arr[1]=ctr;
                }
            }
        }

        return arr;
    }
}