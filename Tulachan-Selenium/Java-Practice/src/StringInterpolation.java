public class StringInterpolation {
    public static void main(String args[]){
        String name = "Kevin";
        int age = 35;
        String city= "Tokyo";

        System.out.println(String.format("Student details: Name: %s, Age: %d, City: %s", name, age, city ));
    }
}
