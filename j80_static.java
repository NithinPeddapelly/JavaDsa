public class j80_static{
    public static void main(String args[]){
        Student s1 = new Student();
        s1.School_Name = ""
    }
}

class Student{
    String name;
    int roll;

    static String School_Name;

    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
}