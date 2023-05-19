class Customer extends Person {

    int loyalty; // New data, found only here in Customer

    // New constructor
    public Customer (String nameIn, String ssnIn, int loyaltyIn)
    {
        name = nameIn; ssn = ssnIn; loyalty = loyaltyIn;
    }

    // Override getInfo()
    public String getInfo ()
    {
        return "Customer: name=" + name + ", " + loyalty + " years with the company";
    }

    // A new method
    public double discountRate ()
    {
        if ( (loyalty >= 1) && (loyalty < 5) ) {
            return 0.95;
        }
        else if ( (loyalty >= 5) && (loyalty < 10) ) {
            return 0.75;
        }
        else {
            return 1.0;
        }
    }
}

class Employee extends Person {

    int salary;

    // New constructor
    public Employee (String nameIn, String ssnIn, int salaryIn) {
        name = nameIn;
        ssn = ssnIn;
        salary = salaryIn;
    }

    // Override getInfo()
    public String getInfo ()
    {
        return "Employee: name=" + name + ", salary=" + salary;
    }
}

public class TestPoly {

    public static void main (String[] arg)
    {
        // Typical inheritance

        Customer c = new Customer ("John", "123-12-1234", 2);
        System.out.println (c.getInfo()); // getInfo() in Customer

        Employee e = new Employee ("Paul", "234-23-2345", 50000);
        System.out.println (e.getInfo()); // getInfo() in Employee

        // Polymorphism

        Person p1, p2, p3, p4;

        // Pointing to Person instances
        p1 = new Person ("George", "345-45-3456");
        p2 = new Person ("Ringo", "456=45-4567");

        // Pointing to subclass instances
        p3 = c;
        p4 = e;

        System.out.println ("\nPerson data: ");

        // getInfo() in Person
        System.out.println (p1.getInfo());
        System.out.println (p2.getInfo());

        // getInfo() in Customer
        System.out.println (p3.getInfo());

        // getInfo() in Employee
        System.out.println (p4.getInfo());
    }
}

