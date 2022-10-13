package p;

public class Demo02 {
    public static void main(String[] args) {
        int result=add(10,20);
        System.out.println(result);
    }
    private static int add(int a,int b){
        return a+b;
    }
    public static int jian(int a,int b){
        return a-b;
    }
    public static int cheng(int a,int b){
        return a*b;
    }
    public static int chu(int a,int b){
        return a/b;
    }
}
