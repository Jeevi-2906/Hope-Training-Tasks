class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[2*n];
        //int ind = 0;
        for(int i=0;i<n;i++)
        {
            arr[2*i]=nums[i];
            //ind++;
            arr[2*i + 1]=nums[i+n];
            //ind++;

        }

        return arr;
    }
}