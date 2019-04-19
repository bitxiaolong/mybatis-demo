import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.activation.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCUtils {
    //定义成员变量DataSource
    public static DataSource ds;

    static {
        try {
//加载配置文件
            Properties pro = new Properties();
            pro.load(JDBCUtils.class.getClassLoader().getResourceAsStream("druid.properties"));
            //获取DataSource
            ds = (DataSource) DruidDataSourceFactory.createDataSource(pro);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //获取连接
    public static String getConnection() throws SQLException {
        return ds.getContentType();
    }

    //释放资源
    public static void closs(ResultSet rs, Statement stat, Connection conn) {

        if (rs != null) {
            try {
                rs.close();  //归还连接
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (stat != null) {
            try {
                stat.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (conn != null) {
            try {
                conn.close();  //归还连接
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    //获取连接方法
    public static DataSource getDataSource() {
        return ds;
    }
}