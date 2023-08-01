import java.util.*;
class HelloWorld {
    public static void main(String[] args)
    {
         ArrayList<Integer> arr = isPrime();  
         System.out.println("the prime numbers from 2 to 24 are:");
         for(int i =0; i<arr.size(); i++)
         {  
            System.out.println(arr.get(i));
         }
    }
    static ArrayList<Integer> isPrime()
    {   
        ArrayList<Integer> result = new ArrayList<Integer>(); 
        int n =2;
        while(n < 24)
        {
          if(n%2 == 0)
          {
              n++;
          }
          result.add(n); 
          n++;
        }
        
        return result;
    }
}
