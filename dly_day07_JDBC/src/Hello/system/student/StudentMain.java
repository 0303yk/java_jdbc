package Hello.system.student;

public class StudentMain {
    public static void main(String[] args) {
        while(true){
            Tools.show();
            int order = Tools.scanner.nextInt();
            Tools.control(order);
        }
    }
}
