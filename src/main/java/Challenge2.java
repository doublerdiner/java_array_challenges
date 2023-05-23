public class Challenge2 {

    public static void printTriangle(Object[] arr){
        for(int i=0; i<arr.length; i++){
            String answer = new String();
            for(int col=0; col<=i; col++){
                answer += arr[col];
            }
            System.out.println(answer);
        }
    }

    public static void main(String[] args) {
        printTriangle(new Integer[]{1,2,3,4,5});
    }
}
