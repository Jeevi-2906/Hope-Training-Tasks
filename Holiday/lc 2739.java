class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int dis =0;
        while(mainTank>0)
        {
            if(mainTank>=5)
            {
                dis+=50;
                mainTank-=5;
                if(additionalTank>0)
                {
                    mainTank+=1;
                    additionalTank-=1;
                }
            }

            else{
                dis+=(mainTank*10);
                break;
            }
        }

        return dis;   
    }
}