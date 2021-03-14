package AccessModifiers201;

public class Employee {

    private void displayEmployeeName(String name){
        System.out.println("My nameis: " + name);
    }

    void displayEmployeeId(int id){
        System.out.println("My employee id is: " + id);
    }

    protected void displayEmployeeSalary(double salary){
        System.out.println("Salary is " + salary);
    }

    public void displayEmployeeBenefits(double insurancePercentage){
        System.out.println("Employee only need to pay %s of their hospital cost " + insurancePercentage);
    }

    public static void main(String args[]){
        // private method used in the same class
        Employee empl1 = new Employee();
        empl1.displayEmployeeName("Janny");
    }
}
