import java.util.Arrays;
import java.util.*;
public class First {
    public static void main(String[] args) {
        int[] arr = {4,5,3,2,1};
        quickSort(arr,0,arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    static void quickSort(int[] arr, int low, int high)
    {
        int item,pivot,start,end;
        if(low >= high)
        {
            return;
        }
        start = low;
        end = high;
        pivot = arr[(start+(end-start))/2];
        while (start <= end)
        {
            while (arr[end] > pivot)
            {
                end--;
            }
            while (arr[start] < pivot)
            {
                start++;
            }
            if(start <= end)
            {
                item = arr[start];
                arr[start] = arr[end];
                arr[end] = item;
                start++;
                end--;
            }
        }
        quickSort(arr,0,end);
        quickSort(arr,start,high);
    }
}
