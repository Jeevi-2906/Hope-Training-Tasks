class Solution {
public:
    bool isPalindrome(int x) {
        long long int num=x;
        int count=0;
        while(x>0){
            count++;
            x/=10;
        }
        x=num;
        long long int rev=0;
        while(count--){
            rev=rev*10+(x%10);
            x/=10;
        }
        if(num==rev)
        return true;
        else
        return false ;
    }
};
