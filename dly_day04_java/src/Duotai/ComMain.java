package Duotai;
public class ComMain {
    public static void main(String[] args)
    {Computer computer=new Computer();
    Mouse mouse=new Mouse();
    Keyboard keyboard=new Keyboard();
    computer.start();
    computer.useUsb(mouse);
    computer.useUsb(keyboard);
    computer.shutdown();
    }
}
