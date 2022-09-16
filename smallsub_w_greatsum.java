//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;
import java.util.Collections;


class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t > 0){
            int N = sc.nextInt();
            int[] Arr = new int[N];
            for (int i = 0; i < N; ++i){
                Arr[i] = sc.nextInt();
            }
            Solution ob = new Solution();
            int ans = ob.minSubset(Arr,N);
            System.out.println(ans);
            t--;
        }
    }
}

class Solution { 
    int minSubset(int[] Arr,int N) { 
        if(N==1) return 1;
         
        Arrays.sort(Arr);
        long sum=0;
        
        for(int i:Arr){
            sum+=i;
        }
        long sum2=0;
        int count=0;
        for(int i=N-1;i>=0;i--){
                sum2+=Arr[i];
                sum-=Arr[i];
            if(sum<sum2) return N-i; 
        }
        return N-1;
    }
    
}
