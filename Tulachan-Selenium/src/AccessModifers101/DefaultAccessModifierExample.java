package AccessModifers101;

import accessModifiers.Person;

public class DefaultAccessModifierExample {
    public static void main(String args[]){
        Person person1 = new Person();
        // person1.greet("Johnny"); --cannot access default method in different package
    }
}
