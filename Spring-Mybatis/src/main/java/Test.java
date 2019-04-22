package com.ij34.bean;

import java.io.IOException;
//import java.io.InputStream;
//import java.util.List;
//
//import org.apache.ibatis.io.Resources;
//import org.apache.ibatis.session.SqlSession;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ij34.model.*;
public class Test {
    public static void main(String[] args) throws IOException {
        @SuppressWarnings("resource")
        ApplicationContext ac=new ClassPathXmlApplicationContext("com/ij34/mybatis/applicationContext.xml");
        UserMapper mapper=(UserMapper) ac.getBean("UserMapperFactory");
        User user=mapper.selectUser(3);  //查找
        System.out.println(user);
/*     User user=new User();
     user.setId(9);
     user.setName("小测01");
     user.setAge(22);
     mapper.insertUser(user);  //添加
     System.out.println(user);*/
/*    User user=mapper.selectUser(8);
    user.setName("大大A");
    user.setAge(28);
    mapper.updateUser(user);  //更改
    System.out.println(user);*/
        //  mapper.deleteUser("小测01");  //删除
        //  System.out.println("已经删除：小测01");
    }
}