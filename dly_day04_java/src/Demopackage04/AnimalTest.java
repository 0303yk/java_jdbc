package Demopackage04;

public class AnimalTest {
    public static void main(String[] args) {
        Cat c=new Cat();
        c.eat();
        c.setAge(3);
        System.out.println("她"+c.getAge()+"岁了");
        Dog d=new Dog();
        d.Lookdoor();
        d.setAge(4);
        d.eat();
        System.out.println("她"+d.getAge()+"岁了");
    }

}
