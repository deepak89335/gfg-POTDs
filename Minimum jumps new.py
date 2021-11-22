

class Solution:

 def minJumps(self, arr, n):

        if n<=0:

            return 0

        if arr[0]==0:

            return -1

            

        maxxReach=arr[0]

        stepup=arr[0]

        jump=1

        

        for i in range(1,n):

            if i==n-1:

                return jump

                

            print(maxxReach)

            maxxReach=max(maxxReach,i+arr[i])

            

            stepup-=1

            if stepup==0:

                jump+=1

                if i>=maxxReach:

                    return -1

                stepup=maxxReach-i

        return -1

   

      

if __name__ == '__main__':

    T=int(input())

    for i in range(T):

       n = int(input())

       Arr = [int(x) for x in input().split()]

       print(Arr)

       ob = Solution()

       ans = ob.minJumps(Arr,n)

       print(ans)

   
