public class Person {

    String name;
    String ssn;

    // Constructors
    public Person (String nameIn, String ssnIn)
    {
        name = nameIn; ssn = ssnIn;
    }

    // Note: The superclass has to have a no-parameter constructor
    // b/c a super() (a no-parameter constructor call) is inserted in the subclass by default.
    public Person ()
    {
        name = ssn = "Not intialized";
    }

    // Accessors
    public String getName ()
    {
        return name;
    }

    public String getSSN ()
    {
        return ssn;
    }

    public String getInfo ()
    {
        return "Person: Name=" + name + ", ssn=" + ssn;
    }

    public String toString ()
    {
        return name + ", " + ssn;
    }

    // Testing with a static main()
    public static void main (String[] argv)
    {
        Person p = new Person ("George", "111-11-1234");
        System.out.println (p.getInfo());
    }
}