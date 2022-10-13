package Hi.system.stu;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        System.out.println("sfh");
        int[] arr={1,2,3,4,5,7,6};
        int[] br = Arrays.copyOf(arr,arr.length);
        int[] crr=Arrays.copyOfRange(arr,3,7);
        System.out.println();
        for (int i : crr) {
            System.out.println();

        }
    }
}
