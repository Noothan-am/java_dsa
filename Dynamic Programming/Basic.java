
//  Fibonacci

// MEMOIZATION

class Solution{
    static int find(int n, int[] dp) {
        if(n<=1) return n;
        if(dp[n]!= -1) return dp[n];
        return dp[n]= f(n-1,dp) + f(n-2,dp);
    }
}

// TABULATION:- replace all function name to array, we are using it to overcome extra stack space occupied by reccurion

class Solution{
    public static void main(String args[]) {
        int n = 5;
        dp[0]= 0;
        dp[1]= 1;
        for(int i=2; i<=n; i++){
            dp[i] = dp[i-1]+ dp[i-2];
        }
        System.out.println(dp[n]);
    }
}

// OPTIMIZED TABULATION- used when we can use variables to get the answer

// Replacing tabulation array with variables

class TUF{
    public static void main(String args[]) {
        int n=5;
        
        int prev2 = 0;
        int prev = 1;
        
        for(int i=2; i<=n; i++){
            int cur_i = prev2+ prev;
            prev2 = prev;
            prev= cur_i;
        }
        System.out.println(prev);
    }
}
