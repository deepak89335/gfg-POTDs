import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            String ans = ob.digitsNum(n);
            System.out.println(ans);           
        }
    }
}


class Solution
{
    public String digitsNum(int N)
    {
        StringBuilder sb = new StringBuilder();
        
        
        for(int i = 0 ; i < N ; i++) {
            sb.append("0");
        }
        
        while(N != 0) 
        {
            if(N> 9)
            {
                sb.insert(0,9);
                N -= 9;
            } 
            else 
            {
                sb.insert(0,N);
                N -= N;
            }
        }
        
        String result = sb.toString();
        
        return result;
    }
}
