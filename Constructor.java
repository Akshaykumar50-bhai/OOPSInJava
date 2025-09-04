/*
 * Constructors
 * ------------------
 * In java , Constructor paly an important role in object creation . A constructor is a
 * special block of code that is called when object is created. Its main job is to
 * intialize the object . to set up its internal state , or assign default values to its
 * attributes. This process happens automatically when we use the "new " keyword to
 * create an object
 * 
 * Characteristics of Constructor
 * ------------------------------
 * -->Same Name
 * ----------
 * A constructor has the same name as the class in which it is defined 
 * 
 * -->No Return type
 * --------------
 * A Constructor do not have any return type , not even void . The main purpose of 
 * constructor is to initialize the objects , not to return value.
 * 
 * -->Automatically Called on object 
 * ----------------------------------
 * When an object of a class is created , the contructor is automatically to initialze the
 * objects attributes.
 * 
 * -->Used to set initial values for object Attributes
 * ----------------------------------------------------
 * Constructor are primarily used to set the intial values of an objects when is created
 */
class Person{
    String name ;
    int age;
    char gender;
    // intialization of constructor
    Person(String name,int age,char gender){
        // intialize the attributes using constructor
        this.name = name;
        this.age = age;
        this.gender = gender;
        }

    // Intialization of methods
    void getPersonDetails(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Gender: "+gender);
    }
        
    }

public class Constructor {
    public static void main(String[] args) {
        // creating a object using "new" key word
        Person p1 = new Person("Akshay", 20, 'M');
        p1.getPersonDetails();
        
    }
}
