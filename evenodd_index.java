// { Driver Code Starts
    import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
    class evenodd_index {
        public static void main(String args[]) throws IOException {
            BufferedReader read =
                new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(read.readLine());
            while (t-- > 0) {
                int N = Integer.parseInt(read.readLine());
                
                String S[] = read.readLine().split(" ");
                int[] arr = new int[N];
                
                for(int i=0; i<N; i++)
                    arr[i] = Integer.parseInt(S[i]);
    
                sol ob = new sol();
                System.out.print("Original Array: ");
                ob.printArray(arr, N);
  
    
                ob.reArrange(arr,N);
                System.out.print("\nModified Array: ");
                ob.printArray(arr, N);
                System.out.print("\n");
                System.out.println(check(arr,N));
            }
        }
        static int check(int arr[], int n)
        {
            int flag = 1;
            int c=0, d=0;
            for(int i=0; i<n; i++)
            {
                if(i%2==0)
                {
                    if(arr[i]%2==1)
                    {
                        flag = 0;
                        break;
                    }
                    else
                        c++;
                }
                else
                {
                    if(arr[i]%2==0)
                    {
                        flag = 0;
                        break;
                    }
                    else
                        d++;
                }
            }
            if(c!=d)
                flag = 0;
                    
            return flag;
        }
    }// } Driver Code Ends
    
    
    //User function Template for Java
    
    class sol {
        void reArrange(int[] arr, int n) {
            int e=0;
            int o=1;
            
            while(true){
                
                while(e<n && arr[e]%2==0){
                    e+=2;
                }
                
                while(o<n && arr[o]%2==1){
                    o+=2;
                }
                
                if(e<n && o<n){
                    int temp=arr[e];
                    arr[e] = arr[o];
                    arr[o] = temp;
                }
                else
                    break;
            }
            
        }

        public void printArray(int arr[], int n)
{
    for (int i = 0; i < n; i++)
        System.out.print(arr[i] + " ");
}
    };
