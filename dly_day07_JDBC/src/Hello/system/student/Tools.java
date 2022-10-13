package Hello.system.student;

import com.oracle.jdbc.Student;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Tools {
    public static Scanner scanner = new Scanner(System.in);
    private static int id;
    private static Student s;
    private static String name;
    private static Date birthday;
    private static List<Student> list;
    private static int result;
    private static int classno;
    public static void show(){
        System.out.println("欢迎来到学生管理系统,请输入指令:");
        System.out.println("输入1:查询所有学生的信息");
        System.out.println("输入2:查询单个学生的信息");
        System.out.println("输入3:删除一条学生信息");
        System.out.println("输入4:修改一条学生的信息");
        System.out.println("输入5:新增一条学生信息");
        System.out.println("输入0:退出程序");
    }
    public static void control(int order){
        switch (order){
            case 1:
                list = JDBCTools.findAll();
                showList(list);
                break;
            case 2:
                System.out.println("请输入学生的id:");
                id = scanner.nextInt();
                s = JDBCTools.findOne(id);
                System.out.println(s);
                break;
            case 3:
                System.out.println("请输入学生的id:");
                id = scanner.nextInt();
                result = JDBCTools.deleteOne(id);
                System.out.println("成功删除"+result+"条信息");
                break;
            case 4:
                System.out.println("请输入学生id:");
                id = scanner.nextInt();
                System.out.println("请输入新的学生姓名:");
                name = scanner.next();
                System.out.println("请输入新的学生班级:");
                classno = scanner.nextInt();
                s = new Student(id,name,classno);
                result = JDBCTools.updateOneName(s);
                System.out.println("成功修改了"+result+"条信息");
                break;
            case 5:
                System.out.println("请输入学生姓名:");
                name = scanner.next();
                System.out.println("请输入地址:");
                String location = scanner.next();
                System.out.println("请输入班级编号:");
                int classno = scanner.nextInt();
                System.out.println("请输入出生年(4位):");
                String year = scanner.next();
                System.out.println("请输入出生月(2位):");
                String month = scanner.next();
                System.out.println("请输入出生日(2位):");
                String day = scanner.next();
                String time = year+"-"+month+"-"+day;
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                try {
                    birthday = sdf.parse(time);
                } catch (ParseException e) {
                    e.printStackTrace();
                }//计算年龄
                int age = (int)((new Date().getTime()-birthday.getTime())/1000/60/60/24/365);
                s = new Student(name,age,birthday,location,classno);
                result = JDBCTools.addOne(s);
                System.out.println("成功添加了"+result+"条信息");
                break;
            case 0:
                //退出程序
                System.exit(0);
                break;
            default:
                System.out.println("输入的指令无法识别!");
                break;
        }
    }
    //展示所有数据
    public static void showList(List<Student> list){
        System.out.println("id\tname\tage\tbirthday\tlocation\tclassno");
        for (Student s : list) {
            System.out.println(s.getId() +
                    "\t" + s.getName() +
                    "\t" + s.getAge() +
                    "\t" + s.getBirthday() +
                    "\t" + s.getLocation() +
                    "\t" + s.getClassno());
        }
    }
}
