package Hi.system.stu;

import java.util.Scanner;

public class Tools {
    public static String main(String[] args) {
//        char[] ns1={'a','b','c'};
//        for (int i=0;i<=2;i++){
//            System.out.println(ns1[i]);
//        }
        //1.------------
//        int[] age={18,18,30,25,39};
//        int sum=0;
//        for (int i=0;i<=2;i++){
//            sum+=age[i];
//        }
//        System.out.println("平均年龄是："+sum/age.length);
        //2.------------
//        int[] array={18,18,30,25,39};
//        for(int i=array.length-1;i>=0;i--){
//            System.out.println("倒序输出"+array[i]);
//        }
        //3.------------
//        boolean[] array={true,true,false,false,true};
//        for (int i=0;i<=4;i++){
//            System.out.print(!array[i]+" ");
//        }
        //4.------------
//        String[] array={"nihao","sannian","yiban"};
//        for (int i=0;i<array.length;i++){
//            System.out.print(array[i]+" ");
//        }
        //5.------------


//6.定义一个包含5个元素的数组，对其进行赋值，使每个元素的值等于其下标
//        int[] array={0,1,2,3,4};
//7.定义一个5个元素组成的一维数组，求该数组中的最大值和最小值及平均值。
//        int array[]={0,1,2,3,4};
//        System.out.println(array[0]);

        //10．在一个由5个元素组成的一维数组中查找一个数字‘5’，如果该有数组中有此元素，由提示“数字5在此数组中”。
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入数字：");
        int n=scanner.nextInt();
        int array[]={0,1,2,3,4,5};
        String s1="you";
        String s2="mei";
        for (int i=0;i<array.length;i++){
            if (array[i]==n){ System.out.println("有");return s1; }
            else{return s2;}
        }

        return s1;
    }

}
