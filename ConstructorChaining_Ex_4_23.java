class A {

    int i;

    public A (int k)
    {
        i = k;
    }
}

class B extends A {

    double x;

    // A default constructor for class B is created.
    // This default constuructor will create the call to super () to use
    // A's no-parameter constructor.

    // But A does not have have a no-parameter constructor. A compiler error!
}


public class ConstructorChaining_Ex_4_23 {

    public static void main (String[] argv)
    {
        B x = new B ();
    }
}