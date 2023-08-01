import java.util.Arrays;

public class First {
    public static void main(String[] args) {
        String arr = "adadcdcccc ";
        StringBuilder newArr = new StringBuilder();
        rem(arr,0,arr.length()-1,newArr,0);
        System.out.println(arr);
        System.out.println(newArr);
    }
    static void rem(String arr, int index,int length, StringBuilder newArr,int i)
    {

        if(index > length)
        {
            return;
        }
        char charecter = arr.charAt(index);
        if(charecter != 'a' && charecter != ' ')
        {
            newArr.append(charecter);
            rem(arr,index+1,length,newArr,i+1);
        }
        else
        {
            rem(arr,index+1,length,newArr,i);
        }

    }
}

// --------------------------------------------------------------------OR---------------------------------------------------------------------------

import java.util.Arrays;

public class First {
    public static void main(String[] args) {
        String arr = "abc  ";
        String newArr = subSets(arr,"");
        System.out.println(newArr);
    }
    static String subSets(String arr, String newArr)
    {
        if(arr.isEmpty())
        {
            return newArr;
        }
        char charecter = arr.charAt(0);
        if(charecter != 'a' && charecter != ' ')
        {
            return charecter + subSets(arr.substring(1),newArr);
        }
        else
        {
            return subSets(arr.substring(1),newArr);
        }

    }
}

// --------------------------------------------------------------------OR---------------------------------------------------------------------------

