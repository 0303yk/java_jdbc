package Hi.system.stu;
import java.util.Scanner;
public class What_a_shit {
    public static void main(String[] args) {
//        String[] names= {"关羽","张飞","赵云","马超","黄忠","吕布"};
//        for (int i=0;i<=names.length;i++){
//            for (int m=0;m<=names.length & names[i]!=names[m];m++){
//                for (int n=0;i<=names.length & names[i]!=names[m] & names[n]!=names[m];n++){
//                    System.out.println(names[i]+" "+names[m]+" "+names[n]);
//                    continue;
//                }
//            }
//        }

                Scanner sc=new Scanner(System.in);
                System.out.println("请输入十个人的成绩");
                int[] score=new int[10];
                for(int i=0;i<10;i++)
                    score[i]=sc.nextInt();
                int max=0,min=100,average=0;
                for(int i=0;i<10;i+=2)
                {
                    average+=Math.addExact(score[i],score[i+1]);
                }
                System.out.println("总分是"+average);
                for(int i=0;i<10;i++)
                {
                    max=Math.max(score[i], max);
                    min=Math.min(score[i], min);
                }
                System.out.println("最高分是"+max);
                System.out.println("最低分是"+min);
            }
        }
        
