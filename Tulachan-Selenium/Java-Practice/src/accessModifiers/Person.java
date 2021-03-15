package accessModifiers;

public class Person {
    int age = 40;

    // default method = no private, public, protected modifier
    void greet(String name){
        System.out.println("Hello, "+ name);
    }
}
