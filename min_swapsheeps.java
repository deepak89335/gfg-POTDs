import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);
        
        return a;
    }
    
    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
    
    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int[] a = IntArray.input(br, 4);
            int n = a[0],k=a[1],b=a[2],T=a[3];
            
            int[] c = IntArray.input(br, a[0]);
            
            
            int[] v = IntArray.input(br, a[0]);
            
            Solution obj = new Solution();
            int res = obj.minimumSwaps(c, v,n,k,b,T);
            
            System.out.println(res);
            
        }
    }
}


class Solution {
    public static int minimumSwaps(int[] c, int[] v,int n,int k,int b,int t) {
        int gs=0;
        int bs=0;
        int sw=0;
        
        for(int i=n-1; i>=0; i--){
            if(v[i] * t + c[i] >= b)
            {
                gs++;
                sw += bs;
            }
            else
            {
                bs++;
            }

            if(gs == k)
            {
                return sw > 0 ? sw : 0;       
            }
    }
    return -1;
}
}
        
