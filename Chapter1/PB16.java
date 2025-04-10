package Chapter1;

public class PB16 {
    public static void main(String[] args) {
        student s = new student("Aakif", 17, "ahmedabad", "aakif@gmail.com", "B.Tech");
        Employee e = new Employee("aakif", 17, "hello", "email", "office", "designation", 1000);
        s.display();
        e.display();
    }
}

abstract class person{
    String name;
    int age;
    String address;
    String email;
    person(String name, int age, String address, String email){
        this.name = name;
        this.age = age;
        this.address = address;
        this.email = email;
    }
    person(){
        System.out.println("No name, age, address or email provided.");
    }
    abstract void display(); // Abstract method
}

class student extends person{
    String enrollmentCourse;
    student(String name, int age, String address, String email, String enrollmentCourse){
        super(name, age, address, email);
        this.enrollmentCourse = enrollmentCourse;
    }
    student(){
        System.out.println("No name, age, address or email provided.");
    }

    void display(){
        System.out.println("This is a student.");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Email: " + email);
        System.out.println("Enrollment Course: " + enrollmentCourse);
        
    }
}
class Employee extends person{
    String office;
    String designation;
    double salary;
    Employee(String name, int age, String address, String email, String office, String designation, double salary){
        super(name, age, address, email);
        this.office = office;
        this.designation = designation;
        this.salary = salary;
    }
    Employee(){
        System.out.println("No name, age, address or email provided.");
    }
    
    void display(){
        System.out.println("This is an employee.");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Email: " + email);
        System.out.println("Office: " + office);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
    }
}
