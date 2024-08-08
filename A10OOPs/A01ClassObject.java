
/**
 * A01ClassObject
 */
public class A01ClassObject {
    public static void main(String[] args) {

        Student defaultStudent = new Student();
        System.out.println(defaultStudent.name);
        System.out.println(defaultStudent.roll);
        System.out.println(defaultStudent.marks);

        System.out.println();

        Student Anuj = new Student("Anuj", 69, 99.9f);
        System.out.println(Anuj.name);
        System.out.println(Anuj.roll);
        System.out.println(Anuj.marks);
        
        System.out.println();
        
        Student replicaAnuj = new Student(Anuj);
        System.out.println(replicaAnuj.name);
        System.out.println(replicaAnuj.roll);
        System.out.println(replicaAnuj.marks);

        System.out.println();
       
        
    }
}

class Student{
    String name;
    int roll;
    float marks;

    // Student(){
    //     this.name = "Default - Null";
    //     this.roll = 0;
    //     this.marks = 0.00f;  
    // }

    Student(){
        this("Aman", 04, 90.00f);
    }

    Student(String name, int roll, float marks){
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }

    Student(Student other){
        this.name = other.name;
        this.marks = other.marks;
        this.roll = other.roll;
    }


}