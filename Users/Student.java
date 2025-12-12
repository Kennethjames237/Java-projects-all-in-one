package Users;

public class Student implements IRegister {
    public String name;
    public String surname;
    public int age;
    public String password;
    public Boolean isStudent;

    public Student(String name , String surname, int age , String password,Boolean isStudent) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.password = password;
        this.isStudent = isStudent;
    }

    public void Register() {
        System.err.println("I register a student");
    }
}
