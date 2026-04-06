package oops;

class student{
    int id ; 
    int rollNo ;
    String name;
}


public class main {
    public static void main(String args[]){
        student s1 = new student();
        s1.id = 1; 
        s1.rollNo = 380;
        s1.name = "Rahul";

        System.out.println("id :" + s1.id);
        System.out.println("Roll No : " + s1.rollNo);
        System.out.println("Name : " + s1.name);

        student s2 = new student();
        s2.id = 2;
        s2.rollNo = 381 ;
        s2.name = "Sachin";

        System.out.println("id :" + s2.id);
        System.out.println("Roll No : " + s2.rollNo);
        System.out.println("Name : " + s2.name);

    }
}
