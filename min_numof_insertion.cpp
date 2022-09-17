// { Driver Code Starts
#include<iostream>
using namespace std;


 // } Driver Code Ends
class Solution
{
    public:
    int transform (string A, string B)
    {
        //is it even possible to convert string a to b, this means that does both the strings have same
        //characters or not, for this what we can do is compare the sum of ascii values of the charcaters of both the strings
        
        if(A.length()!=B.length()){
            return -1;
        }
        int sum=0;
        for(int i=0; i<A.length(); i++)
        {
            sum+=A[i];
            sum-=B[i];
        }
        
        if (sum!=0) return -1;
        
        int i=A.length();
        cout<<i;
        cout<<A[i];
        cout<<A[i-1];
        int j=B.length();
        int count=0;
        
        while(i>=0 && j>=0)
        {
            if(A[i]!=B[j])
            {
                count++;
                i--;
            }
            else
            {
                i--;
                j--;
            }
        }
        return count;
    }
};


// { Driver Code Starts.

int main () 
{
    int t; cin >> t;
    while (t--)
    {
        string A, B; 
        cin >> A >> B;
        Solution ob;
        cout <<ob.transform (A, B) << endl;
    }
}  // } Driver Code Ends