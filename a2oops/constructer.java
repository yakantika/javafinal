public class constructer {
    public static void main(String args[]){
        // Student s1 = new Student("isha");
        Student s1 = new Student();
        // System.out.println(s1.name);
        s1.name ="isha";
        s1.roll = 16;
        s1.pwd = "abc";
        s1.marks[0] = 90;
        s1.marks[1] = 100;
        s1.marks[2] = 98;

        Student s2 = new Student(s1); //copied value of s1 in s2    
        s2.pwd = "zyx";
        s1.marks[2] = 100; 

        for(int i=0; i<3; i++){
            System.out.println(s2.marks[i]);
        }
    }
}

    class Student{
        String name;
        int roll;
        String pwd;
        int marks[];

        // shallow copy construstor
        // Student(Student s1){
        //     marks = new int[3];
        //     this.name = s1.name;
        //     this.roll = s1.roll;
        //     this.marks = s1.marks;

        // }

        // deep copy constructor
        Student(Student s1){
            marks = new int[3];
            this.name = s1.name;
            this.roll = s1.roll;
            for(int i=0; i<3; i++){
                this.marks[i] = s1.marks[i];
            }

        }

        // Student(String name){
        //     this.name = name;
        // }

        Student(){
            marks = new int[3];
            // System.out.println("isha");
        }
    }

