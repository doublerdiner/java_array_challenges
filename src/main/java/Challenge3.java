public class Challenge3 {

    public static Object[] rotateRight (Object[] arr){
        int arrayLength = arr.length;
        Object[] newArr = new Object[arrayLength];
        int index = 1;
        for(int i=0; i<arrayLength; i++){
            newArr[index % arrayLength] = arr[i];
            index++;
        }
        return newArr;

    }

    public static void main(String[] args) {
        Integer[] nums = {1,2,3,4,5};

        Object[] answer = rotateRight(nums);

        System.out.print(answer[0]);
        System.out.print(answer[1]);
        System.out.print(answer[2]);
        System.out.print(answer[3]);
        System.out.print(answer[4]);
        System.out.println();

        Object[] answer2 = rotateRight(answer);
        System.out.print(answer2[0]);
        System.out.print(answer2[1]);
        System.out.print(answer2[2]);
        System.out.print(answer2[3]);
        System.out.print(answer2[4]);
    }
}
