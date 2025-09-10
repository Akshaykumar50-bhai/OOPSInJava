/*
 * Method Overriding 
 * -------------------
 * Method Overiding in java happens when a subclass provides 
 * its own implementation of a method is already defined in its 
 * parent class
 * 
 * --->The method in the child class must have the same name,
 * return type, and parameters as in the parent class
 * 
 * --->It is an example of runtime polymorphism.
 * 
 * Rules for method overriding
 * ---------------------------
 * -->Must have same method name.

  --->Must have same parameters (same signature).

   -->Return type must be the same (or a subtype – called covariant return type).

   -->The overriding method cannot have a lower access modifier.
      (e.g., if parent method is public, child method can’t be private.)

   --->Only inherited methods can be overridden (constructors cannot).

    --->If a method is final or static, it cannot be overridden.
 */
class Animal{
    void makesound(){
        System.out.println("Animal making sound");
    }
}
 
class Dog extends Animal{
    @Override // while overriding a method we need to use this keyword
    void makesound(){
        System.out.println("bhow bhow");
    }
}

class methodOVerriding{
  public static void main(String[] args) {
    Animal a1 = new Dog();
    a1.makesound();
  }
}