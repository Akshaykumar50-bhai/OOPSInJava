/*
 * Class in java is template with the help of which we create real world
 * entities known as object that share common characteristics and properities.
 * 
 * Properities of the classes
 * --> Class is not a real world entity.it is just a template or blueprint , or a 
 * prototype from which object are created.
 * --> A class itself does not occupy memory for its attribute sand methods until 
 * object is created.
 * -->A class in java can contain Data members(Instance variables),methods,constructors 
 * Nested classes, and interfaces. 
 * 
 * 
 * 
 * 
 * 
 */
// class decleration 
class Student{
    // instance variables
    int id;
    String name;
    // constructor decleration 
    //   Student(int id,String name){
    //     this.id = id;
    //     this.name = name;
    //   }
}
 // main class 
public class classes {
  public static void main(String[] args) {
    // objects intialization
    Student s1 =new Student();
    // we can  assign values to the objects without using constructor
    s1.name = "Kittu";
    s1.id = 539;
    System.out.println(s1.name); // Kittu
    System.out.println(s1.id); // 539

  }
    
}