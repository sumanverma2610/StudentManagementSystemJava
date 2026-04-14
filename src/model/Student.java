package model;

public class Student extends Person{

    private int age;

   public Student(int id , String name, int age){
        super(id , name);
        this.age= age;
    }


    public int getAge(){
        return age ;
    }

    public void setAge(int age){
        this.age=age;
    }

    @Override
    public void display(){
        System.out.println("ID :" + id);
        System.out.println("Name :" + name);
        System.out.println("Age :" + age);
    }
}
