package Demopackage04;

class FinalDemo {
    public final double i = Math.random();
    public static double t = Math.random();
}
public class Demo01 {
    public static void main(String[] args) {

        FinalDemo demo1 = new FinalDemo();
        FinalDemo demo2 = new FinalDemo();
        System.out.println("final修饰的  i=" + demo1.i);
        System.out.println("static修饰的 t=" + demo1.t);
        System.out.println("final修饰的  i=" + demo2.i);
        System.out.println("static修饰的 t=" + demo2.t);
        System.out.println("t+1= "+ ++demo2.t );
//     System.out.println( ++demo2.i );//编译失败
    }
}
//运行结果：
//        final修饰的  i=0.7282093281367935
//        static修饰的 t=0.30720545678577604
//        final修饰的  i=0.8106990945706758
//        static修饰的 t=0.30720545678577604
//       t+1= 1.307205456785776