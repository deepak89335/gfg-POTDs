#include<bits/stdc++.h>
using namespace std;

class Solution
{
   public:
    string ReFormatString(string S, int K){
    	
       string temp="";
       int c=0;
       
       for(int i=S.length()-1; i>=0; i--){
           
           if(S[i]=='-'){
               continue;
           }
           if(c==K){
               temp+='-';
               c=0;
           }
           temp+=toupper(S[i]);
           c++;
       }
       
       reverse(temp.begin(),temp.end());
       return temp;
    }
};

int main()
{
	int t;
	cin>>t;
	while(t--)
	{
	    string S;
	    cin>>S;
	    int K;
	    cin >> K;
	    Solution ob;  
	    string ans=ob.ReFormatString(S, K);
	    cout<<ans;
	    cout<<"\n";
	}
	return 0;
}

// } Driver Code Ends
