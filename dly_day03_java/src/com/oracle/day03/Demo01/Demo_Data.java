package com.oracle.day03.Demo01;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Demo_Data {
    public static void main(String[] args) throws ParseException {
//        Date d =new Date();
//        long time =d.getTime();
//        System.out.println(time);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        //jiang data shuju leixing zhuanhua wei zifuchuan
        Date data=new Date();
        String time=sdf.format(data);
        System.out.println(time);
        String t2 ="2002年04月15日" ;
        Date d2 =sdf.parse(t2);
        System.out.println(d2);
        System.out.println("我今年"+(data.getTime()-d2.getTime())/1000/60/60/24/365+"啦");
    }
}
//8：40 1.35/6.09