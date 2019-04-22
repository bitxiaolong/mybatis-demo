public interface UserMapper {
        public User selectUser(int id);
        public void insertUser(User user);
        public void updateUser(User user);
        public void deleteUser(String name);
    }

