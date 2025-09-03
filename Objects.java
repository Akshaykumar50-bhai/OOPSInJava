/*
 * Objects are the instances of a class that are created to use the attributes and methods
 *  of a class. A typical Java program creates many objects, which as you know, interact by
 *  invoking methods. An object consists of:
 * 
 * State
 * ---------------
 * --> It represented by attributes of an object.It also reflects the properties
 * of an object
 * Behavior
 * ----------------
 * --> It is represented by attributes of an object. It also reflect the properties
 * of an object
 * Identity
 * -----------------
 * It gives a unique name to an object and enables one to interact with other objects.
 */
 
class Dog{
    // Instance Variables
    String name;
    String breed;
    int age;
    String color;
 
    // constructor Decleration of class
    Dog(String name,String breed,int age,String color){
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

    void getDogDetails(){
        System.out.println("Name: " + name);
        System.out.println("Breed: "+ breed);
        System.out.println("Age: "+age);
        System.out.println("Color: "+ color);
    }
}

public class Objects {
    public static void main(String[] args) {
        // object intialisation
        Dog d1 = new Dog("Tommy","Lab", 2, "white");
        d1.getDogDetails();
    }
    
}
