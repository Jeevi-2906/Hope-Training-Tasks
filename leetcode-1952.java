class Solution {
    public boolean isThree(int n) {
        int C=0;
        for(int ind =1;ind<=n;ind++)
            {
                if(n%ind == 0){
                    C++;
                }
            }
        return (C==3)? true :false;
    }
}
