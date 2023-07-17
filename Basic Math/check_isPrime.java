import java.util.*;
class HelloWorld {
    public static void main(String[] args)
    {
         System.out.println(isPrime(0));
    }
    static boolean isPrime(int n)
    {   
        if(n == 0)
        {
          System.out.println("the number is neither prime nor composite");
          return;
        }
        else if(n == 1 || n == 2)
        {
            return true;
        }
        int i = 3;
        while(i <= (n/2))
        {
          if(n%2 == 0)
          {
              return true;
          }
          else
          { 
            n++;
          }
        }
        
        return false;
    }
}
