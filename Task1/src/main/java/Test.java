import dto.User;
import mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import org.apache.ibatis.io.Resources;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) throws IOException {
        SqlSessionFactory sqlSessionFactory;
        //mybatis的配置文件
        String resource = "mybatis.cfg.xml";
        //使用类加载器加载mybatis的配置文件（它也加载关联的映射文件）
        InputStream is = Resources.getResourceAsStream(resource);
        //构建sqlSession的工厂
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        //使用MyBatis提供的Resources类加载mybatis的配置文件（它也加载关联的映射文件）
        //Reader reader = Resources.getResourceAsReader(resource);
        //构建sqlSession的工厂
        //SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        //创建能执行映射文件中sql的sqlSession
        SqlSession session = sqlSessionFactory.openSession();
        /**
         * 映射sql的标识字符串，
         * mapper.userMapper是userMapper.xml文件中mapper标签的namespace属性的值，
         * getUser是select标签的id属性值，通过select标签的id属性值就可以找到要执行的SQL
         */
//        System.out.println("111");
//        String statement = "mapper.UserMapper.selectUser";//映射sql的标识字符串
//        System.out.println("222");
//        //执行查询返回一个唯一user对象的sql
//        User user = session.selectOne(statement,1);
//        System.out.println(user);
//
        UserMapper userMapper=session.getMapper(UserMapper.class);
        System.out.println("111");
        User user=new User();
        user.setName("所发生的");
        userMapper.insertUser(user);
        System.out.println("ID======"+user.getId());
        session.commit();//very important
        session.close();

//
//        UserMapper userMapper=session.getMapper(UserMapper.class);
//        System.out.println("111");
//        userMapper.deleteUser(21);
//        session.commit();
    }
}