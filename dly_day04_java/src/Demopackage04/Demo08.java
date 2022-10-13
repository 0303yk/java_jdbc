package Demopackage04;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo08 {

    public static void main(String[] args) {
        Map<String,Student> map=new HashMap<>();
        Student s1=new Student("mingming",00001,15);
        map.put("mingming",s1);
        map.put("honghong",new Student("honghong",00002,19));
        System.out.println(map);
        System.out.println(map.get("honghong"));
        Set set=map.keySet();
        System.out.println(set);
        for(Object o: set) {
            System.out.println(map.get(o));
        }
    }
}

