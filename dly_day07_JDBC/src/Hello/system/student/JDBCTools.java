package Hello.system.student;

import com.oracle.jdbc.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCTools {

    //查询所有数据
    public static List<Student> findAll() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/2021dly", "root", "123456");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from student");//用执行查询的方法执行sql语句
            List<Student> list = new ArrayList<>();
            while(resultSet.next()){
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                int age = resultSet.getInt(3);
                Date birthday = resultSet.getDate(4);
                String location = resultSet.getString(5);
                int classno = resultSet.getInt("classno");
                Student s = new Student(id,name,age,birthday,location,classno);
                list.add(s);
            }
            return list;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    //查询一条信息
    public static Student findOne(int id) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/2021dly", "root", "123456");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from student where id = "+id);//用执行查询的方法执行sql语句
            if(resultSet.next()){
                String name = resultSet.getString(2);
                int age = resultSet.getInt(3);
                Date birthday = resultSet.getDate(4);
                String location = resultSet.getString(5);
                int classno = resultSet.getInt("classno");
                Student s = new Student(id,name,age,birthday,location,classno);
                return s;
            }else{
                return null;
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    //删除一条数据
    public static int deleteOne(int id) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/2021dly", "root", "123456");
            String sql="delete from student where id=?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1,id);
            return ps.executeUpdate();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
    //修改一条数据的姓名
    public static int updateOneName(Student student){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/2021dly", "root", "123456");
            String sql="update student set (name,classno)=(?,?) where id=?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1,student.getName());
            ps.setInt(2,student.getId());
            return ps.executeUpdate();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
    //新增一条信息
    public static int addOne(Student student){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/2021dly", "root", "123456");
            String sql=
                    "insert into student(name,age,birthday,location,classno) values(?,?,?,?,?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            //对?进行赋值
            ps.setString(1,student.getName());
            ps.setInt(2,student.getAge());
            //ps.setDate()只能传java.sql.date对象,想办法创建就行
            ps.setDate(3,new java.sql.Date(student.getBirthday().getTime()));
            ps.setString(4,student.getLocation());
            ps.setInt(5,student.getClassno());
            return ps.executeUpdate();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
