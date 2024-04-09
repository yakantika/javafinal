public class skeyword {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.schoolname = "kv"; //we set schoolname for s1

        Student s2 = new Student();
        System.out.println(s2.schoolname); //when we r trying to get school name of s2 we are getting the same as s1
    }
}

class Student{
    String name;
    int roll;

    static String schoolname;

    void setschool(String name){
        this.name = name;
    }

    String getname(){
        return this.name;
    }
}
