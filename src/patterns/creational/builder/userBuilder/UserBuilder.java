package patterns.creational.builder.userBuilder;

public class UserBuilder {
    public String name;
    public int age;
    public GENDER gender;
    public String job;
    public double salary;
    public String phone;

    public UserBuilder(String name){
        this.name = name;
    }

    public UserBuilder age(int age){
        this.age = age;
        return this;
    }
    public UserBuilder gender(GENDER gender){
        this.gender = gender;
        return this;
    }
    public UserBuilder job(String job){
        this.job = job;
        return this;
    }

    public UserBuilder salary(double salary){
        this.salary = salary;
        return this;
    }

    public UserBuilder phone(String phone){
        this.phone = phone;
        return this;
    }

    public User build(){
        return new User(this);
    }
}
