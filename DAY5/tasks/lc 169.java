class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        return nums[n/2];
    }
}


class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int half = n/2;
        
        int freq=0;
        int val=nums[0];
        for(int i=0;i<n-1;i++)
        {
            if(nums[i]==nums[i+1])
            {
                freq+=1;
                if(freq>half) val=nums[i];
                System.out.print(nums[i]+" ");
            }
            else{
                freq=1;
            }
        }
        return val;
    }
}