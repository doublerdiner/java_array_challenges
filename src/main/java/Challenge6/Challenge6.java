package Challenge6;

public class Challenge6 {
    public static void main(String[] args) {
        CustomArrayList<Integer> customArrayList = new CustomArrayList<Integer>();
        System.out.println(customArrayList.size());

        customArrayList.add(1);
        System.out.println(customArrayList.get(0));
        System.out.println(customArrayList.size());

        customArrayList.add(2);
        System.out.println(customArrayList.get(1));
        System.out.println(customArrayList.size());

        CustomArrayList<String> customArrayList1 = new CustomArrayList<String>();
        System.out.println(customArrayList1.size());

        customArrayList1.add("Hi");
        System.out.println(customArrayList1.get(0));
        System.out.println(customArrayList1.size());

        customArrayList1.add("Hello");
        System.out.println(customArrayList1.get(1));
        System.out.println(customArrayList1.size());

    }

}
