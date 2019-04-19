import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

public class JdbcTemplateDemo1 {
    public static void main(String[] args) {
//导入jar包
        //new一个JdbcTemplate对象
        JdbcTemplate template = new JdbcTemplate((DataSource) JDBCUtils.getDataSource());
        //定义sql
        String sql ="update websites set country ='cn' where id=?";
        //调用方法
        int count =template.update(sql,3);
        //打印输出
        System.out.println(count);

        //导入jar包
        //new一个JdbcTemplate对象
        JdbcTemplate template1 = new JdbcTemplate((DataSource) JDBCUtils.getDataSource());
        //定义sql
        String sql1 ="delete from websites where id =?";
        //调用方法
        int count1 =template.update(sql,3);
        //打印输出
        System.out.println(count);

        //导入jar包
        //new一个JdbcTemplate对象
        JdbcTemplate template2 = new JdbcTemplate((DataSource) JDBCUtils.getDataSource());
        //定义sql
        String sql2 ="insert into websites (name, url, alexa, country) values (?,?,?,?)";
        //调用方法
        int count2 =template.update(sql,"王二毛","www.sdasd.com",522,"ja");
        //打印输出
        System.out.println(count);
    }
}