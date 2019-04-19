public class student {
    private String  name;
    private  int age;
    private  int number;
    private  int id;

    public student(String name, int age, int number, int id) {
        this.name = name;
        this.age = age;
        this.number = number;
        this.id = id;
    }

    public student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

//    @Override
//    public String toString() {
//        return "student{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                ", number=" + number +
//                ", id=" + id +


    }

