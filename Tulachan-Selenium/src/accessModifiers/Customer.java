package accessModifiers;

public class Customer {
    private int age = 40;
    private void msg(String name){
        System.out.println(String.format("Hellp, %s", name));
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class PrivateExample{
    public static void main(String args[]){
        Customer customer1 = new Customer();
        System.out.println(customer1.getAge());
       // customer1.msg("John"); --cannot access msg() due to private modifier

    }
}