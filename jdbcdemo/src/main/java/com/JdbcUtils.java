package com;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.Properties;


public class JdbcUtils {
    private static String dbURL;
    private static String name;
    private static String possword;
    private static  String driver;

    static {
        try {
            Properties pro = new Properties();
            ClassLoader classLoader = JdbcUtils.class.getClassLoader();
            URL res = classLoader.getResource("jdbc.properties");
            String path = res.getPath();
            System.out.println(path);
//            pro.load(new FileReader("D:\\IdeaProjects\\jdbcdemo\\src\\jdbc.peoperties"));
            pro.load(new FileReader(path));
            dbURL=pro.getProperty("dbURL");
            name = pro.getProperty("name");
            possword =pro .getProperty("possword");
            driver = pro.getProperty("driver");
            try {
                Class.forName(driver);

            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

     //添加注释，方便以后回顾，新建一个工具类，抽取一些重复代码，这里新建的一个静态方法为连接
    public static Connection getConnection () throws SQLException {
        return DriverManager.getConnection(dbURL,name,possword);
    }
    //新建一个释放资源的方法，无返回值，传入参数stmt,conn
    public static void close (PreparedStatement st, Connection conn){
        if (st != null){
            try { //条件判断如果，如果stmt, conn不为空，那么久执行关闭连接，释放资源的操作
                st.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conn != null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
  //重载了上一个方法，因为有时候调用方法有excuteupdate和 query俩种
    public static void close (ResultSet rs ,PreparedStatement st, Connection conn){
        if (rs != null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (st != null){
            try { //条件判断如果，如果stmt, conn不为空，那么久执行关闭连接，释放资源的操作
                st.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conn != null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
