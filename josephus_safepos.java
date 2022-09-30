import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            
            int n = Integer.parseInt(S[0]);
            int k = Integer.parseInt(S[1]);

            Solution ob = new Solution();
            System.out.println(ob.safePos(n,k));
        }
    }
}

class Solution {
    static int ress(int N, int K)
    {
        if(N==1) return 0;
        
        return (K+ress(N-1, K))%N;
        
    }
    static int safePos(int n, int k) {
       return ress(n, k) + 1;
    }
};
