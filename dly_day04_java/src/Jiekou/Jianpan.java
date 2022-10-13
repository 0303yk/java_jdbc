package Jiekou;

public class Jianpan implements USB {
    @Override
    public void read() {
        System.out.println("键盘读入");
    }

    @Override
    public void write() {
        System.out.println("键盘写入");
    }
}
