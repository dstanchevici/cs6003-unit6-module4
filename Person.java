public class Person {

    String name;
    String ssn;

    // Constructors
    public Person (String nameIn, String ssnIn)
    {
        name = nameIn; ssn = ssnIn;
    }

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