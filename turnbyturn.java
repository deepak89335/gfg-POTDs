import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.numsGame(N));
        }
    }
}


class Solution {
    static int numsGame(int N) {
       
            if(N%2==0){
               
                return 1;
            }
         else{return 0;}   
        }
        


    
}
