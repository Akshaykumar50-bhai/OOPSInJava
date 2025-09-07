/*
 *Encapsulation
* ---------------------------
   In java , encapsulation is one of the core concept of object oriented programmming(OOP)
   Defination:
    Enacpsulation means hiding the internal details (data) of a class and only allowing access 
    through methods (getters & setters).
    Encapsulation is used to hide the implementation part and show the functionality for better 
    readability and usability. 

    USES OF ENCAPSULATION 
    -----------------------
    -->Data Hiding : The internal data is hidden from the outside world, preventing direct 
    access.
    -->Data Integrity : Only validated or safe values can be assigned to an object's attributes
    via setter methods 
    -->Reusability : Encapsulated code is more flexible and reusable for future modification or 
    requirements.
    -->Security : Sensitive data is protected as it cannot be accessed directly.

 */
class Student{
    // private variables declared
    // these can only be accessed by
    // public methods of class
    private String name;
    private int age;
    
    public Student(String name,int age){
        this.name = name;
        if(age > 0){
            this.age = age;
        }else System.out.println("In valid age");
    }

    //Getters
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }


    //setters
    public void setName(String name){
            this.name = name;
    }

    public void setAge(int age){
        if(age>0 ) this.age =age;
        else System.out.println("Invalid age");
    }
}

public class Encapsulation {
    public static void main(String[] args ){
        Student s1 = new Student("Akshay",20);
         System.out.println("Name: "+s1.getName());
         System.out.println("Age: "+s1.getAge());
         //setting the values of the variables
         s1.setName("Akshaya");
         s1.setAge(-1);
         // getting the values from the getters
         System.out.println("Name: "+s1.getName());
         System.out.println("Age: "+s1.getAge());
         
    }
}
