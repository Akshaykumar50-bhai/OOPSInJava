/*
 * Method Overloading
 * ---------------------
 * Defination:
 * Method OVerloading in java is a feature that allows a
 * class to have more than one method with same name but different
 * parameter lists (different number of parameter or different types of 
 * parameters).
 * 
 * KEY POINTS
 * -----------
 * -->Method must have same name
 * -->They must differ in number or type of parameter.
 * -->Return type alone cannot overloaded methods.
 */

 class Product{
    int multiply(int a,int b){
        return a*b;
    }
    int multiply(int a,int b,int c){
        return a*b*c;
    }
    int multiply(int a,int b,int c,int d){
        return a*b*c*d;
    }
 }
 
public class MethodOverloading {
    public static void main(String[] args) {
        Product p1 = new Product();
        p1.multiply(10, 20);
        System.out.println(p1.multiply(10, 20)+p1.multiply(10, 20,30)+p1.multiply(10, 20,30,40));
    }
}
