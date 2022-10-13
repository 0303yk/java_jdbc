package Duotai;
public class

Computer {
    public void start(){ System.out.println("开机中..."); }
    public void useUsb(USB usb){ usb.drive();usb.run();usb.close(); }
    public void shutdown(){
        System.out.println("关机中...");
    }
    }

