package Customers;

public class Person{
    // Atributes
    private String name;
    private int age;
    
    // Constructors
    public Person(){
        this.name = "";
        this.age = 0;
    }
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    // Set Methods
    protected void setName(String name){
        this.name = name;
    }
    protected void setAge(int age){
        this.age = age;
    }
    
    // Get Methods
    protected String getName(){
        return this.name;
    }
    protected int getAge(){
        return this.age;
    }
    
    // toString Method
    @Override
    public String toString(){
        String str = "-----Person Info-----\nName:\t" + getName() + "\nAge:\t" +getAge();
        return str;
    }
}