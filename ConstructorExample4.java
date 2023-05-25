
class Person {

    String name;
    String ssn;

    public Person (String nameIn, String ssnIn)
    {
        name = nameIn; ssn = ssnIn;
        System.out.println ("Person constructor");
    }

}

class Employee extends Person {

    int salary;

    public Employee (String nameIn, String ssnIn, int salaryIn)
    {
        super (nameIn, ssnIn);
        salary = salaryIn;
        System.out.println ("Employee constructor");
    }

}

class Consultant extends Employee {

    public Consultant (String nameIn, String ssnIn, int salaryIn) {

        super(nameIn, ssnIn, salaryIn);

        System.out.println("Consultant constructor");

        if (salaryIn < 500_000) {
            System.out.println("Salary too low");
            System.exit(0);
        }
    }
}


public class ConstructorExample4 {

    public static void main (String[] argv)
    {
	    Consultant c = new Consultant ("Exorbitant Ed", "111-22-7777", 50);
    }

}
