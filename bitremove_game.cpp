#include<bits/stdc++.h> 
using namespace std; 

// } Driver Code Ends
class Solution{   
public:
    int swapBitGame(long long N){
         long long x=N;
         long long cnt=0;
         while(x)
         {
             ++cnt;
             x=x&(x-1);
         }

         return cnt%2==1?1:2;
    }
    
};

int main() 
{ 
    int t;
    cin>>t;
    while(t--)
    {
        long long N;
        cin >> N;
        Solution ob;
        cout << ob.swapBitGame(N) << endl;
    }
    return 0; 
} 
