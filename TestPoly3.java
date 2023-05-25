class Customer425 extends Person {

    int loyalty;

    public Customer425 (String nameIn, String ssnIn, int loyaltyIn)
    {
        name = nameIn; ssn = ssnIn; loyalty = loyaltyIn;
    }
}

public class TestPoly3 {

    public static void main (String[] argv)
    {
        Customer425 c = new Customer425 ("Zoe", "ssn: 123", 5);
        Person p = new Person ("Gus", "ssn: 456");

        Person p2 = c;
        Customer425 c2 = (Customer425) p2;

        Customer425 c3 = (Customer425) p;
        //System.out.println (c2.name);
        //System.out.println (c2.ssn);
        //System.out.println (c2.loyalty);
    }
}