package Problem2;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Student{
    int roll;
    String name;
    double marks;
    String address;

    public Student(int roll, String name, double marks, String address) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
        this.address = address;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                ", address='" + address + '\'' +
                '}';
    }
}

class Employee{
    int empId;
    String name;
    double salary;

    String address;
    public Employee(int empId, String name, double salary, String address) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }
    public int getEmpId() {
        return empId;
    }
    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", address='" + address + '\'' +
                '}';
    }

}

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Aman", 550, "Kanpur"));
        students.add(new Student(2, "rahul;", 400, "Delhi"));
        students.add(new Student(3, "Kartik;", 700, "Punjab"));
        students.add(new Student(4, "Kuldeep;", 600, "Mumbai"));
        students.add(new Student(5, "Priyanka;", 450, "Goa"));

        List<Employee> employees = students.stream().filter(student -> student.getMarks()>500).map(student -> new Employee(student.getRoll(), student.getName(), student.getMarks() * 10000, student.getAddress())).sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).toList();
        employees.sort(Comparator.comparingDouble(Employee::getSalary).reversed());
        System.out.println("Employee List: ");
        employees.forEach(System.out::println);

        System.out.println("Student List: ");
        students.forEach(System.out::println);
    }


}
