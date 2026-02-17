package oops;

public class Constructor {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        // Teacher t2 = new Teacher("Shariya");
        // Teacher t3 = new Teacher(40);
        // System.out.println(t2.name);
        // System.out.println(t3.id);
        t1.password = "anvj";
        // Initializing set of marks
        t1.marks[0] = 59;
        t1.marks[1] = 89;
        t1.marks[2] = 69;

        Teacher t4 = new Teacher(t1);
        t4.password = "jjefvji";
        // t4.marks[2] = 19;

        for(int i = 0; i < 3;i++){
            System.out.println(t4.marks[i]);
        }

    }
}

class Teacher {
    String name;
    int id;
    String password;
    int marks[];

    // Copy constructor
    // Shallow Copy Constructor 
    // Teacher(Teacher t1) {
    //     marks = new int[3];
    //     this.name = t1.name;
    //     this.id = t1.id;
    //     this.password = t1.password;
    //     this.marks = t1.marks;
    // }

    // Deep copy constructor 
    Teacher(Teacher t1){
        marks = new int[3];
        this.name = t1.name;
        this.id = t1.id;
        for(int i = 0; i < 3;i++){
            this.marks[i] = t1.marks[i];
        }
    }


    // Non-Parameterized Constructor
    Teacher() {
        marks = new int[3];
        System.out.println("Constructor is running.....");
    }

    // Parameterized Constructor
    Teacher(String name) {
        marks = new int[3];
        this.name = name;
        // System.out.println();
    }

    // Parameterized Constructor
    Teacher(int id) {
        marks = new int[3];
        this.id = id;
    }

}
