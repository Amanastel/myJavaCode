

class Pen{
    String color;
    String type;
    void write(){
        System.out.println(this.color);
    }
}

class instructor_details{
    String name;
    int age;
    String course_name;
    String coding_language;

    void name (){
        System.out.println(name);
    }
    void age(){
        System.out.println(name+" "+age);
    }
    void course_name(){
        System.out.println(name+" "+ course_name);
    }
    void coding_language(){
        System.out.println(name+" "+coding_language);
    }




}
public class Main {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.color = "red";
        p1.type = "jel";
        p1.write();
//        System.out.println(p1);

        instructor_details obj1 = new instructor_details();
        obj1.age = 24;
        obj1.name = "Aman Kumar";
        obj1.coding_language = "Java";
        obj1.course_name = "JA111";
        obj1.coding_language();
        obj1.course_name();
    }
}