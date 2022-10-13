package Jiekou;

public class Youpan implements USB {
    @Override
    public void read() {
        System.out.println("读取中。。。");
    }

    @Override
    public void write() {
        System.out.println("写入中。。。");
    }
}
