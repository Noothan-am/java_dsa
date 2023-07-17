import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        System.out.printf("%.3f",sqrt(50000));
    }
    static double sqrt(int n)
    {   
        n = Math.abs(n); //converts negative number to positve
        if(n == 0)
        {
            return 0;
        }
        double res = binarySearch(0,n,n);
        return res;
    }
    static double binarySearch(int start, int end, int n)
    {
        // exicutes when the root is integer
        int sqr,mid;
        double inc,root;
        mid = (start+end)/2;
        while(start<=end)
        {
            mid = (start+end)/2; 
            sqr = mid*mid;
            if(sqr == n)
            {  
                return mid;
            }
            else if(sqr > n)
            {
                end = mid - 1;
            }
            else
            {
                start = mid + 1;
            }
        }
        
        // exicuted when the root is in decimals
        root = 0.0;
        inc = 0.1;
        for(int i = 0; i<3; i++) // 3 is precidence 
        {   
            while(root*root <= n) 
            {
                root += inc; //root increments till 0.9 then to 1.0
            }
            root -= inc; // goes back to 2.2 if root is 2.3 to find btw 2.2 and 2.3
            inc /= 10; // this makes 0.1 to 0.01
        }
        
        return root;
    }
}
