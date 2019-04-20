package mapper;

import dto.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper{
    @Select("select * from users")
    public List<User> getAllUser();
    public List<User> getUser(User user);
    public List<User> getUserByName(String name);
    public List<User> getUserById( @Param("id1") int minid,@Param("id2") int maxid);
    public List<User> getUserById();
    public boolean deleteUser(int id);
    public void insertUser(User user);
    public void updateUser(User user);
}

