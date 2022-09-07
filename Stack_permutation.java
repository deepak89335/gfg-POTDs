// You are given two arrays A and B of unique elements of size N. Check if one array is a stack permutation of the other array or not.
// Stack permutation means that one array can be created from another array using a stack and stack operations.

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
            
            int N; 
            N = Integer.parseInt(br.readLine());
            
            
            int[] A = IntArray.input(br, N);
            
            
            int[] B = IntArray.input(br, N);
            
            Solution obj = new Solution();
            int res = obj.isStackPermutation(N, A, B);
            
            System.out.println(res);
            
        }
    }
}


class Solution {
    public static int isStackPermutation(int n, int[] ip, int[] op) {
       Stack<Integer> stash= new Stack<>();
       int o=0;
       
       
       for(int i=0; i<n; i++){
           
           stash.push(ip[i]);
           
           
           while(!(stash.isEmpty()) && stash.peek()==op[o]){
               
               stash.pop();
               o++;
           }
           
       }
       if(stash.isEmpty()){
           
           return 1;
       }
       return 0; 
    }
}
            
