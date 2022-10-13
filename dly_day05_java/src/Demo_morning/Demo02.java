package Demo_morning;

import sun.java2d.StateTracker;

public class Demo02 {
    public static int getInt(int[]ns,int index){
        try {
            return ns[index];
        }catch (ArrayIndexOutOfBoundsException e){
//            e.printStackTrace();
        }finally {
            return -1;
        }
    }
}
