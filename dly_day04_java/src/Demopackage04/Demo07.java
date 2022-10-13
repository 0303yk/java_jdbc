package Demopackage04;

import java.util.ArrayList;
import java.util.List;

public class Demo07 {

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(50);
        list.add(711);
        list.add(841);
        System.out.println(list.set(1,451));
        for (int i = 0; i < list.size(); i++) {
//            String arg = args[i];
            System.out.println(list.get(i));
        }
//        System.out.println(list.size());
//        System.out.println(list.hashCode());
//        System.out.println(list.isEmpty());
//        System.out.println(list.lastIndexOf(841));
//        System.out.println(list.get(0));
        }

}
