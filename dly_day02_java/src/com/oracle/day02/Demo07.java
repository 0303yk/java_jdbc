package com.oracle.day02;

public class Demo07 {
        public static void main(String[] args){
            int i=1;
            while(i<=9){
                int j=1;
                while (j<=i) {
                    System.out.print(i+"*"+j+"="+i*j+'\t');
                    j++;
                }
                i++;
                System.out.println();
            }
        }

}
