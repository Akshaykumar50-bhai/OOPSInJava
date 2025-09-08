/*  Inheritance
   ---------------
   Java Inheritance is a fundamental concept OOPS.
Defination:
   It is the mechanism in java by which one class is allowed to inherit the feature 
   (fields and methods) of another class. 
   In java creating new classes based on exisiting ones. A class that inherits from another
   class can reuse the methods and fields of the class.
 * 
 * Types of Inheritence in java
 * -----------------------------
 * 1.Single : One class inherits another
 * 2.Multilevel : Class B extends A,Class C extends B.
 * 3. Hierarchical : Multiple classes extend the same parent.
 * 4. Multiple Inheitence 
 * 5. Hybrid Inheritence
 */
class Person{
    String name;
    int age;
    char gender;
    Person(){

    }
    Person(String name,int age ,char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    void walk(){
        System.out.println("Walking");
    }
    void read(){
        System.out.println("Reading");

    }

    void showPersonDetails() {
    System.out.println("Name is: " + name);
    System.out.println("Age is: " + age);
    System.out.println("Gender is: " + gender);
  }
}
class employee extends Person{
    int emplyId;
    double salary;
    employee(String name ,int age,char gender , int emplyId,double salary){
        super(name,age,gender);
        this.emplyId = emplyId;
        this.salary = salary;
    }
    void applyLeave(){
        System.out.println("Applying for the Leave");
    }
    void getPromoted(){
        System.out.println("You are promoted");
    }
    void showEmployeeDetails() {
      showPersonDetails();
      System.out.println("Employee id: " + emplyId);
      System.out.println("Salary is: " + salary);
       
    }
}

class Student extends Person{
    String rollNumber;
    Double cgpa;
    String branch;
    double fee;
    Student(String name,int age,char gender,String rollNumber,double cgpa,String branch){
        super(name, age, gender);
        this.rollNumber = rollNumber;
        this.branch = branch;
        this.cgpa = cgpa;
    }
    void attendExams(){
     System.out.println("Attending exam....");
    }
    void showStudentDetails() {
    showPersonDetails();
    System.out.println("Roll Number is: " + rollNumber);
    System.out.println("Branch is: " + branch);
    System.out.println("CGPA is: " + cgpa);
}
}

public class inheritence {
      static void fun(Person p){
    if(p instanceof employee){
      ((employee)p).showEmployeeDetails();
    }else if(p instanceof Student){
      ((Student)p).showStudentDetails();
    }
  }

    public static void main(String[] args) {
        employee e1 = new employee("Alice", 20, 'F', 123, 50000);
    e1.showEmployeeDetails();
    Student s1 = new Student("Bob", 15, 'M', "24P31Axxxx",7.8, "CSE");
    s1.showStudentDetails();
    Person p1 = new Person("Charlie", 45, 'M');
    p1.showPersonDetails();

    Person p2 = new employee("Kittu", 30, 'M', 134, 6000000);
    ((employee)p2).showEmployeeDetails();
    Person s2 = new Student("Vivek",20,'M',"24P31A05D8",8.5,"CSE");
    ((Student)s2).showStudentDetails();
    fun(p2);
    fun(s2);
    }
}
