import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class App {

    public static Integer findSecondSmallestItem(Integer[] arr){
        if(arr.length <= 1){
            return null;
        }
        Arrays.sort(arr);
        for(int i=0; i<arr.length - 1; i++){
            if(arr[i] != arr[i+1]){
                return arr[i+1];
            }
        }
        return null;
    }

    public static Integer findSecondSmallestItem2(Integer[] arr){
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            int current = arr[i];
            if(current < smallest){
                secondSmallest = smallest;
                smallest = current;
            }
            else if (current < secondSmallest && current != smallest){
                secondSmallest = current;
            }
        }
        if(secondSmallest == Integer.MAX_VALUE){
            return null;
        }
        return secondSmallest;
    }

    public static void main(String[] args) {
        Integer[] arr = {5,8,3,2,6};
        System.out.println(findSecondSmallestItem(arr));
    }

}
