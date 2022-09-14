import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            ArrayList<Long> A = new ArrayList<Long>();
            String in[] = read.readLine().trim().split(" ");
            for(var i : in){
                Long x = Long.parseLong(i);
                A.add(x);
            }

            Solution ob = new Solution();
            System.out.println(ob.numberOfSubsequences(N,A));
        }
    }
}

class Solution{
    static Long numberOfSubsequences(int N, ArrayList<Long> A){
        long cnt=0;
        long mod=1000000007;
        long rens;
        for(int i=0; i<N; i++){
            if((A.get(i) & A.get(i)-1)==0){
                cnt++;
            }
       
        }
         rens=(long)(Math.pow(2,cnt)%mod-1);

        return rens%mod;
    }
}
