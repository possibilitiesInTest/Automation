package AccessModifers101;

import AccessModifiers201.Employee;

public class AccessModifierExample extends Employee {
    public static void main(String args[]){
        Employee empl1 = new Employee();
       // private method cannot be accessed outside the class
        // empl1.displayEmployeeName("danny");

        // cannot use default method outside of original package
        // empl1.displayEmployeeId(122);

        // access to protected method through child class
        AccessModifierExample e1 = new AccessModifierExample();
        e1.displayEmployeeSalary(65000);

        // access to public method
        empl1.displayEmployeeBenefits(25);
    }
}
