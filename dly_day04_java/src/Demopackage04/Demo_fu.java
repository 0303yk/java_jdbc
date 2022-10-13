package Demopackage04;

public class  Demo_fu {
    private String name;

    public static void main(String[] args) {
        Demo_fu s = new Demo_fu();
        s.name = "jack";
//        System.out.println(s.name.show());
        class Demo_fu1 {
            void show() {
                System.out.println("父类方法...");
            }

        }
        class Demo_zi1 extends Demo_fu1 {
        }
    }

}