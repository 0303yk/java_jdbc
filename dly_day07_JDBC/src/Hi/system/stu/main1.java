package Hi.system.stu;

import java.util.Scanner;

public class main1 {
    public static void main(String[] args) {
//            int[][] ns={{9},{2,7},{4,1,6},{2,17,5}};
//            int temp =0;
//            int max = 0,min=ns[0][0];
//            double l=0;
//        for (int i = 0; i < ns.length; i++) {
//            for (int j = 0; j < ns[i].length; j++) {
//                if(ns[i][j]>max){
//                    max=ns[i][j];
//                }
//                if(ns[i][j]<min){
//                    min=ns[i][j];
//                }
//                temp+=ns[i][j];
//            }
//            l=l+ns[i].length;
//        l+=ns[i].length;
//        }
//        System.out.println(temp/l);
//        System.out.println("最大为"+max);
//        System.out.println("最小为"+min);
        /*判断一个数组里是否有重复的数,假设数组名为int[] array*/
//        int[][] ns={{9},{2,7},{4,1,6},{2,17,5}};

        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[][] m=new int[n-2][n-2];
        m[0][0]=1;
        m[1][0]=1;
        m[1][1]=1;
        System.out.println("1");
        System.out.println("1 1");
        try {
        for(int i=2;i<=n;++i){
            for (int j=2;j<=n;j++){
                m[i][1]=1;
                m[i][2]=n-1;
                m[i][j]=m[i-2][j]+m[i-2][j+1];
                System.out.println(m[i][j]);
            }
        }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            System.out.println("shit");

        }
    }
}
