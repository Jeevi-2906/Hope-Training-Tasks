class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int total = numBottles;//15

        while(numBottles >= numExchange)//15>4//6>4//3>4
        {
            int full = numBottles / numExchange;//15/4=3//6/4=1
            int rem = numBottles % numExchange;//15%4=3//6%4=2
            total += full;//15+3=18//18+1=19
            numBottles = rem + full;//3+3=6//1+2=3
        }

        return total;//19
    }
}
