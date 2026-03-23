#include <bits/stdc++.h>
void solve(){
string s;
cin >> s;
map<int,int> fimap;
fimap[0] = -1;
int ctr=0,maxlen=0,innd=0;
for(char ch:s){
    ctr+=(ch=='1'?1:-1);
    if(fimap.find(ctr)==fimap.end()){
        maxlen=max(maxlen,ind-fimap[ctr]);
    }
    else{
        fimap[ctr]=ind;
    }
    ind++;
}
cout<< maxlen;
}

int main{
solve();
return 0;
}
