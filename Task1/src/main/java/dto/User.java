package dto;

import sun.misc.Contended;


public class User {

    //实体类的属性和表的字段名称一一对应
    private Integer id;
    private String username;
    private Integer password;
    private String status;
    private Integer age;
    public Integer getId() {
        return id;
    }

    public Integer getAge(){
        return age;
    }

    public void setAget(Integer age){
        this.age = age ;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return username;
    }
    public void setName(String name) {
        this.username = name;
    }
    public Integer getPassword() {
        return password;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password=" + password +
                ", status='" + status + '\'' +
                ", age=" + age +
                '}';
    }
}