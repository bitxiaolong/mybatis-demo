package mapper;
import dto.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import org.apache.ibatis.io.Resources;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class UserMapperTest {
    UserMapper userMapper;
    SqlSessionFactory sqlSessionFactory;
    SqlSession session;
    @Before
    public void init() throws IOException{
        String resource = "mybatis.cfg.xml";
        InputStream is = Resources.getResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        session =  sqlSessionFactory.openSession(true);
        userMapper = session.getMapper(UserMapper.class);
    }
    @Test
    public void testGetAllUser() {
        for(User user:userMapper.getAllUser())
        System.out.println(user.toString());
    }
    @Test
    public void testGetUserByName(){
        List<User> users=userMapper.getUserByName("我");
        for(User user:users)
            System.out.println(user.toString());

    }
    @Test
    public void testGetUser() {
        User a=new User();
        a.setName("翔");
////      方法一
//        List<User> users=session.selectList("getUser",a);
//        for(User user1:users) {
//            System.out.println(user1.toString());
//        }
//      方法二
        for(User user2:userMapper.getUser(a)){
            System.out.println(user2);
        }
    }
    @Test
    public void testGetUserById(){
        for(User user:userMapper.getUserById(30,55)){
            System.out.println(user.toString());
        }
    }
    @Test
    public void insertUser() {
        User user=new User();
        user.setName("奈文摩尔");
        userMapper.insertUser(user);
        System.out.print(user);
    }
    @Test
    public void testDeleteUser() {
        userMapper.deleteUser(4);
        for (User user : userMapper.getAllUser()) {
            System.out.println(user.toString());

        }
    }
    @Test
    public void updateUser() {
        User usertoupdate=new User();
        usertoupdate.setId(26);
        userMapper.updateUser(usertoupdate);

    }
    @Test
    public void HelloWorld(){
        System.out.println("Hello World!!!!");
    }
}
