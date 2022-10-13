package p;

public class Demo01 {
    public static void main(String[] args) {
        int[] a1={1,2,3,4};
        int[] a2={5,7,9};
        int[] a3={4,1};
        int[][] a={{1,2,3,4},a2,a3};
        for(int i= 0;i<a.length;i++){
            for (int j= 0;j<a[i].length;j++){
                System.out.println(a[i][j]);
            }
        }
    }
}
