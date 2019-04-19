package service;
import dto.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import mapper.UserMapper;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;

public class UserService {
    UserMapper userMapper;
    SqlSession session;
    String resource ="mybatis.cfg.xml";
    public UserService () throws IOException {
        this.session=new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream(resource)).openSession();
        this.userMapper=new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream(resource)).openSession().getMapper(UserMapper.class);
    }
    public void GetAllUser(){
        for(User user:userMapper.getAllUser())
            System.out.println(user.toString());
    }
}
