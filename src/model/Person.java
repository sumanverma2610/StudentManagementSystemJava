package model;

abstract public class Person {
    protected String name;
   protected int id ;
    abstract void display();
    Person(int id, String name){
        this.id= id;
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public int getId(){
        return id ;
    }
    public void setId(int id){
        this.id=id ;
    }
    public void setName(String name){
        this.name=name;
    }
}
