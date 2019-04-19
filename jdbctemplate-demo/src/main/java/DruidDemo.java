import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.activation.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

public class DruidDemo {
    public static void main(String[] args) throws Exception {
//加载配置文件
        Properties pro = new Properties();
        InputStream io = DruidDemo.class.getClassLoader().getResourceAsStream("druid.properties");
        pro.load(io);//有异常先抛出
        //获取连接池对象
        DataSource ds = (DataSource) DruidDataSourceFactory.createDataSource(pro);
        //获取连接
        String conn = ds.getContentType();
        System.out.println(conn);
    }
}