class Person425 {

    String name;
    String ssn;

    // Constructors
    public Person425 (String nameIn, String ssnIn) {
        name = nameIn;
        ssn = ssnIn;
    }

    // Forced to add this
    // Note: The superclass has to have a no-parameter constructor
    // b/c a super() (a no-parameter constructor call) is inserted in the subclass by default.
    public Person425 ()
    {
    }
}

class Customer425 extends Person425 {

    int loyalty;

    public Customer425 (String nameIn, String ssnIn, int loyaltyIn)
    {
        //Unless explicitly inculded,
        // a super() (a no-parameter constructor call) is inserted in the subclass by default.
        name = nameIn; ssn = ssnIn; loyalty = loyaltyIn;
    }
}

public class TestPoly3 {

    public static void main (String[] argv)
    {
        Customer425 c = new Customer425 ("Zoe", "ssn: 123", 5);
        Person425 p = new Person425 ("Gus", "ssn: 456");

        Person425 p2 = c;
        Customer425 c2 = (Customer425) p2;

        Customer425 c3 = (Customer425) p; // This is supposed to generate a run-time exception
        // b/c p is not a Customer
        //System.out.println (c2.name);
        //System.out.println (c2.ssn);
        //System.out.println (c2.loyalty);
    }
}