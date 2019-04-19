import java.sql.*;

public class main {

    public static void main(String[] args) {
        Statement stat = null;
        student stu=null;
        Connection conn=null;
        try {
            //加载mysql的驱动，这里封装了对mysql数据库操作的具体实现
            Class.forName("com.mysql.jdbc.Driver");

            //配置MySQL数据库的访问地址，以及用户名和密码
            String dbURL="jdbc:mysql://localhost:3306/mysqltest?useUnicode=true&characterEncoding=UTF-8" ;
            String user ="root";
            String password ="root";

            //创建与数据库中的连接通道
             conn = DriverManager.getConnection(dbURL,user,password);

            //使用jdbc的方式创建一个sql
            String sql = "select * from student";

            //执行sql,并且封装了db的返回
             stat = conn.createStatement();
           ResultSet result = stat.executeQuery(sql);
            while (result.next()){
                String name =result.getString("name");
                Integer age =result .getInt("age");
                Integer number =result.getInt("number");
                Integer id = result.getInt("id");
                System.out.println("name:"+name+"age:"+age+"number:"+number+"id:"+id);
            }
            //关闭创建的客户端与db的连接

       }catch (Exception e ){
            e.printStackTrace();
        }finally {
            if (stat != null) {
                try {
                    stat.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn !=null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
