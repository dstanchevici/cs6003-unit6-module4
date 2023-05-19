class PersonV2 extends Person {

    // The parent class's (Person's) data and methods are inherited

    // New data
    int age;

    // New constructor
    public PersonV2 (String nameIn, String ssnIn, int ageIn)
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

    // Testing
    public static void main (String[] argv)
    {
        PersonV2 p = new PersonV2 ("Elaine", "333-33-4567", 35);
        System.out.println (p.getInfo() + ", age=" + p.getAge());
    }
}