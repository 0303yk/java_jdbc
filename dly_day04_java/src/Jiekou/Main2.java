package Jiekou;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        //List<Integer> list=new ArrayList<>();
        //生成一个实现可USB接口（标准）的U盘对象
        Youpan youPan = new Youpan();
        //调用U盘的read( )方法读取数据
        youPan.read();
        //调用U盘的write( )方法写入数据
        youPan.write();
        //生成一个实现可USB接口（标准）的键盘对象
        Jianpan jianPan = new Jianpan();
        //调用键盘的read( )方法读取数据
        jianPan.read();
        //调用键盘的write( )方法写入数据
        jianPan.write();
    }
}