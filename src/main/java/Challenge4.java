import java.util.Arrays;

public class Challenge4 {

    public static void moveZerosToEnd(int[] arr){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0) {
                arr[count] = arr[i];
                count++;
            }
        }
        while(count<arr.length){
            arr[count] = 0;
            count++;
        }

    }

    public static void main(String[] args) {

        int[] nums = {1,0,0,3,2,1,0,3,0,0,0,3,2,2};

        moveZerosToEnd(nums);

        System.out.println(Arrays.toString(nums));

    }
}
