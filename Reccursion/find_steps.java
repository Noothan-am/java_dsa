class HelloWorld {
    
    public static void main(String[] args) {
        System.out.println(steps(123,0));
    }
    static int steps(int n,int c)
    {   
        if(n == 0)
        {
            return c;
        }
        else if(n%2 == 0)
        {
            n /= 2;
            return steps(n,c+1);
        }
        return steps(n-1,c+1);
    }
}



// OPTIMIZED CODE FOR THIS QUESTION


class Solution {

    // Notes:
    // & is AND Operation (1 AND 1 is 1, 1 AND 0 is 0, 0 AND 0 is 0)
    // num & 1 == 1 meaning odd, == 0 meaning even.
    // Example:
    // n = 15 or 1111. n & 0001 = 0001
    // n = 8 or 1000. n & 0001 = 0000.
    //
    // ^ is XOR Operation (1 OR 1 is 0, 1 OR 0 is 1, 0 OR 0 is 0)
    // num ^ 1 is num - 1 if num is odd, or num + 1 if num is even.
    // We only use num ^ 1 when num is odd.
    // Example:
    // n = 15 or 1111. n ^ 0001 = 1110 (14)
    // n = 8 or 1000. n ^ 0001 = 1001 (9)
    //
    // >> is SHIFT RIGHT Operation, the number is the number of bits moved (moving the whole binary one bit right).
    // num >> 1 is num / 2 if num is even. If num is odd, then is (num - 1) / 2.
    // Example:
    // n = 15 or 1111. n >> 1 = 0111 (7)
    // n = 8 or 1000. n >> 1 = 0100 (4)

    public int numberOfSteps(int num) {
        int count = 0;

        while (num > 0) {
            num = (num & 1) == 1 ? num ^ 1 : num >> 1;
            count++;
        }
        return count;
    }
}

// -------------------------------------------------------------------------------------OR--------------------------------------------------------------------

public int numberOfSteps(int num) {
    int count = 0;

    while (num != 0) {
        count += (num & 1) + 1;
        num >>= 1;
    }
    return count - 1;
}

//The line count += (num & 1) + 1; is used to increment the count variable. The num & 1 operation checks the least significant bit of num to 
//determine whether num is odd or even. If num & 1 is 1, then num is odd and the next step is to subtract 1. 
//If num & 1 is 0, then num is even and the next step is to divide by 2. 
//The count is incremented by either 2 (if num is odd) or 1 (if num is even) with count += (num & 1) + 1;.
//The line num >>= 1; is used to divide num by 2. The num >>= 1 operation shifts the bits of num to the right by 1, effectively dividing num by 2.
//This step is performed regardless of whether num is odd or even, and is necessary to reduce num to 0 in the while loop.
