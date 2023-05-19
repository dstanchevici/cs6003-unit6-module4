class PersonV3 extends Person {

    // New data
    int age;

    // New constructor
    public PersonV3 (String nameIn, String ssnIn, int ageIn)
    {
        name = nameIn;
        ssn = ssnIn;
        age = ageIn;
    }

    // New accessor
    public int getAge ()
    {
        return age;
    }

    // Overriding Person's getInfo() method
    public String getInfo ()
    {
        return "PersonV3: name=" + name + ", ssn=" + ssn + ", age=" + age;
    }

    // Testing
    public static void main (String[] argv)
    {
        PersonV3 p = new PersonV3 ("Kramer", "666-66-1234", 38);

        // This class's getInfo() overrides the superclass's getInfo()
        System.out.println (p.getInfo());
        System.out.println (p);
    }
}