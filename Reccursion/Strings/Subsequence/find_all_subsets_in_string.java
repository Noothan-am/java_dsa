import java.util.Arrays;

public class First {
    public static void main(String[] args) {
        String arr = "abc";
        subSequence(arr,"");
    }
    static void subSequence(String arr, String newArr)
    {
        if(arr.isEmpty())
        {
            System.out.println(newArr);
            return;
        }
        char charecter = arr.charAt(0);
        subSequence(arr.substring(1),newArr+charecter);
        subSequence(arr.substring(1),newArr);
    }
}
