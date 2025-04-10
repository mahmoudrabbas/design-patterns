package patterns.creational.builder.userBuilder;

public class User {
    private String name;
    private int age;
    private GENDER gender;
    private String job;
    private double salary;
    private String phone;


    public User(UserBuilder user){
        this.name = user.name;
        this.age = user.age;
        this.gender = user.gender;
        this.job = user.job;
        this.salary = user.salary;
        this.phone = user.phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", job='" + job + '\'' +
                ", salary=" + salary +
                ", phone='" + phone + '\'' +
                '}';
    }
}

