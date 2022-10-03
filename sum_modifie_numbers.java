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
            String[] input = new String[2]; 
            input = br.readLine().split(" "); 
            int l = Integer.parseInt(input[0]); 
            int r = Integer.parseInt(input[1]); 
            Solution ob = new Solution();
            System.out.println(ob.sumOfAll(l,r));
        }
    }
}


class Solution
{
    public int sumOfAll(int l, int r)
    {
        int sum = 0;

        for(int i = l; i<=r; i++){
            int temp = sum;
            for(int j = i-1; j>1; j--){
                if(i%j==0){
                    if(isprime(j)){
                        sum += j;
                    }
                } 
            }
            if(sum == temp)
            sum += i;
        }
        return sum;
    }
    public boolean isprime(int n){
        
        for(int i = 2; i*i<=n; i++){
            if(n%i==0){
                return false;
            }
        }
        
        return true;
    }
}
