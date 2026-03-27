class Solution {
    public String countAndSay(int n) {
        String res = "1";
        for(int i = 2 ; i <= n ; i++)
        {
            StringBuilder str = new StringBuilder(); 
            int count = 1; // 
            for(int j = 1 ; j < res.length() ; j++)//1//1//123
            {
                if(res.charAt(j) == res.charAt(j-1)){//1==1//2==1
                    count++;//2
                }
                else{
                    str.append(count);//1
                    str.append(res.charAt(j-1));//12
                    count = 1;//1
                }
            }
            str.append(count);//str=1 str=2 str=121
            str.append(res.charAt(res.length()-1));//str=11 str=21 str=1211 
            res = str.toString();//11//21//1211
        }
        return res;
    }
}



