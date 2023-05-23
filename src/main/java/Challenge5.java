import java.lang.reflect.Array;
import java.util.Arrays;

public class Challenge5 {

    public static void reverse(int[] arr){
        int lastIndex = arr.length-1;
        for(int i=0; i<(arr.length/2); i++){
            int numToFront = arr[lastIndex];
            arr[lastIndex] = arr[i];
            arr[i] = numToFront;
            lastIndex -= 1;
        }

    }

    public static void main(String[] args) {
        int[] arr = {1,8,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
}
